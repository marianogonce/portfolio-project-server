package com.portfolio.portfoliomarianoserver.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "proyectos")
public class Project {

    @Id
    @Getter
    @Setter
    @Column(name = "proyecto_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long proyecto_id;

    @Getter @Setter @Column(name = "proyecto_titulo")
    private String proyecto_titulo;

    @Getter @Setter @Column(name = "proyecto_descripcion")
    private String proyecto_descripcion;

    @Getter @Setter @Column(name = "summary")
    private String summary;

    @Getter @Setter @Column(name = "proyecto_fecha")
    private String proyecto_fecha;

    @Getter @Setter @Column(name = "img_url")
    private String img_url;

    @Getter @Setter @Column(name = "link_repo_github")
    private String link_repo_github;

    @Getter @Setter @Column(name = "autor")
    private String autor;

    @Getter @Setter @Column(name = "img_deletehash")
    private String img_deletehash;
}
