package com.porfolioserver.portfolioserver.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "antacademicos")
public class AntAcademicos {

    @Id
    @Getter
    @Setter
    @Column(name = "anacademicos_Id")
    private Long anacademicos_Id;

    @Getter
    @Setter
    @Column(name = "antacademicos_Img_url")
    private String antacademicos_Img_url;

    @Getter
    @Setter
    @Column(name = "antacademicos_institucion")
    private String antacademicos_institucion;

    @Getter
    @Setter
    @Column(name = "antacademicos_fechaInicio")
    private String antacademicos_fechaInicio;

    @Getter
    @Setter
    @Column(name = "antacademicos_fechaFin")
    private String antacademicos_fechaFin;

    @Getter
    @Setter
    @Column(name = "antacademicos_descripcion")
    private String antacademicos_descripcion;

    @Getter
    @Setter
    @Column(name = "antacademicos_estado")
    private Long antacademicos_estado;

    @Getter
    @Setter
    @Column(name = "autor")
    private String autor;

    @Getter
    @Setter
    @Column(name = "antacademicos_genero")
    private String antacademicos_genero;

    @Getter
    @Setter
    @Column(name = "antacademicos_titulo")
    private String antacademicos_titulo;
}
