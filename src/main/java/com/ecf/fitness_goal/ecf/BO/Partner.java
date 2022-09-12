package com.ecf.fitness_goal.ecf.BO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Partner {
    @Id
    @GeneratedValue
    private Integer idPartner;

    @OneToOne
    private User user;
    private String partnerName;
    private boolean partnerActive;
    @OneToMany
    private List<Structure> listStructure = new ArrayList<>();


    @OneToOne
    private Gestion gestion;
    private String logoUrl;

    public Partner(Integer idPartner, User user, String partnerName, boolean partnerActive,
            List<Structure> listStructure, Gestion gestion, String logoUrl) {
        this.idPartner = idPartner;
        this.user = user;
        this.partnerName = partnerName;
        this.partnerActive = partnerActive;
        this.listStructure = listStructure;
        this.gestion = gestion;
        this.logoUrl = logoUrl;
    }


}
