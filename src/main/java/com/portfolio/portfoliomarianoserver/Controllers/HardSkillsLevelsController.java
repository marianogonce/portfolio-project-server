package com.portfolio.portfoliomarianoserver.Controllers;

import com.portfolio.portfoliomarianoserver.dao.HardSkillLevelDao;
import com.portfolio.portfoliomarianoserver.models.HardSkillLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HardSkillsLevelsController {

    @Autowired
    private HardSkillLevelDao hardSkillLevelDao;

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="hardskillslevels")
    public List<HardSkillLevel> getHardSkillsLevels() {
        return hardSkillLevelDao.getHardSkillsLevels();
    }
}
