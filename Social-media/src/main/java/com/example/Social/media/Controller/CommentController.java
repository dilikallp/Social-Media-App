package com.example.Social.media.Controller;
import com.example.Social.media.Entity.Comment;


import com.example.Social.media.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/commentService")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment) {

        return commentService.saveComment(comment);
    }

    @GetMapping("/getAllComments/{postID}")
    public List<Comment> getAllComments(@PathVariable("postID") String postID){
        return commentService.getAllComment(postID);

    }
}