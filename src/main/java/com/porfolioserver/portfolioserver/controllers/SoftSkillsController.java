package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.AutorDao;
import com.porfolioserver.portfolioserver.dao.SoftskillDao;
import com.porfolioserver.portfolioserver.models.SoftSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SoftSkillsController {

    @Autowired
    private SoftskillDao softskillDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="softskills", method = RequestMethod.GET)
    public List<SoftSkill> getSoftSkills() {
        return softskillDao.getSoftSkills();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="softskills/{id}", method = RequestMethod.DELETE)
    public void deleteSoftSkill(@PathVariable Long id) {
         softskillDao.deleteSoftSkill(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="softskills", method = RequestMethod.POST)
    public void addSoftSkill(@RequestBody SoftSkill softSkill) {
         softskillDao.addSoftSkill(softSkill);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="softskills", method = RequestMethod.PUT)
    public SoftSkill updateSoftSkill(@RequestBody SoftSkill softSkill) {
        return softskillDao.updateSoftSkill(softSkill);
    }
}
