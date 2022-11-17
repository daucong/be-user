package com.example.beuser.controller;

import com.example.beuser.entity.User;
import com.example.beuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> list() {
        return userService.getAllUser();
    }

    @PostMapping("")
    public void addUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Integer id) {
        return userService.findUserById(id);
    }

    @DeleteMapping("/{id}")
    public void DeleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }
}