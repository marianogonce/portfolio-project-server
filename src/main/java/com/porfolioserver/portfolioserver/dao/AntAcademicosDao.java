package com.porfolioserver.portfolioserver.dao;

import com.porfolioserver.portfolioserver.models.AntAcademicos;

import java.util.List;

public interface AntAcademicosDao {
    
    List<AntAcademicos> getAntAcademicos();

    void deleteAntAcademicos(Long id);

    Long addAntAcademicos(AntAcademicos antAcademicos);

    Long updateAntAcademicos(AntAcademicos antAcademicos);
}
