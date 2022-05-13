package com.porfolioserver.portfolioserver.dao;


import com.porfolioserver.portfolioserver.models.AntAcademicos;
import com.porfolioserver.portfolioserver.models.HardSkill;
import com.porfolioserver.portfolioserver.models.SoftSkill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
