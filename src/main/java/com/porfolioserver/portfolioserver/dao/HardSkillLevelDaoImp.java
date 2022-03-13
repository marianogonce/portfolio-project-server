package com.porfolioserver.portfolioserver.dao;


import com.porfolioserver.portfolioserver.models.HardSkillLevel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class HardSkillLevelDaoImp implements HardSkillLevelDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<HardSkillLevel> getHardSkillsLevels() {
        String query ="FROM HardSkillLevel";
        return entityManager.createQuery(query).getResultList();
    }

}
