package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.AntAcademicosDao;
import com.porfolioserver.portfolioserver.models.AntAcademicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AntAcademicosControllers {

    @Autowired
    private AntAcademicosDao antAcademicosDao;


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antacademicos", method = RequestMethod.GET)
    public List<AntAcademicos> getAntAcademicos() {
        return antAcademicosDao.getAntAcademicos();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antacademicos/{id}", method = RequestMethod.DELETE)
    public void deleteAntAcademicos(@PathVariable Long id) {
        antAcademicosDao.deleteAntAcademicos(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antacademicos", method = RequestMethod.POST)
    public Long addAntAcademicos(@RequestBody AntAcademicos antAcademicos) {
        return antAcademicosDao.addAntAcademicos(antAcademicos);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="antacademicos", method = RequestMethod.PUT)
    public Long updateantAcademicos(@RequestBody AntAcademicos antAcademicos) {
        return antAcademicosDao.updateAntAcademicos(antAcademicos);
    }

}
