package com.example.Social.media.Controller;

import com.example.Social.media.Service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Social.media.Entity.Post;
import payload.PostPayload;


import java.util.List;
@RequiredArgsConstructor
@Slf4j
@RestController

public class PostController {
    //creating a reference to the post service

    private final PostService postService;


    @PostMapping(value = "/save")
    public PostPayload submitPost(@RequestBody PostPayload postPayload) {
        postService.submitPostToDB(postPayload);
        return postPayload;
    }
    @GetMapping (value = "/getPost")
    public List<Post> retrieveAllPost(){
        List<Post> result=postService.retrievePostFromDB();
      return result;
    }
    @DeleteMapping(value = "/delete/{postID}")
    public List<Post> deleteParticularPost(@PathVariable("postId")Long postID) {
        List<Post> result=postService.deletePostFromDB(postID); //you must pass in the unique Id on our Path variable we call the service class for the delete method and delete
        return result;
    }
}
