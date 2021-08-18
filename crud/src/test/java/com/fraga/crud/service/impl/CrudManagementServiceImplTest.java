package com.fraga.crud.service.impl;

import com.fraga.crud.dto.ProfesorDto;
import com.fraga.crud.model.Profesor;
import com.fraga.crud.repository.ProfesorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CrudManagementServiceImplTest {


    @InjectMocks// InjectMocks es para injectar y poder usar los metodos.
    private CrudManagementServiceImpl service;

    @Mock // Es para emular el comportamiento de los metodos .
    private ProfesorRepository profesorRepository;

    private ProfesorDto profesorDto;

    private Profesor profesor;

    public ProfesorDto obtenerProfesorDto(){
        profesorDto = new ProfesorDto(
                1,
                "Francisco",
                "Gajardo",
                "19305272-k"
        );
        return profesorDto;
    }

    public Profesor obtenerProfesor(){
        profesor = new Profesor();
        profesor.setNombre("Francisco");
        profesor.setApellido("Gajardo");
        profesor.setRut("19305272-k");
        return profesor;
    }
    @Test
    void guardarProfesorOk() {
        ProfesorDto profesorDto = obtenerProfesorDto();
        Profesor profesor = obtenerProfesor();
        Assertions.assertEquals("Guardo",service.guardarProfesor(profesorDto));


    }

    @Test
    void editarProfesor() {
        ProfesorDto profesorDto = obtenerProfesorDto();
        Profesor profesor = obtenerProfesor();
        Assertions.assertEquals("Actualizado",service.editarProfesor(profesorDto));

    }

    @Test
    void eliminarProfesor() {

        Assertions.assertEquals("Eliminado",service.eliminarProfesor(5));
    }

    @Test
    void listar() {
        List<Profesor> profesors = new ArrayList<>();
        assertEquals(profesors, service.listar());
    }

}