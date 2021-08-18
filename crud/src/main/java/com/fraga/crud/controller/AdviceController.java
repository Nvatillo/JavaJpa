package com.fraga.crud.controller;

import com.fraga.crud.exception.RequestValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceController {

    @ExceptionHandler(RequestValidationException.class)
    public ResponseEntity handlerException(RequestValidationException requestValidationException){
        return new ResponseEntity(requestValidationException.getMessage() , HttpStatus.BAD_REQUEST);
    }

}
