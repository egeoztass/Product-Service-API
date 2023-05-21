package com.example.ayrotek.codingexam.codingexam.dao;

import com.example.ayrotek.codingexam.codingexam.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    int insertUser(String id, User user);
    List<User> selectAllUsers();
    Optional<User> selectUserById(String id);

}
