package com.porfolioserver.portfolioserver.dao;


import com.porfolioserver.portfolioserver.models.AntAcademicos;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class AntAcademicosDaoImp implements  AntAcademicosDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AntAcademicos> getAntAcademicos() {
        String query ="FROM AntAcademicos";
        return entityManager.createQuery(query).getResultList();
    }
}
