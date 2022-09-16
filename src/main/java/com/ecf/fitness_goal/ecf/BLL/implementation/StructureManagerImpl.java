package com.ecf.fitness_goal.ecf.BLL.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecf.fitness_goal.ecf.BLL.StructureManager;
import com.ecf.fitness_goal.ecf.BO.Structure;
import com.ecf.fitness_goal.ecf.DAL.StructureDAO;

public class StructureManagerImpl implements StructureManager {
    
    @Autowired
    StructureDAO dao;

    @Override
    public List<Structure> findAllStructure() {
       return (List<Structure>) dao.findAll();
    }

    @Override
    public Optional<Structure> findStructureById(Integer id) {
      return dao.findById(id);
    }

    @Override
    public void updateStructure(Structure structure) {
        dao.save(structure);
        
    }

    @Override
    public void updateStructureActive(Structure structure) {
        dao.save(structure);
        
    }

    @Override
    public void addStructure(Structure structure) {
        dao.save(structure);
        
    }

    @Override
    public void deleteStructure(Integer id) {
        dao.deleteById(id);
        
    }

    @Override
    public void updateStructureAndDroit(Structure structure) {
        dao.save(structure);
    }


}
