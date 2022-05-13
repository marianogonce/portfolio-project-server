package com.porfolioserver.portfolioserver.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="estadoantacademicos")
public class EstadoAcademico {

    @Id
    @Getter
    @Setter
    @Column(name="estado_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long level_id;

    @Getter @Setter @Column(name="estado_descripcion")
    private String level_descripcion;
}
