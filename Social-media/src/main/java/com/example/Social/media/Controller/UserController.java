package com.example.Social.media.Controller;


import com.example.Social.media.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.Social.media.Entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/api/userService")//end point for this api is api/user
public class UserController {
    @Autowired
    UserService userService;
//the bottom is a payload for our
    @PostMapping(value = "/save")
    public User saveUserMetaData(@RequestBody User user) { //these methods are for retrieval and posting of the service class

        return userService.submitMetaDataOfUser(user);
    }
    @GetMapping(value = "/getUserDetails")
        public List<User> getAllUserDetails() {

        return userService.retrieveAllUserDetails();
    }
    @GetMapping(value = "/getAllUsers/{userID}")
            public User getUserDetails(@PathVariable("userID") Long userID) {
        return new User();
    }    }

