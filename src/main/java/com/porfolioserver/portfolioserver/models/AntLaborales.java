package com.porfolioserver.portfolioserver.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "antlaborales")
public class AntLaborales {

    @Id
    @Getter
    @Setter
    @Column(name = "antlaborales_id")
    private Long antlaborales_id;

    @Getter
    @Setter
    @Column(name = "antlaborales_puesto")
    private String antlaborales_puesto;

    @Getter
    @Setter
    @Column(name = "antlaborales_empleador")
    private String antlaborales_empleador;


    @Getter
    @Setter
    @Column(name = "antlaborales_img_url")
    private String antlaborales_img_url;

    @Getter
    @Setter
    @Column(name = "antlaborales_lugar")
    private String antlaborales_lugar;

    @Getter
    @Setter
    @Column(name = "antlaborales_fecha_inicio")
    private String antlaborales_fecha_inicio;

    @Getter
    @Setter
    @Column(name = "antlaborales_fecha_final")
    private String antlaborales_fecha_final;

    @Getter
    @Setter
    @Column(name = "antlaborales_descripcion")
    private String antlaborales_descripcion;

    @Getter
    @Setter
    @Column(name = "autor")
    private String autor;
}
