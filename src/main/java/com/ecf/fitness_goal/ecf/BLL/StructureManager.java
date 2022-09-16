package com.ecf.fitness_goal.ecf.BLL;

import java.util.List;
import java.util.Optional;

import com.ecf.fitness_goal.ecf.BO.Structure;

public interface StructureManager {
    public List<Structure> findAllStructure();
    public Optional<Structure> findStructureById(Integer id);
    public void updateStructure(Structure structure);
    public void updateStructureActive(Structure structure);
    public void addStructure(Structure structure);
    public void deleteStructure(Integer id);
    public void updateStructureAndDroit(Structure structure);
}
