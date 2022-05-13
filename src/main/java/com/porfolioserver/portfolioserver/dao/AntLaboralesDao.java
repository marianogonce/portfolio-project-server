package com.porfolioserver.portfolioserver.dao;

import com.porfolioserver.portfolioserver.models.AntLaborales;

import java.util.List;

public interface AntLaboralesDao {

    List<AntLaborales> getAntLaborales();

    void deleteAntLaborales(Long id);

    Long addAntLaborales(AntLaborales antLaborales);

    AntLaborales updateAntLaborales(AntLaborales antLaborales);
}
