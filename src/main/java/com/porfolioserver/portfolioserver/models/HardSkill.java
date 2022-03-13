package com.porfolioserver.portfolioserver.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="hardskills")
public class HardSkill {

    @Id
    @Getter
    @Setter
    @Column(name="hardskill_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long hardskill_id;

    @Getter
    @Setter
    @Column(name="hardskill_descripcion")
    private String hardskill_descripcion;

    @Getter
    @Setter
    @Column(name="hardskill_type")
    private String hardskill_type;

    @Getter
    @Setter
    @Column(name="hardskill_level")
    private Long hardskill_level;

    @Getter
    @Setter
    @Column(name="autor")
    private String autor;
}
