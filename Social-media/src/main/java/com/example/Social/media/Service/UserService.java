package com.example.Social.media.Service;

import com.example.Social.media.Entity.User;
import com.example.Social.media.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service //this class handles all the urls, we have in our controller class
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User submitMetaDataOfUser(User user) {

        user.setActivity(true);
        user.setJoiningDate(LocalDateTime.now());

        return userRepository.save(user);
    }
    public List<User> retrieveAllUserDetails(){

        return userRepository.findAll();
    }
    public Optional<User> getUserData(Long userID) {

        return userRepository.findById(userID);
    }
    //dont for get delete method
}
