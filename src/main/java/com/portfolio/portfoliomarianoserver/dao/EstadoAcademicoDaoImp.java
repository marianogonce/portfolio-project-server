package com.portfolio.portfoliomarianoserver.dao;


import com.portfolio.portfoliomarianoserver.models.EstadoAcademico;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EstadoAcademicoDaoImp implements  EstadoAcademicoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<EstadoAcademico> getEstadoAcademicos() {
        String query ="FROM EstadoAcademico";
        return entityManager.createQuery(query).getResultList();
    }
}
