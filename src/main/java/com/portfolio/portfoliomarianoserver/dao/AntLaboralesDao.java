package com.portfolio.portfoliomarianoserver.dao;



import com.portfolio.portfoliomarianoserver.models.AntLaborales;

import java.util.List;

public interface AntLaboralesDao {

    List<AntLaborales> getAntLaborales();

    void deleteAntLaborales(Long id);

    AntLaborales getById(Long id);

    Long addAntLaborales(AntLaborales antLaborales);

    AntLaborales updateAntLaborales(AntLaborales antLaborales);
}
