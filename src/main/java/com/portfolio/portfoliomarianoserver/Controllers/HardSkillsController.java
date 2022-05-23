package com.portfolio.portfoliomarianoserver.Controllers;


import com.portfolio.portfoliomarianoserver.dao.HardSkillDao;
import com.portfolio.portfoliomarianoserver.models.HardSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HardSkillsController {

    @Autowired
    private HardSkillDao hardSkillDao;

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="hardskills", method = RequestMethod.GET)
    public List<HardSkill> getHardSkills() {
        return hardSkillDao.getHardSkills();
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="hardskills/{id}", method = RequestMethod.DELETE)
    public void deleteHardSkill(@PathVariable Long id) {
        hardSkillDao.deleteHardSkill(id);
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="hardskills", method = RequestMethod.POST)
    public void addHardSkill(@RequestBody HardSkill hardSkill) {
        hardSkillDao.addHardSkill(hardSkill);
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="hardskills", method = RequestMethod.PUT)
    public HardSkill updateHardSkill(@RequestBody HardSkill hardSkill) {
        return hardSkillDao.updateHardSkill(hardSkill);
    }

}
