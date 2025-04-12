package com.boeken.boeken.controllers;

import com.boeken.boeken.models.User;
import com.boeken.boeken.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(User.class);

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        if (user == null) {
            logger.error("user must not be null");
        }
        User createdUser = userService.create(user);
        logger.info("User:[id:{}, username:{}] Successfully created!", user.getId(), user.getUsername());
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
