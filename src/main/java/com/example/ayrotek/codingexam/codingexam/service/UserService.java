package com.example.ayrotek.codingexam.codingexam.service;

import com.example.ayrotek.codingexam.codingexam.dao.UserDao;
import com.example.ayrotek.codingexam.codingexam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;
    @Autowired
    public UserService(@Qualifier("fakeUserDao") UserDao userDao) {
        this.userDao = userDao;
    }
    public int addUser(User user) {
        return userDao.insertUser(user.getId(), user);
    }
    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }
    public User getUserById(String id) {
        return userDao.selectUserById(id)
                .orElse(null);

    }
}
