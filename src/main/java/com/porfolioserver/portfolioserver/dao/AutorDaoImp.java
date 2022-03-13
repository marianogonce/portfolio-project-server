package com.porfolioserver.portfolioserver.dao;

import com.porfolioserver.portfolioserver.models.Autor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional

public class AutorDaoImp implements AutorDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Autor> getAutor() {
     String query ="FROM Autor";
     return entityManager.createQuery(query).getResultList();
    }


    @Override
    public Autor obtenerAutorporCredenciales(Autor autor) {
        String query = "FROM Autor WHERE user_name = : user_name AND password = : password";
        List<Autor> lista = entityManager.createQuery(query)
                .setParameter("user_name", autor.getUser_name())
                .setParameter("password", autor.getPassword())
                .getResultList();
        if(lista.isEmpty()) return null;
        else return lista.get(0);
    }



}
