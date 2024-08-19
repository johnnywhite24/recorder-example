package com.johniya.recorderexample.example1.service;

import com.johniya.recorderexample.example1.User;
import com.johniya.recorderexample.example1.dao.UserMockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Autowired
    private UserMockDao userMockDao;

    public void addUser(User user) {
        userMockDao.addUser(user);
    }

    public void updateUser(String id, String name) {
        userMockDao.updateUser(id, name);
    }
}
