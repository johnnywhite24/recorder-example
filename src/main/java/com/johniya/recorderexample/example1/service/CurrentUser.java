package com.johniya.recorderexample.example1.service;

import com.johniya.recorder.OperateUser;
import org.springframework.stereotype.Service;

@Service
public class CurrentUser implements OperateUser {

    @Override
    public Object getCurrentOperateUser() {
        // get RequestContext current user
        return "admin";
    }
}
