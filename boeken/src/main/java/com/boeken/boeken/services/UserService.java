package com.boeken.boeken.services;

import com.boeken.boeken.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User create(User user);
}
