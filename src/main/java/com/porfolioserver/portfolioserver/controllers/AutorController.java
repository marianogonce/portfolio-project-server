package com.porfolioserver.portfolioserver.controllers;

import com.porfolioserver.portfolioserver.dao.AutorDao;
import com.porfolioserver.portfolioserver.models.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutorController {

    @Autowired
    private AutorDao autorDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="autor")
    public List<Autor> getAutor() {
        return autorDao.getAutor();
    }
}
