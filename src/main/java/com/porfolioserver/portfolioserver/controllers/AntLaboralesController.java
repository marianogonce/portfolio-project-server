package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.AntLaboralesDao;
import com.porfolioserver.portfolioserver.models.AntAcademicos;
import com.porfolioserver.portfolioserver.models.AntLaborales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AntLaboralesController {

    @Autowired
    private AntLaboralesDao antLaboralesDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antlaborales", method = RequestMethod.GET)
    public List<AntLaborales> getAntLaborales() {
        return antLaboralesDao.getAntLaborales();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antlaborales/{id}", method = RequestMethod.DELETE)
    public void deleteAntLaborales(@PathVariable Long id) {
        antLaboralesDao.deleteAntLaborales(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antlaborales", method = RequestMethod.POST)
    public Long addAntLaborales(@RequestBody AntLaborales antLaborales) {
        return antLaboralesDao.addAntLaborales(antLaborales);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antlaborales", method = RequestMethod.PUT)
    public AntLaborales updateAntLaborales(@RequestBody AntLaborales antLaborales) {
        return antLaboralesDao.updateAntLaborales(antLaborales);
    }
}
