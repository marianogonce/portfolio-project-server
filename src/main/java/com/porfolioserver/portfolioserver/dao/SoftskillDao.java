package com.porfolioserver.portfolioserver.dao;

import com.porfolioserver.portfolioserver.models.SoftSkill;

import java.util.List;



public interface SoftskillDao {
    List<SoftSkill> getSoftSkills();

    void deleteSoftSkill(Long id);

    void addSoftSkill(SoftSkill softSkill);

    SoftSkill updateSoftSkill(SoftSkill softSkill);
}
