package com.porfolioserver.portfolioserver.dao;


import com.porfolioserver.portfolioserver.models.AntLaborales;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class AntLaboralesDaoImp implements AntLaboralesDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AntLaborales> getAntLaborales() {
        String query ="FROM AntLaborales";
        return entityManager.createQuery(query).getResultList();
    }
}
