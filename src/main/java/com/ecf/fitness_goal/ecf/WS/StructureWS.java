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

import com.ecf.fitness_goal.ecf.BLL.StructureManager;
import com.ecf.fitness_goal.ecf.BO.Structure;

@RestController
public class StructureWS {

    @Autowired
    StructureManager manager; 

    @GetMapping("/structure")
    public List<Structure> getAllStructure(){
        return manager.findAllStructure();
    }

    @GetMapping("/structure/{id}")
    public Optional<Structure> getStructure(@PathVariable("id")Integer id) {
        return manager.findStructureById(id);
    }

    @PutMapping("/structure")
    public void changeStructureName(@RequestBody Structure structure) {
        manager.updateStructure(structure);
    }

    @PutMapping("/structure/droit")
    public void changeStructureDroit(@RequestBody Structure structure) {
        manager.updateStructureAndDroit(structure);
    }

    @PutMapping("/structure/active")
    public void changeStructureActive(@RequestBody Structure structure) {
        manager.updateStructureActive(structure);
    }

    @PostMapping("/structure")
    public void addStructure(@RequestBody Structure structure) {
        manager.addStructure(structure);
    }

    @DeleteMapping("/structure/{id}")
    public void deleteStructure(@PathVariable("id")Integer id) {
        manager.deleteStructure(id);
    }


}
