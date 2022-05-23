package com.portfolio.portfoliomarianoserver.dao;


import com.portfolio.portfoliomarianoserver.models.Project;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Iterator;
import java.util.List;


@Repository
@Transactional
public class ProjectDaoImp implements ProjectDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Project> getProjects() {
        String query ="FROM Project";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Project getById(Long id) {
        Iterator<Project> iterator = getProjects().iterator();
        while (iterator.hasNext()) {
            Project project = iterator.next();
            if (project.getProyecto_id().equals(id)) {
                return project;
            }
        }
        return null;
    }

    @Override
    public void deleteProject(Long id) {
        Project project = entityManager.find(Project.class, id);
        entityManager.remove(project);
    }

    @Override
    public Long addProject(Project project) {
        Project managedEntity = entityManager.merge(project);
        return managedEntity.getProyecto_id();
    }

    @Override
    public Long updateProject(Project project) {
        Project projectToModify = entityManager.find(Project.class, project.getProyecto_id());
        entityManager.detach(projectToModify);
        projectToModify = project;
        entityManager.merge(projectToModify);
        return projectToModify.getProyecto_id();
    }
}
