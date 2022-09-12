package com.ecf.fitness_goal.ecf.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer idUser;
    private String email;
    private String password;
    private boolean userActive;
    private String userName;
    private boolean firstConnect;
    private boolean isAdmin;

    public User(Integer idUser, String email, String password, boolean userActive, String userName,
            boolean firstConnect, boolean isAdmin) {
        this.idUser = idUser;
        this.email = email;
        this.password = password;
        this.userActive = userActive;
        this.userName = userName;
        this.firstConnect = firstConnect;
        this.isAdmin = isAdmin;
    }
}
