package com.portfolio.portfoliomarianoserver.Controllers;

import com.portfolio.portfoliomarianoserver.dao.*;
import com.portfolio.portfoliomarianoserver.models.AntAcademicos;
import com.portfolio.portfoliomarianoserver.models.AntLaborales;
import com.portfolio.portfoliomarianoserver.models.Autor;
import com.portfolio.portfoliomarianoserver.models.Project;
import com.portfolio.portfoliomarianoserver.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;


import java.io.IOException;

import java.net.URISyntaxException;

import java.util.HashMap;



@RestController
public class FileController {


    @Autowired
    ImageService imageService;

    @Autowired
    AutorDao autorDao;

    @Autowired
    AntLaboralesDao antLaboralesDao;

    @Autowired
    ProjectDao projectDao;

    @Autowired
    AntAcademicosDao antAcademicosDao;

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }



    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app")
    @PostMapping("uploadFile")
    public HashMap uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("typeEntity") String idEntity, @RequestParam("idEntity") String identificador) throws URISyntaxException {

        String fileName = identificador;

         Mono<HashMap> response = imageService.uploadImgToImgur(file, fileName);

        HashMap respuesta = (HashMap) response.block().get("data");


        if (idEntity.equals("perfil")) {

            Autor autor = autorDao.getAutor().get(0);
            autor.setDeletehash_perfil(respuesta.get("deletehash").toString());
            autor.setFoto_perfil_url(respuesta.get("link").toString());
            autorDao.updateAutor(autor);

        }
        if (idEntity.equals("portada")) {
            Autor autor = autorDao.getAutor().get(0);
            autor.setDeletehash_portada(respuesta.get("deletehash").toString());
            autor.setImg_portada_url(respuesta.get("link").toString());
            autorDao.updateAutor(autor);
        }

        if (idEntity.equals("antacademico")) {
            AntAcademicos antAcademico = antAcademicosDao.getById(Long.valueOf(fileName.toString()).longValue());
            antAcademico.setAntacademicos_Img_deletehash(respuesta.get("deletehash").toString());
            antAcademico.setAntacademicos_Img_url(respuesta.get("link").toString());
            antAcademicosDao.updateAntAcademicos(antAcademico);

            System.out.println(fileName);
            System.out.println(Long.valueOf(fileName).longValue());

        }
        if (idEntity.equals("antlaboral")) {

            AntLaborales antLaborales = antLaboralesDao.getById(Long.valueOf(fileName.toString()).longValue());
            antLaborales.setAntlaborales_Img_deletehash(respuesta.get("deletehash").toString());
            antLaborales.setAntlaborales_img_url(respuesta.get("link").toString());
            antLaboralesDao.updateAntLaborales(antLaborales);
        }
        if (idEntity.equals("project")) {
            Project project = projectDao.getById(Long.valueOf(fileName.toString()).longValue());
            project.setImg_deletehash(respuesta.get("deletehash").toString());
            project.setImg_url(respuesta.get("link").toString());
            projectDao.updateProject(project);
        }

     return respuesta;
    }


    @CrossOrigin(origins = "https://porfolio-mariano-app.web.app" )
    @RequestMapping(value="deleteFile/{deletehash}", method = RequestMethod.DELETE)
    public HashMap deleteFile(@PathVariable String deletehash) throws IOException, URISyntaxException {


        Mono<HashMap> response = imageService.deleteImgToImgur(deletehash);

        HashMap respuesta = (HashMap) response.block();

        return respuesta;
    }
}