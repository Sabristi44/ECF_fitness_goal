package com.ecf.fitness_goal.ecf.BO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Structure {
    @Id
    @GeneratedValue
    private Integer structureId;

    @ManyToOne
    private Partner partner;
    @OneToOne(mappedBy = "userId", cascade = CascadeType.ALL)
    private User user;
    private String structureName;
    private boolean structureActive;
    @OneToOne(mappedBy = "gestionId", cascade = CascadeType.ALL)
    private Gestion gestion;

    public Structure(Integer structureId, Partner partner, User user, String structureName, boolean structureActive,
            Gestion gestion) {
        this.structureId = structureId;
        this.partner = partner;
        this.user = user;
        this.structureName = structureName;
        this.structureActive = structureActive;
        this.gestion = gestion;
    }

}
