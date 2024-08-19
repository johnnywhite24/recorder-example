package com.johniya.recorderexample.example1;

import com.johniya.recorder.annotation.OperateId;
import com.johniya.recorder.annotation.OperateLog;
import com.johniya.recorderexample.example1.dao.UserMockDao;
import com.johniya.recorderexample.example1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test/user")
public class UserController {

    @Autowired
    private UserService userService;

    @OperateLog(source = UserMockDao.class, target = Log.Target.USER)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "ok";
    }

    @OperateLog(source = UserMockDao.class, target = Log.Target.USER, operate = Log.Operate.UPDATE)
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateUser(@RequestParam @OperateId String id, @RequestParam String name) {
        userService.updateUser(id, name);
        return "ok";
    }
}
