package com.portfolio.portfoliomarianoserver.Controllers;


import com.portfolio.portfoliomarianoserver.dao.SoftskillDao;
import com.portfolio.portfoliomarianoserver.models.SoftSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SoftSkillsController {

    @Autowired
    private SoftskillDao softskillDao;

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="softskills", method = RequestMethod.GET)
    public List<SoftSkill> getSoftSkills() {
        return softskillDao.getSoftSkills();
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="softskills/{id}", method = RequestMethod.DELETE)
    public void deleteSoftSkill(@PathVariable Long id) {
         softskillDao.deleteSoftSkill(id);
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="softskills", method = RequestMethod.POST)
    public void addSoftSkill(@RequestBody SoftSkill softSkill) {
         softskillDao.addSoftSkill(softSkill);
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="softskills", method = RequestMethod.PUT)
    public SoftSkill updateSoftSkill(@RequestBody SoftSkill softSkill) {
        return softskillDao.updateSoftSkill(softSkill);
    }
}
