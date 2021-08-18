package com.fraga.crud.util;

import com.fraga.crud.dto.ProfesorDto;
import com.fraga.crud.exception.RequestValidationException;
import lombok.experimental.UtilityClass;

import java.util.Objects;

@UtilityClass // clase se vuelva singleton con constructor privado
public class CrudUtil {

    public static void validarProfesor(ProfesorDto profesorDto){

        if (Objects.isNull(profesorDto))
            throw new RequestValidationException("El objeto no puede ser nulo");
        if (Objects.isNull(profesorDto.getNombre()) || "".equals(profesorDto.getNombre()))
            throw new RequestValidationException("El nombre del profesor es obligatorio");
        if (Objects.isNull(profesorDto.getApellido()) || "".equals(profesorDto.getApellido()))
            throw new RequestValidationException("El apellido del profesor es obligatorio");
        if (Objects.isNull(profesorDto.getRut()) || "".equals(profesorDto.getRut()))
            throw new RequestValidationException("El rut del profesor es obligatorio");
    }


}
