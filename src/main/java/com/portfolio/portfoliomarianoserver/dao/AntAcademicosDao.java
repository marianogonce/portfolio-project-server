package com.portfolio.portfoliomarianoserver.dao;


import com.portfolio.portfoliomarianoserver.models.AntAcademicos;

import java.util.List;

public interface AntAcademicosDao {
    
    List<AntAcademicos> getAntAcademicos();

    void deleteAntAcademicos(Long id);

    AntAcademicos getById(Long id);

    Long addAntAcademicos(AntAcademicos antAcademicos);

    Long updateAntAcademicos(AntAcademicos antAcademicos);
}
