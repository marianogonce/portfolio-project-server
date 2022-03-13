package com.porfolioserver.portfolioserver.controllers;


import com.porfolioserver.portfolioserver.dao.AutorDao;
import com.porfolioserver.portfolioserver.models.Autor;
import com.porfolioserver.portfolioserver.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private AutorDao autorDao;

    @Autowired
    private JWTUtil jwtUtil;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="login", method= RequestMethod.POST)
    public String login(@RequestBody Autor autor) {

        Autor autorLoggeado = autorDao.obtenerAutorporCredenciales(autor);

        if (autorLoggeado != null) {

            String token = jwtUtil.create(autorLoggeado.getUser_name(), autorLoggeado.getEmail());

            return token;

        } else return null;
    }

}
