package com.nabin.easynotes.converter;

import com.nabin.easynotes.model.User;
import com.nabin.easynotes.model.UserStatus;
import com.nabin.easynotes.resource.UserResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserConverterImpl implements UserConverter {
    @Override
    public UserResource convertToUserResouce(User savedUser) {
        log.info("Converting user to user resource ...");
        return UserResource.builder()
                .createdDate(savedUser.getCreatedAt())
                .status(savedUser.getStatus().name())
                .userName(savedUser.getName())
                .build();
    }

    @Override
    public List<UserResource> convertAllUsers(List<User> userList) {
        List<UserResource> userResourceList = new ArrayList<>();
        for(User user: userList) {
            userResourceList.add(convertToUserResouce(user));
        }
        return userResourceList;
//        if(userList.size() > 0) {
//            return userList.stream()
//                    .map(user-> convertToUserResouce(user))
//                    .collect(Collectors.toList());
//        } else {
//            return new ArrayList<>();
//        }

    }
}
