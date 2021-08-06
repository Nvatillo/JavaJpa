package com.fraga.crud.service.impl;

import com.fraga.crud.model.Profesor;
import com.fraga.crud.repository.ProfesorRepository;
import com.fraga.crud.service.CrudManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CrudManagementServiceImpl implements CrudManagementService {



    private final ProfesorRepository profesorRepository;


    @Override
    public String guardarProfesor(Profesor profesor) {

            if (Objects.nonNull(profesor)){
                profesorRepository.save(profesor);
                return "Guardo";
            }
            return "Ops Algo Fallo";
    }

    @Override
    public String editarProfesor(Profesor profesor) {

        if (Objects.nonNull(profesor)){
                profesorRepository.save(profesor);
                return "Actualizado";

        }
        return "Ops Algo Fallo, intente mas tarde";

    }

    @Override
    public String eliminarProfesor(Profesor profesor) {

        if (Objects.nonNull(profesor)) {

            profesorRepository.delete(profesor);
            return "Eliminado";
        }
        return "Ops Algo Fallo, intente mas tarde";

    }

    @Override
    public List<Profesor> listar() {

       return profesorRepository.findAll();
    }
}
