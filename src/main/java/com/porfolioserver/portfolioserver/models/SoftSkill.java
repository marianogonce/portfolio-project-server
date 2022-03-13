package com.porfolioserver.portfolioserver.models;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="softskills")
public class SoftSkill {

    @Id
    @Getter  @Setter @Column(name = "softskill_Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long softskill_Id;

    @Getter @Setter @Column(name = "softskill_descripcion")
    private String softskill_descripcion;

    @Getter @Setter @Column(name = "autor")
    private String autor;
}
