package com.fraga.crud.service;

import com.fraga.crud.dto.ProfesorDto;
import com.fraga.crud.model.Profesor;

import java.util.List;

public interface CrudManagementService {


    String guardarProfesor(ProfesorDto profesorDto);

    String editarProfesor(ProfesorDto profesorDto);

    String eliminarProfesor(Integer id);

    List<Profesor> listar();
}
