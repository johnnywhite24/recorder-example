package com.johniya.recorderexample.example1.service;

import com.johniya.recorder.OperateLogService;
import com.johniya.recorder.context.LogContext;
import com.johniya.recorderexample.example1.Log;
import com.johniya.recorderexample.example1.dao.LogMockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyOperateLogService implements OperateLogService {

    @Autowired
    private LogMockDao logMockDao;

    @Override
    public void logBefore(LogContext context, Object target) {
        Log log = new Log();
        log.setId(context.getContextId());

        Object user = context.getOperateUser().getCurrentOperateUser();
        if (user == null) {
            user = context.getOperateUser().defaultUser();
        }
        log.setUid((String) user);

        log.setOperate(context.getOperate());
        log.setTarget(context.getOperateTarget());

        log.setTime(System.currentTimeMillis());

        String json = this.toJson(target);
        log.setBeforeJson(json);

        logMockDao.insertLog(log);
    }

    @Override
    public void logAfter(LogContext context, Object target) {
        Log log = new Log();
        log.setId(context.getContextId());

        Object user = context.getOperateUser().getCurrentOperateUser();
        if (user == null) {
            user = context.getOperateUser().defaultUser();
        }
        log.setUid((String) user);

        log.setOperate(context.getOperate());
        log.setTarget(context.getOperateTarget());

        log.setTime(System.currentTimeMillis());

        String json = this.toJson(target);
        log.setAfterJson(json);

        logMockDao.updateLog(log);
    }

    private String toJson(Object o) {
        return "json";
    }
}
