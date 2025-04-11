package com.boeken.boeken.services;

import com.boeken.boeken.models.User;
import com.boeken.boeken.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return null;
    }
}
