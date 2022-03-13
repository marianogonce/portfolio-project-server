package com.porfolioserver.portfolioserver.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hardskillslevels")
public class HardSkillLevel {

    @Id
    @Getter @Setter @Column(name="level_id")
    private  Long level_id;

    @Getter @Setter @Column(name="level_descripcion")
    private String level_descripcion;

}
