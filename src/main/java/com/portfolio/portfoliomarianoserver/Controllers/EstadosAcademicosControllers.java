package com.portfolio.portfoliomarianoserver.Controllers;


import com.portfolio.portfoliomarianoserver.dao.EstadoAcademicoDao;
import com.portfolio.portfoliomarianoserver.models.EstadoAcademico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstadosAcademicosControllers {

    @Autowired
    private EstadoAcademicoDao estadoAcademicoDao;

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="estadosacademicos")
    public List<EstadoAcademico> getEstadosAcedemicos() {
        return estadoAcademicoDao.getEstadoAcademicos();
    }
}
