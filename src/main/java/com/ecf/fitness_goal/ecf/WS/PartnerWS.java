package com.ecf.fitness_goal.ecf.WS;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecf.fitness_goal.ecf.BLL.PartnerManager;

import com.ecf.fitness_goal.ecf.BO.Partner;

@RestController
public class PartnerWS {
    @Autowired
    PartnerManager manager;

    @GetMapping("/partner")
    public List<Partner> getAllPartner(){
        return manager.findAllPartners();
    }

    @GetMapping("/partner/{id}")
    public Optional<Partner> getPartnerById(@PathVariable("id")Integer id) {
        return manager.findPartner(id);
    }

    @PutMapping("/partner")
    public void updatePartner(@RequestBody Partner partner) {
        manager.updatePartner(partner);
    }

    @PutMapping("/partner/droit")
    public void updatePartnerAndDroit(@RequestBody Partner partner) {
        manager.updatePartnerAndDroit(partner);
    }

    @PutMapping("/partner/active")
    public void updatePartnerActive(@RequestBody Partner partner) {
        manager.updatePartnerActive(partner);
    }

    @PostMapping("/partner")
    public void addPartner(@RequestBody Partner partner){
        manager.addPartner(partner);
    }

    @DeleteMapping("/partner/{id}")
    public void deletePartner(@PathVariable("id")Integer id) {
        manager.deletePartner(id);
    }
}
