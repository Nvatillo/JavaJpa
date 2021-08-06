package com.fraga.crud.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Profesor {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    //@Name()
    private String nombre;
    private String apellido;
    private String rut;

}
