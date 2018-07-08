package com.linker.common.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClock;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class JwtTokenUtil implements Serializable {

    private static final long serialVersionUID = -3301605591108950415L;
    private static final Clock clock = DefaultClock.INSTANCE;

    private static final String secret = "linker_jwt";

    // 过期时间一个月
    // private static final Long expiration = 30 * 24 * 3600L;
    // TODO 暂时设置为30分钟
    private static final Long expiration = 1800L;

    public static final String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    public static final Date getIssuedAtDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getIssuedAt);
    }

    public static final Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public static final <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private static final Claims getAllClaimsFromToken(String token) {
        return Jwts.parser()
            .setSigningKey(secret)
            .parseClaimsJws(token)
            .getBody();
    }

    private static final Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(clock.now());
    }

    private static final Boolean isCreatedBeforeLastPasswordReset(Date created, Date lastPasswordReset) {
        return (lastPasswordReset != null && created.before(lastPasswordReset));
    }

    private static final Boolean ignoreTokenExpiration(String token) {
        // here you specify tokens, for that the expiration is ignored
        return false;
    }

    public static final String generateToken(String userName) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userName);
    }

    private static final String doGenerateToken(Map<String, Object> claims, String subject) {
        final Date createdDate = clock.now();
        final Date expirationDate = calculateExpirationDate(createdDate);

        return Jwts.builder()
            .setClaims(claims)
            .setSubject(subject)
            .setIssuedAt(createdDate)
            .setExpiration(expirationDate)
            .signWith(SignatureAlgorithm.HS512, secret)
            .compact();
    }

    public static final Boolean canTokenBeRefreshed(String token, Date lastPasswordReset) {
        final Date created = getIssuedAtDateFromToken(token);
        return !isCreatedBeforeLastPasswordReset(created, lastPasswordReset)
            && (!isTokenExpired(token) || ignoreTokenExpiration(token));
    }

    public static final String refreshToken(String token) {
        final Date createdDate = clock.now();
        final Date expirationDate = calculateExpirationDate(createdDate);

        final Claims claims = getAllClaimsFromToken(token);
        claims.setIssuedAt(createdDate);
        claims.setExpiration(expirationDate);

        return Jwts.builder()
            .setClaims(claims)
            .signWith(SignatureAlgorithm.HS512, secret)
            .compact();
    }

    public static final Boolean validateToken(String token, String userName, Date lastPasswordResetDate) {
        final String username = getUsernameFromToken(token);
        final Date created = getIssuedAtDateFromToken(token);
        //final Date expiration = getExpirationDateFromToken(token);
        return (
            username.equals(userName)
                && !isTokenExpired(token)
                && !isCreatedBeforeLastPasswordReset(created, lastPasswordResetDate)
        );
    }

    private static final Date calculateExpirationDate(Date createdDate) {
        return new Date(createdDate.getTime() + expiration * 1000);
    }
}
