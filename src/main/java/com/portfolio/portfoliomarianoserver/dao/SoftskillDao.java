package com.portfolio.portfoliomarianoserver.dao;



import com.portfolio.portfoliomarianoserver.models.SoftSkill;

import java.util.List;



public interface SoftskillDao {
    List<SoftSkill> getSoftSkills();

    void deleteSoftSkill(Long id);

    void addSoftSkill(SoftSkill softSkill);

    SoftSkill updateSoftSkill(SoftSkill softSkill);
}
