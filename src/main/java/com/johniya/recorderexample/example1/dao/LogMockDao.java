package com.johniya.recorderexample.example1.dao;

import com.johniya.recorderexample.example1.Log;
import org.springframework.stereotype.Component;

@Component
public class LogMockDao {

    public void insertLog(Log log) {
        System.out.println(log.toString());
    }

    public void updateLog(Log log) {
        System.out.println(log.toString());
    }
}
