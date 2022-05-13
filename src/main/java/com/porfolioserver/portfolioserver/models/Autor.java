package com.porfolioserver.portfolioserver.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @Getter @Setter @Column(name = "user_name")
    private String username;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "nombre_apellido")
    private String nombre_apellido;

    @Getter @Setter @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;

    @Getter @Setter @Column(name = "profesion")
    private String profesion;

    @Getter @Setter @Column(name = "radicacion")
    private String radicacion;

    @Getter @Setter @Column(name = "descripcion_perfil")
    private String descripcion_perfil;

    @Getter @Setter @Column(name = "foto_perfil_ext")
    private String foto_perfil_ext;

    @Getter @Setter @Column(name = "img_portada_ext")
    private String img_portada_ext;

    @Getter @Setter @Column(name = "frase_Portada")
    private String frase_Portada;


}
