package com.portfolio.portfoliomarianoserver.dao;


import com.portfolio.portfoliomarianoserver.models.AntAcademicos;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Iterator;
import java.util.List;

@Repository
@Transactional
public class AntAcademicosDaoImp implements AntAcademicosDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AntAcademicos> getAntAcademicos() {
        String query ="FROM AntAcademicos";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public AntAcademicos getById(Long id) {
            Iterator<AntAcademicos> iterator = getAntAcademicos().iterator();
            while (iterator.hasNext()) {
                AntAcademicos antAcademico = iterator.next();
                if (antAcademico.getAnacademicos_Id().equals(id)) {
                    return antAcademico;
                }
            }
            return null;
    }

    @Override
    public void deleteAntAcademicos(Long id) {
        AntAcademicos antAcademicos = entityManager.find(AntAcademicos.class, id);
        entityManager.remove(antAcademicos);
    }

    @Override
    public Long addAntAcademicos(AntAcademicos antAcademicos) {
        AntAcademicos managedEntity = entityManager.merge(antAcademicos);
        return managedEntity.getAnacademicos_Id();

    }

    @Override
    public Long updateAntAcademicos(AntAcademicos antAcademicos) {
        AntAcademicos antAcademicosToModify = entityManager.find(AntAcademicos.class, antAcademicos.getAnacademicos_Id());
        entityManager.detach(antAcademicosToModify);
        antAcademicosToModify = antAcademicos;
        entityManager.merge(antAcademicosToModify);
        return antAcademicosToModify.getAnacademicos_Id();
    }
}
