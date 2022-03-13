package com.porfolioserver.portfolioserver.controllers;

import com.porfolioserver.portfolioserver.dao.HardSkillLevelDao;
import com.porfolioserver.portfolioserver.models.HardSkillLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HardSkillsLevelsController {

    @Autowired
    private HardSkillLevelDao hardSkillLevelDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="hardskillslevels")
    public List<HardSkillLevel> getHardSkillsLevels() {
        return hardSkillLevelDao.getHardSkillsLevels();
    }
}
