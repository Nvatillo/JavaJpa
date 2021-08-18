package com.fraga.crud.service.impl;

import com.fraga.crud.dto.ProfesorDto;
import com.fraga.crud.model.Profesor;
import com.fraga.crud.repository.ProfesorRepository;
import com.fraga.crud.service.CrudManagementService;
import com.fraga.crud.util.CrudUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class CrudManagementServiceImpl implements CrudManagementService {



    private final ProfesorRepository profesorRepository;


    @Override
    public String guardarProfesor(ProfesorDto profesorDto) {

            CrudUtil.validarProfesor(profesorDto);
            // Se traspasa la infomacion de dto a la entidad para no exponer la bd.
            Profesor profesor = new Profesor();
            profesor.setNombre(profesorDto.getNombre());
            profesor.setApellido(profesorDto.getApellido());
            profesor.setRut(profesorDto.getRut());
            profesorRepository.save(profesor);
            return "Guardo";

    }

    @Override
    public String editarProfesor(ProfesorDto profesorDto) {

        CrudUtil.validarProfesor(profesorDto);
        Profesor profesorBd = profesorRepository.findById(profesorDto.getId());
        if (!Objects.isNull(profesorBd)) {
            Profesor profesor = new Profesor();
            profesor.setNombre(profesorDto.getNombre());
            profesor.setApellido(profesorDto.getApellido());
            profesor.setRut(profesorDto.getRut());
            profesorRepository.save(profesor);
        }
        return "Actualizado";

    }

    @Override
    public String eliminarProfesor(Integer id) {


        Profesor profesorBd = profesorRepository.findById(id);
        if (!Objects.isNull(profesorBd)) {
         profesorRepository.delete(profesorBd);
        }
        return "Eliminado";

    }

    @Override
    public List<Profesor> listar() {

        if (profesorRepository.findAll().isEmpty()){
            return Collections.emptyList();
        }
       return profesorRepository.findAll();
    }
}
