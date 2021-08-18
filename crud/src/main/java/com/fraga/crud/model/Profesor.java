package com.fraga.crud.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class Profesor {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    //@Name()
    private String nombre;
    private String apellido;
    private String rut;

}
