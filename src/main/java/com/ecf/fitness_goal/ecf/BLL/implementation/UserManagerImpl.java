package com.ecf.fitness_goal.ecf.BLL.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecf.fitness_goal.ecf.BLL.UserManager;
import com.ecf.fitness_goal.ecf.BO.User;
import com.ecf.fitness_goal.ecf.DAL.UserDAO;

public class UserManagerImpl implements UserManager {

    @Autowired
    UserDAO dao;


    @Override
    public User login(String email, String password) {
        return dao.login(email, password);
    }

    @Override
    public void updateUser(User user) {
        dao.save(user);
    
    }
    
}
