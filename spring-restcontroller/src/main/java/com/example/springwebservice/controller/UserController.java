package com.example.springwebservice.controller;

import com.example.springwebservice.model.User;
import com.example.springwebservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
//http://localhost:8080/api/v1/user
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public List<User> getAllUsers() {

        return this.userService.getAllUsers();


    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        //url:localhost:8080/api/v1/user/1
        User user = this.userService.getUser(id);
        return user;
    }

    @PostMapping()
    public User createUser(@RequestBody User user) {
        User createUser = this.userService.createUser(user);
        return createUser;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        User updatedUser = this.userService.updateUser(id, user);
        return updatedUser;
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable int id) {
        User deleteUser = this.userService.deleteUser(id);
        return deleteUser;
    }
} // Class end
