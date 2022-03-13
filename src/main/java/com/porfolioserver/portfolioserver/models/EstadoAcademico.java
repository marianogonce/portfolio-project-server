package com.porfolioserver.portfolioserver.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estadoantacademicos")
public class EstadoAcademico {

    @Id
    @Getter
    @Setter
    @Column(name="estado_id")
    private  Long level_id;

    @Getter @Setter @Column(name="estado_descripcion")
    private String level_descripcion;
}
