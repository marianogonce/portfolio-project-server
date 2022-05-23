package com.portfolio.portfoliomarianoserver.dao;


import com.portfolio.portfoliomarianoserver.models.HardSkill;

import java.util.List;

public interface HardSkillDao {
    List<HardSkill> getHardSkills();

    void deleteHardSkill(Long id);

    void addHardSkill(HardSkill hardSkill);

    HardSkill updateHardSkill(HardSkill hardSkill);
}
