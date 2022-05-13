package com.porfolioserver.portfolioserver.dao;


import com.porfolioserver.portfolioserver.models.AntAcademicos;
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

    @Override
    public void deleteAntLaborales(Long id) {
        AntLaborales antLaborales = entityManager.find(AntLaborales.class, id);
        entityManager.remove(antLaborales);
    }

    @Override
    public Long addAntLaborales(AntLaborales antLaborales) {
        AntLaborales managedEntity =  entityManager.merge(antLaborales);
        return managedEntity.getAntlaborales_id();
    }

    @Override
    public AntLaborales updateAntLaborales(AntLaborales antLaborales) {
        AntLaborales antLaboralesToModify = entityManager.find(AntLaborales.class, antLaborales.getAntlaborales_id());
        entityManager.detach(antLaboralesToModify);
        antLaboralesToModify = antLaborales;
        return entityManager.merge(antLaboralesToModify);
    }
}
