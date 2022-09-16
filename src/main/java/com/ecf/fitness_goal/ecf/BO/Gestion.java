package com.ecf.fitness_goal.ecf.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Gestion {

    @Id
    @GeneratedValue
    private Integer gestionId;

    private Boolean crossFit;
    private Boolean boissons;
    private Boolean pilate;
    private Boolean cardioTraining;
    private Boolean yoga;

    public Gestion(Integer gestionId, Boolean crossFit, Boolean boissons, Boolean pilate, Boolean cardioTraining,
            Boolean yoga) {
        this.gestionId = gestionId;
        this.crossFit = crossFit;
        this.boissons = boissons;
        this.pilate = pilate;
        this.cardioTraining = cardioTraining;
        this.yoga = yoga;
    }
}
