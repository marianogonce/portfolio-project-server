package com.porfolioserver.portfolioserver.dao;

import com.porfolioserver.portfolioserver.models.Autor;

import java.util.List;

public interface AutorDao {

    List<Autor> getAutor();
    Autor obtenerAutorporCredenciales (Autor autor);
}
