package com.johniya.recorderexample.example1.dao;

import com.johniya.recorder.OperateTargetSource;
import com.johniya.recorderexample.example1.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserMockDao implements OperateTargetSource {

    private static final Map<String, User> DB = new HashMap<>();

    static {
        DB.put("1", new User("1", "a"));
        DB.put("2", new User("2", "b"));
    }

    @Override
    public Object getOperateTargetById(Object id) {
        return DB.get((String) id);
    }

    public void addUser(User user) {
        DB.put(user.getId(), user);
    }

    public void updateUser(String id, String name) {
        User user = DB.get(id);
        if (user != null) {
            user.setName(name);
            DB.put(id, user);
        }
    }
}
