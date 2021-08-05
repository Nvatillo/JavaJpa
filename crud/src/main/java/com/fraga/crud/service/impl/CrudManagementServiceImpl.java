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

    public String saveAccount(Escuela escuela) {

        if (Objects.nonNull(escuela.getNombre()) && Objects.nonNull(escuela.getApellido()))
        {
            escuelaRepository.save(escuela);
            System.out.println("Prueba Git");
            return "Se agrego correctamente";
        }
        return "Debe agregar nombre y contraseña";
    }
}
