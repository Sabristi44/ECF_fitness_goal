package com.ecf.fitness_goal.ecf.WS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecf.fitness_goal.ecf.BLL.UserManager;
import com.ecf.fitness_goal.ecf.BO.User;

public class UserWS {

    @Autowired
    UserManager manager;

    @PostMapping("/login")
    public User login(@RequestBody String mail, @RequestBody String password) {
        return manager.login(mail, password);
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody User user) {
        manager.updateUser(user);
    }

}
