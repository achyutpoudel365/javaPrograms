package com.nabin.easynotes.service;

import com.nabin.easynotes.converter.UserConverter;
import com.nabin.easynotes.model.User;
import com.nabin.easynotes.model.UserStatus;
import com.nabin.easynotes.repository.UserRepository;
import com.nabin.easynotes.request.UserRequest;
import com.nabin.easynotes.resource.UserResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserConverter userConverter;

    public UserServiceImpl(UserRepository userRepository,
                           UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    @Override
    public UserResource addNewUser(UserRequest userRequest) {
        log.info("Adding new user with request :: {}", userRequest.toString());
        User user = new User();
        user.setName(userRequest.getUserName());
        user.setPassword("test12");
        user.setStatus(UserStatus.ACTIVE);
        User savedUser = userRepository.save(user);
        return userConverter.convertToUserResouce(savedUser);
    }

    @Override
    public List<UserResource> getAllUsers() {
        log.info("Finding all users ..");
        List<User> userList = userRepository.findAll();
        return userConverter.convertAllUsers(userList);
    }

    @Override
    public List<UserResource> getAllActiveUsers() {
        log.info("Feching all active users ...");
        List<User> activeUsers = userRepository.findAllActiveUser();
        return userConverter.convertAllUsers(activeUsers);
    }
}
