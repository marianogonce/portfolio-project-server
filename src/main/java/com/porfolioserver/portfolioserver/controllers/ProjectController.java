package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.ProjectDao;
import com.porfolioserver.portfolioserver.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectDao projectDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="projects", method = RequestMethod.GET)
    public List<Project> getProjects() {
        return projectDao.getProjects();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="projects/{id}", method = RequestMethod.DELETE)
    public void deleteProject(@PathVariable Long id) {
        projectDao.deleteProject(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="projects", method = RequestMethod.POST)
    public Long addProject(@RequestBody Project project) {
        return projectDao.addProject(project);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="projects", method = RequestMethod.PUT)
    public Long updateProject(@RequestBody Project project) {
        return projectDao.updateProject(project);
    }
}
