package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.HardSkillDao;
import com.porfolioserver.portfolioserver.models.HardSkill;
import com.porfolioserver.portfolioserver.models.SoftSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HardSkillsController {

    @Autowired
    private HardSkillDao hardSkillDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="hardskills", method = RequestMethod.GET)
    public List<HardSkill> getHardSkills() {
        return hardSkillDao.getHardSkills();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="hardskills/{id}", method = RequestMethod.DELETE)
    public void deleteHardSkill(@PathVariable Long id) {
        hardSkillDao.deleteHardSkill(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="hardskills", method = RequestMethod.POST)
    public void addHardSkill(@RequestBody HardSkill hardSkill) {
        hardSkillDao.addHardSkill(hardSkill);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="hardskills", method = RequestMethod.PUT)
    public HardSkill updateHardSkill(@RequestBody HardSkill hardSkill) {
        return hardSkillDao.updateHardSkill(hardSkill);
    }

}
