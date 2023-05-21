package com.example.ayrotek.codingexam.codingexam.dao;

import com.example.ayrotek.codingexam.codingexam.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeUserDao")
public class FakeUserDataAccessService implements UserDao{

    private static List<User> DB = new ArrayList<>();
    @Override
    public int insertUser(String id, User user) {
        DB.add(new User(id, user.getName()));
        return 1;
    }
    @Override
    public List<User> selectAllUsers() {
        return DB;
    }
    @Override
    public Optional<User> selectUserById(String id) {
        return DB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
}
