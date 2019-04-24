package com.nabin.easynotes.controller;

import com.nabin.easynotes.request.UserRequest;
import com.nabin.easynotes.resource.UserResource;
import com.nabin.easynotes.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/users")
    public UserResource addNewUser(@RequestBody UserRequest userRequest) {
        return userService.addNewUser(userRequest);
    }

    @GetMapping(value = "/users")
    public List<UserResource> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/users/active")
    public List<UserResource> getAllActiveUsers() {
        return userService.getAllActiveUsers();
    }
}
