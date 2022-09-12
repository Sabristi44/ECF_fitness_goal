package com.ecf.fitness_goal.ecf.DAL;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ecf.fitness_goal.ecf.BO.User;

public interface UserDAO extends CrudRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    User login(@Param("email") String email,@Param("password") String password);

}
