package com.porfolioserver.portfolioserver.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="hardskillslevels")
public class HardSkillLevel {

    @Id
    @Getter @Setter @Column(name="level_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long level_id;

    @Getter @Setter @Column(name="level_descripcion")
    private String level_descripcion;

}
