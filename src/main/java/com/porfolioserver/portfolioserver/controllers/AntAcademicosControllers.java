package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.AntAcademicosDao;
import com.porfolioserver.portfolioserver.models.AntAcademicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AntAcademicosControllers {

    @Autowired
    private AntAcademicosDao antAcademicosDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antacademicos")
    public List<AntAcademicos> getAntAcademicos() {
        return antAcademicosDao.getAntAcademicos();
    }
}
