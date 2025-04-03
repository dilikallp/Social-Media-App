package com.example.Social.media.Service;

import com.example.Social.media.Entity.Post;
import com.example.Social.media.Repository.PostRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import payload.PostPayload;
//this class is for submitting the data into the database and service the controller when it calls on the method here.

import java.time.LocalDateTime;

import java.util.List;



@Service
public class PostService {
    @Autowired
    PostRepo postRepo;

    public void submitPostToDB(PostPayload postPayload){
var post = Post.builder()
        .likes(postPayload.getLike())
        .build();
     postRepo.save(post);

    }
    public List<Post> retrievePostFromDB() {

        return postRepo.findAll();

    }

//    public List<Post> updatePostOnDB() {
//        return postRepo.findAl();
//    }
    public List<Post> deletePostFromDB(Long postID) {
        postRepo.deleteById(postID);
        return postRepo.findAll();
    }
}
