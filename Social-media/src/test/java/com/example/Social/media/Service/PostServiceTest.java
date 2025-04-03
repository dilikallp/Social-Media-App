package com.example.Social.media.Service;

import com.example.Social.media.Entity.Post;
import com.example.Social.media.Repository.PostRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import payload.PostPayload;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PostService.class)
@ActiveProfiles("test")

class PostServiceTest {
@MockBean
private PostRepo postRepo;
@Autowired
private PostService postService;
private Post post;
private PostPayload payload;

@BeforeEach
void setup(){
    payload = new PostPayload();
//payload.setLike(8);
payload.setDate(LocalDateTime.now());
payload.setReference(78);
post = new Post();
//    post.setLikes(8);
    post.setDateTime(LocalDateTime.now());


}
    @Test
    void submitPostToDB() {
        post.setLikes(8);
        post.setDateTime(LocalDateTime.now());
   when(postRepo.save(post)).thenReturn(any());
    postService.submitPostToDB(payload);

    }

    @Test
    void retrievePostFromDB() {
    }

    @Test
    void deletePostFromDB() {
    }
}