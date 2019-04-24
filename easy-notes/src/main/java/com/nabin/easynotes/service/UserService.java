package com.nabin.easynotes.service;

import com.nabin.easynotes.request.UserRequest;
import com.nabin.easynotes.resource.UserResource;

import java.util.List;

public interface UserService {

    UserResource addNewUser(UserRequest userRequest);

    List<UserResource> getAllUsers();

    List<UserResource> getAllActiveUsers();
}
