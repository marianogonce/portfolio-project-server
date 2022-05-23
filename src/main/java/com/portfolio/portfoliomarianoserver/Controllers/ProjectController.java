package com.portfolio.portfoliomarianoserver.Controllers;


import com.portfolio.portfoliomarianoserver.dao.ProjectDao;
import com.portfolio.portfoliomarianoserver.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectDao projectDao;

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="projects", method = RequestMethod.GET)
    public List<Project> getProjects() {
        return projectDao.getProjects();
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="projects/{id}", method = RequestMethod.DELETE)
    public void deleteProject(@PathVariable Long id) {
        projectDao.deleteProject(id);
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="projects", method = RequestMethod.POST)
    public Long addProject(@RequestBody Project project) {
        return projectDao.addProject(project);
    }

    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="projects", method = RequestMethod.PUT)
    public Long updateProject(@RequestBody Project project) {
        return projectDao.updateProject(project);
    }
}
