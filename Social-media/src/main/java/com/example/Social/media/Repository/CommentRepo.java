package com.example.Social.media.Repository;


import com.example.Social.media.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {

    ArrayList<Comment> findAllByPostID(String postID);
}