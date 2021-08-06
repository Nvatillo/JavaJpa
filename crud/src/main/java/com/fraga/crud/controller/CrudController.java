package com.fraga.crud.controller;


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
    public ResponseEntity saveProfesor(@RequestBody Profesor profesor){

        return new ResponseEntity(service.guardarProfesor(profesor), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity eliminarProfesor(@RequestBody Profesor profesor)
    {
        return new ResponseEntity(service.eliminarProfesor(profesor),HttpStatus.OK);
    }

    @PutMapping("/actualizar")
    public ResponseEntity actualizarProfesor(@RequestBody Profesor escuela)
    {
        return new ResponseEntity(service.editarProfesor(escuela),HttpStatus.OK);
    }

    @GetMapping("/listar")
    public ResponseEntity actualizarProfesor()
    {
        return new ResponseEntity(service.listar(),HttpStatus.OK);
    }
}
