package com.example.Social.media.Repository;

import com.example.Social.media.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {
    @Override
    Optional<Post> findById(Long aLong);
}
