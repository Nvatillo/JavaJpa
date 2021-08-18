package com.fraga.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


/// NOOOO EXPONER MODELO DE LA BASE DE DATOS POR SEGURIDAD
@Data
@AllArgsConstructor
public class ProfesorDto {

    private Integer id;
    private String nombre;
    private String apellido;
    private String rut;
}
