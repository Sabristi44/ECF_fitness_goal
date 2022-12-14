package com.ecf.fitness_goal.ecf.BLL;

import java.util.List;
import java.util.Optional;

import com.ecf.fitness_goal.ecf.BO.Partner;

public interface PartnerManager {
    
    public List<Partner> findAllPartners();
    public Optional<Partner> findPartner(Integer id);
    public void updatePartner(Partner partner);
    public void updatePartnerActive(Partner partner);
    public void addPartner(Partner partner);
    public void deletePartner(Integer id);
    public void updatePartnerAndDroit(Partner partner);
}
