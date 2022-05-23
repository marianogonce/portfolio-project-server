package com.portfolio.portfoliomarianoserver.dao;



import com.portfolio.portfoliomarianoserver.models.Project;

import java.util.List;

public interface ProjectDao {
    List<Project> getProjects();

    Project getById(Long id);

    void deleteProject(Long id);

    Long addProject(Project project);

    Long updateProject(Project project);
}
