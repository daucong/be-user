package com.example.beuser.service;

import com.example.beuser.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();

    User saveUser(User user);

    void deleteUser(Integer id);

    User findUserById(Integer id);
}
