package com.portfolio.portfoliomarianoserver.Controllers;


import com.portfolio.portfoliomarianoserver.dao.AntAcademicosDao;
import com.portfolio.portfoliomarianoserver.models.AntAcademicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AntAcademicosControllers {

    @Autowired
    private AntAcademicosDao antAcademicosDao;


    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="antacademicos", method = RequestMethod.GET)
    public List<AntAcademicos> getAntAcademicos() {
        return antAcademicosDao.getAntAcademicos();
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="antacademicos/{id}", method = RequestMethod.DELETE)
    public void deleteAntAcademicos(@PathVariable Long id) {
        antAcademicosDao.deleteAntAcademicos(id);
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="antacademicos", method = RequestMethod.POST)
    public Long addAntAcademicos(@RequestBody AntAcademicos antAcademicos) {
        return antAcademicosDao.addAntAcademicos(antAcademicos);
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="antacademicos", method = RequestMethod.PUT)
    public Long updateantAcademicos(@RequestBody AntAcademicos antAcademicos) {
        return antAcademicosDao.updateAntAcademicos(antAcademicos);
    }

}
