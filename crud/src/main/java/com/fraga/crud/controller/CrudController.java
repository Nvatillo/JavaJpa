package com.fraga.crud.controller;


import com.fraga.crud.model.Escuela;
import com.fraga.crud.service.impl.CrudManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class CrudController {

    @Autowired
    private CrudManagementServiceImpl service;

    @PostMapping
    public ResponseEntity saveUser(@RequestBody Escuela escuela){
        return new ResponseEntity(service.saveAccount(escuela), HttpStatus.OK);
    }
}
