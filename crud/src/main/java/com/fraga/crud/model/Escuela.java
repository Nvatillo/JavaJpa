package com.fraga.crud.model;

import lombok.Data;

import javax.persistence.*;


@Table(name = "profesor")
@Entity
@Data
public class Escuela {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    //@Name()
    private String nombre;
    private String apellido;
    private String rut;

}
