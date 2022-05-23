package com.portfolio.portfoliomarianoserver.dao;


import com.portfolio.portfoliomarianoserver.models.AntLaborales;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Iterator;
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
    public AntLaborales getById(Long id) {
        Iterator<AntLaborales> iterator = getAntLaborales().iterator();
        while (iterator.hasNext()) {
            AntLaborales antLaboral = iterator.next();
            if (antLaboral.getAntlaborales_id().equals(id)) {
                return antLaboral;
            }
        }
        return null;
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
