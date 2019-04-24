package com.nabin.easynotes.repository;

import com.nabin.easynotes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.id=?1 and u.status = 0")
    User findActiveUser(Long userId);

    @Query("select u from User u where u.status = 0")
    List<User> findAllActiveUser();
}
