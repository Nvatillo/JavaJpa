package com.fraga.crud.service.impl;

import com.fraga.crud.model.Profesor;
import com.fraga.crud.repository.ProfesorRepository;
import com.fraga.crud.service.CrudManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CrudManagementServiceImpl implements CrudManagementService {



    private final ProfesorRepository escuelaRepository;


    public String guardarProfesor(Profesor profesor) {

            System.out.println("Conflictos");
            System.out.println("Test Confli" +
                "");
            escuelaRepository.save(profesor);

            return "ok";

    }

    @Override
    public String editarProfesor(Profesor profesor) {

        Optional<Profesor> escuelaUpdate = escuelaRepository.findById(profesor.getId().toString());




    }
}
