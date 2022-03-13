package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.AntLaboralesDao;
import com.porfolioserver.portfolioserver.models.AntLaborales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AntLaboralesController {

    @Autowired
    private AntLaboralesDao antLaboralesDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antlaborales")
    public List<AntLaborales> getAntLaborales() {
        return antLaboralesDao.getAntLaborales();
    }
}
