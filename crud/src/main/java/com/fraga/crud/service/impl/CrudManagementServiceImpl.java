package com.fraga.crud.service.impl;

import com.fraga.crud.model.Escuela;
import com.fraga.crud.repository.EscuelaRepository;
import com.fraga.crud.service.CrudManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class CrudManagementServiceImpl implements CrudManagementService {



    private final EscuelaRepository escuelaRepository;

    public String guardarProfesor(Escuela escuela) {

            System.out.println("Conflictos");
            System.out.println("Test Confli" +
                "");
            escuelaRepository.save(escuela);


            return "ok";

    }
}
