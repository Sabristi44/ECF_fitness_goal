package com.ecf.fitness_goal.ecf.BO;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Droit {
    private Integer droitId;
    private String name;

    
    public Droit(Integer droitId, String name) {
        this.droitId = droitId;
        this.name = name;
    }
}
