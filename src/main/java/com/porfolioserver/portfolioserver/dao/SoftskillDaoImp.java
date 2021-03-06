package com.porfolioserver.portfolioserver.dao;

import com.porfolioserver.portfolioserver.models.SoftSkill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class SoftskillDaoImp implements SoftskillDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<SoftSkill> getSoftSkills() {
        String query ="FROM SoftSkill";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteSoftSkill(Long id) {
        SoftSkill softSkill = entityManager.find(SoftSkill.class, id);
        entityManager.remove(softSkill);
    }

    @Override
    public void addSoftSkill(SoftSkill softSkill) {
        entityManager.merge(softSkill);
    }

    @Override
    public SoftSkill updateSoftSkill(SoftSkill softSkill) {
        SoftSkill softSkillToModify = entityManager.find(SoftSkill.class, softSkill.getSoftskill_Id());
        entityManager.detach(softSkillToModify);
        softSkillToModify = softSkill;
        return entityManager.merge(softSkillToModify);

    }
}
