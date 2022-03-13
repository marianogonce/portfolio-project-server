package com.porfolioserver.portfolioserver.dao;

import com.porfolioserver.portfolioserver.models.HardSkill;
import com.porfolioserver.portfolioserver.models.HardSkillLevel;
import com.porfolioserver.portfolioserver.models.SoftSkill;

import java.util.List;

public interface HardSkillDao {
    List<HardSkill> getHardSkills();

    void deleteHardSkill(Long id);

    void addHardSkill(HardSkill hardSkill);

    HardSkill updateHardSkill(HardSkill hardSkill);
}
