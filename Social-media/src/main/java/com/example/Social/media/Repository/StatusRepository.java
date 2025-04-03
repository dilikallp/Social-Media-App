package com.example.Social.media.Repository;

import com.example.Social.media.Entity.Post;
import com.example.Social.media.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {

}
