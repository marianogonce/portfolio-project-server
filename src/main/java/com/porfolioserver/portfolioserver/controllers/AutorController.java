package com.porfolioserver.portfolioserver.controllers;

import com.porfolioserver.portfolioserver.dao.AutorDao;
import com.porfolioserver.portfolioserver.models.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@RestController
public class AutorController {

    @Autowired
    private AutorDao autorDao;


    @Autowired
    EntityManager entityManager;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="autor", method = RequestMethod.GET)
    public List<Autor> getAutor() {
        List<Autor> autorPerfil = new ArrayList<>();
        autorPerfil.addAll(autorDao.getAutor());
        autorPerfil.get(0).setPassword("");
        return autorPerfil;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="autor", method = RequestMethod.PUT)
    public void updateAutor(@RequestBody Autor autor) {
        autor.setPassword(autorDao.getAutor().get(0).getPassword());
        autorDao.updateAutor(autor);
    }

    @Transactional
    @RequestMapping(value="setEncodedPassword", method = RequestMethod.PATCH)
    public void setEncodedPassword(@RequestBody String password){
        autorDao.setEncodedPassword(password);
    }
}
