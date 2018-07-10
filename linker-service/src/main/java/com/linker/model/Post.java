package com.linker.model;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {
    private Integer id;

    private Integer userId;

    private String post;

    private Date createdAt;

    private Integer postCollectnum;

    private Integer postLikenum;

    private Integer postCommentnum;

    private Integer postReadnum;

    private String imgUrl;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getPostCollectnum() {
        return postCollectnum;
    }

    public void setPostCollectnum(Integer postCollectnum) {
        this.postCollectnum = postCollectnum;
    }

    public Integer getPostLikenum() {
        return postLikenum;
    }

    public void setPostLikenum(Integer postLikenum) {
        this.postLikenum = postLikenum;
    }

    public Integer getPostCommentnum() {
        return postCommentnum;
    }

    public void setPostCommentnum(Integer postCommentnum) {
        this.postCommentnum = postCommentnum;
    }

    public Integer getPostReadnum() {
        return postReadnum;
    }

    public void setPostReadnum(Integer postReadnum) {
        this.postReadnum = postReadnum;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", post=").append(post);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", postCollectnum=").append(postCollectnum);
        sb.append(", postLikenum=").append(postLikenum);
        sb.append(", postCommentnum=").append(postCommentnum);
        sb.append(", postReadnum=").append(postReadnum);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}