package com.example.Social.media.Service;

import com.example.Social.media.Entity.Status;
import com.example.Social.media.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StatusService {
    @Autowired
   private StatusRepository statusRepository;

    public Status saveStatus(Status status) {

            return statusRepository.save(status);
    }

    public List<Status> getAllStatus(){

        return statusRepository.findAll();
    }
}
