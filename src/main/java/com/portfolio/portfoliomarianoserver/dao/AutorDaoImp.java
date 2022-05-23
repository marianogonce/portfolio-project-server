package com.portfolio.portfoliomarianoserver.dao;


import com.portfolio.portfoliomarianoserver.models.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AutorDaoImp implements AutorDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Autor> getAutor() {
     String query ="FROM Autor";
     return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void setEncodedPassword(String password) {
        Autor autorToModify = entityManager.find(Autor.class, this.getAutor().get(0).getUsername());
        entityManager.detach(autorToModify);
        autorToModify.setPassword(passwordEncoder.encode(password));
        entityManager.merge(autorToModify);
    }

    @Override
    public void updateAutor(Autor autor) {
        Autor autorToModify = entityManager.find(Autor.class, autor.getUsername());
        entityManager.detach(autorToModify);
        autorToModify = autor;
        entityManager.merge(autorToModify);
    }


}
