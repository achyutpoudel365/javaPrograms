package com.nabin.easynotes.converter;

import com.nabin.easynotes.model.User;
import com.nabin.easynotes.resource.UserResource;

import java.util.List;

public interface UserConverter {
    UserResource convertToUserResouce(User savedUser);

    List<UserResource> convertAllUsers(List<User> userList);
}
