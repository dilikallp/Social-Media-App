package com.example.Social.media.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
@Entity
@Table(name = "Comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentID;

    private String postID;
    private String userID;

    private String userImage;
    private String userName;

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String comnt;
    private Timestamp timestamp;

    public Comment() {

    }

    public Comment(Long commentID, String postID, String userID, String userImage, String userName, String comment, Timestamp timestamp) {
        this.commentID = commentID;
        this.postID = postID;
        this.userID = userID;
        this.userImage = userImage;
        this.userName = userName;
        this.comnt = comment;
        this.timestamp = timestamp;
    }

    public Long getCommentID() {
        return commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getComment() {
        return comnt;
    }

    public void setComment(String comment) {
        this.comnt = comment;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}