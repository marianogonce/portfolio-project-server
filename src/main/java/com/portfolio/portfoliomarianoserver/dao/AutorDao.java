package com.portfolio.portfoliomarianoserver.dao;


import com.portfolio.portfoliomarianoserver.models.Autor;

import java.util.List;

public interface AutorDao {

    List<Autor> getAutor();

    void setEncodedPassword(String password);

    void updateAutor(Autor autor);
}
