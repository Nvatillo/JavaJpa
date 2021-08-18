package com.fraga.crud.controller;


import com.fraga.crud.dto.ProfesorDto;
import com.fraga.crud.model.Profesor;
import com.fraga.crud.service.impl.CrudManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class CrudController {

    @Autowired
    private CrudManagementServiceImpl service;

    @PostMapping
    public ResponseEntity saveProfesor(@RequestBody ProfesorDto profesorDto){

        return new ResponseEntity(service.guardarProfesor(profesorDto), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity eliminarProfesor(@PathVariable Integer id )
    {
        return new ResponseEntity(service.eliminarProfesor(id),HttpStatus.OK);
    }

    @PutMapping("/actualizar")
    public ResponseEntity actualizarProfesor(@RequestBody ProfesorDto profesorDto)
    {
        return new ResponseEntity(service.editarProfesor(profesorDto),HttpStatus.OK);
    }

    @GetMapping("/listar")
    public ResponseEntity actualizarProfesor()
    {
        return new ResponseEntity(service.listar(),HttpStatus.OK);
    }
}
