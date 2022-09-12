package com.ecf.fitness_goal.ecf.BLL;

import com.ecf.fitness_goal.ecf.BO.User;


public interface UserManager {

    public User login(String email, String password);
    public void updateUser(User user);
    
}
