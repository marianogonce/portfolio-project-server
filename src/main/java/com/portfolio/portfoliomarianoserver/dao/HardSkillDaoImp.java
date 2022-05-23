package com.portfolio.portfoliomarianoserver.dao;

import com.portfolio.portfoliomarianoserver.models.HardSkill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class HardSkillDaoImp implements HardSkillDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<HardSkill> getHardSkills() {
        String query ="FROM HardSkill";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteHardSkill(Long id) {
        HardSkill hardSkill = entityManager.find(HardSkill.class, id);
        entityManager.remove(hardSkill);
    }

    @Override
    public void addHardSkill(HardSkill hardSkill) {
        entityManager.merge(hardSkill);
    }

    @Override
    public HardSkill updateHardSkill(HardSkill hardSkill) {
        HardSkill hardSkillToModify = entityManager.find(HardSkill.class, hardSkill.getHardskill_id());
        entityManager.detach(hardSkillToModify);
        hardSkillToModify = hardSkill;
        return entityManager.merge(hardSkillToModify);

    }
}
