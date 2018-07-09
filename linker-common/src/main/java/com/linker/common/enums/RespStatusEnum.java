package com.linker.common.enums;

/**
 * 响应状态
 * Created by dentalulcer on 05/07/2018.
 */
public enum RespStatusEnum {

    OK(200, "请求成功"),
    BAD_REQUEST(400, "请求语法错误"),
    UNAUTHORIZED(401, "访问被拒绝，请登录"),
    FORBIDDEN(403, "权限不足"),
    NOT_FOUND(404, "请求资源不存在"),
    METHOD_NOT_ALLOWED(405, "请求方法错误"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
    BAD_GATEWAY(502, "网关错误"),
    SERVICE_UNAVALIABLE(503, "服务不可用"),
    GATEWAY_TIMEOUT(504, "网关超时");

    private Integer status;
    private String message;

    RespStatusEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}
