package com.ecf.fitness_goal.ecf.BO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Gestion {
    
    private Integer gestionId;
    private Integer droitId;
    private Boolean etat;

    @OneToMany(mappedBy = "droitId")
    private List<Droit> listDroits = new ArrayList<>() ;

    public Gestion(Integer gestionId, Integer droitId, Boolean etat, Structure structure, List<Droit> listDroits) {
        this.gestionId = gestionId;
        this.droitId = droitId;
        this.etat = etat;
        this.listDroits = listDroits;
    }
}
