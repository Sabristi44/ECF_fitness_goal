package com.ecf.fitness_goal.ecf.BLL.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecf.fitness_goal.ecf.BLL.PartnerManager;
import com.ecf.fitness_goal.ecf.BO.Partner;
import com.ecf.fitness_goal.ecf.DAL.PartnerDAO;

public class PartnerManagerImpl implements PartnerManager {

    @Autowired
    PartnerDAO dao;

    @Override
    public List<Partner> findAllPartners() {
      return (List<Partner>) dao.findAll();
    }

    @Override
    public Optional<Partner> findPartner(Integer id) {
        return dao.findById(id);
    }

    @Override
    public void updatePartner(Partner partner) {
        dao.save(partner);
        
    }

    @Override
    public void updatePartnerActive(Partner partner) {
        dao.save(partner);
        
    }

    @Override
    public void addPartner(Partner partner) {
        dao.save(partner);
        
    }

    @Override
    public void deletePartner(Integer id) {
        dao.deleteById(id);
        
    }

    @Override
    public void updatePartnerAndDroit(Partner partner) {
        dao.save(partner);
        
    }
    
}
