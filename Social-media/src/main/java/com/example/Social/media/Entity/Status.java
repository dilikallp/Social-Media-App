package com.example.Social.media.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "statuses")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="userID")
    private String userID;

    @Column(name="statusImageURL")
    private String statusImageURL;

    @Column(name="uploadTIme")
    private LocalDateTime uploadTIme;

    public Status() {

    }

    public Status(String userID, String statusImageURL, LocalDateTime uploadTIme) {

        this.userID = userID;
        this.statusImageURL = statusImageURL;
        this.uploadTIme = uploadTIme;
    }



    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getStatusImageURL() {
        return statusImageURL;
    }

    public void setStatusImageURL(String statusImageURL) {
        this.statusImageURL = statusImageURL;
    }

    public LocalDateTime getUploadTIme() {
        return uploadTIme;
    }

    public void setUploadTIme(LocalDateTime uploadTIme) {
        this.uploadTIme = uploadTIme;
    }
}
