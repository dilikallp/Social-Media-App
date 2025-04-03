package com.example.Social.media.Service;


import java.util.ArrayList;

import java.util.UUID;
import com.example.Social.media.Entity.Comment;

import com.example.Social.media.Repository.CommentRepo;
import com.example.Social.media.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Autowired
    UserService userService;

    public Comment saveComment(Comment comment) {

        return comment;
    }

    public ArrayList<Comment> getAllComment(String postID){
        ArrayList<Comment> result=new ArrayList<Comment>();
        result=commentRepo.findAllByPostID(postID);
        return result;
    }
}
