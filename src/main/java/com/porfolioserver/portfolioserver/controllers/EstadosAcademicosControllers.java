package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.EstadoAcademicoDao;
import com.porfolioserver.portfolioserver.models.EstadoAcademico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstadosAcademicosControllers {

    @Autowired
    private EstadoAcademicoDao estadoAcademicoDao;

    @RequestMapping(value="estadosacademicos")
    public List<EstadoAcademico> getEstadosAcedemicos() {
        return estadoAcademicoDao.getEstadoAcademicos();
    }
}
