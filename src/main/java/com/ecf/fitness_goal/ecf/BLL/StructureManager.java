package com.ecf.fitness_goal.ecf.BLL;

import java.util.List;

import com.ecf.fitness_goal.ecf.BO.Gestion;
import com.ecf.fitness_goal.ecf.BO.Structure;

public interface StructureManager {
    public List<Structure> findAllStructure();
    public Structure findStructureById(Integer id);
    public void updateStructure(Structure structure);
    public void updateStructureActive(Structure structure);
    public void addStructure(Structure structure);
    public void deleteStructure(Integer id);
    public void updateStructureAndDroit(Structure structure, Gestion gestion);
}
