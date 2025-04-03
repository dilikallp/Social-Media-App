package com.example.Social.media.Entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;


@Builder
@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="userID")
    private String userID;

    @Column(name="userName")
    private String userName;

    @Column(name="imageURL")
    private String imageURL; //user attributes for posting into o

    @Column(name="description")
    private String description; //attributes related to the post.

    @Column(name="postImgURL")
    private String postImgURL;

    @Column(name="likes")
    private int likes;

    @Column(name="dateTime")
    private LocalDateTime dateTime;

    public Post() {
    }
//inbound and outbound payload
    public Post(Long id, String userID, String userName, String imageURL, String description, String postImgURL, int likes, LocalDateTime dateTime) {
        this.id = id;
        this.userID = userID;
        this.userName = userName;
        this.imageURL = imageURL;
        this.description = description;
        this.postImgURL = postImgURL;
        this.likes = likes;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostImgURL() {
        return postImgURL;
    }

    public void setPostImgURL(String postImgURL) {
        this.postImgURL = postImgURL;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
