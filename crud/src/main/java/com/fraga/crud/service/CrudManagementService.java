package com.fraga.crud.service;

import com.fraga.crud.model.Profesor;

import java.util.List;

public interface CrudManagementService {


    String guardarProfesor(Profesor profesor);

    String editarProfesor(Profesor profesor);

    String eliminarProfesor(Profesor profesor);

    List<Profesor> listar();
}
