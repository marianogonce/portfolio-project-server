package com.porfolioserver.portfolioserver.dao;

import com.porfolioserver.portfolioserver.models.AntAcademicos;
import com.porfolioserver.portfolioserver.models.Project;

import java.util.List;

public interface ProjectDao {
    List<Project> getProjects();

    void deleteProject(Long id);

    Long addProject(Project project);

    Long updateProject(Project project);
}
