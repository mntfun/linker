package com.linker.model;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private String id;

    private String commentsContent;

    private Boolean commentsStatus;

    private Date createdAt;

    private String parentCommentId;

    private Integer postId;

    private Integer userId;

    private String imgUrl;

    private Integer commentLikenum;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCommentsContent() {
        return commentsContent;
    }

    public void setCommentsContent(String commentsContent) {
        this.commentsContent = commentsContent == null ? null : commentsContent.trim();
    }

    public Boolean getCommentsStatus() {
        return commentsStatus;
    }

    public void setCommentsStatus(Boolean commentsStatus) {
        this.commentsStatus = commentsStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(String parentCommentId) {
        this.parentCommentId = parentCommentId == null ? null : parentCommentId.trim();
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getCommentLikenum() {
        return commentLikenum;
    }

    public void setCommentLikenum(Integer commentLikenum) {
        this.commentLikenum = commentLikenum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commentsContent=").append(commentsContent);
        sb.append(", commentsStatus=").append(commentsStatus);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", parentCommentId=").append(parentCommentId);
        sb.append(", postId=").append(postId);
        sb.append(", userId=").append(userId);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", commentLikenum=").append(commentLikenum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}