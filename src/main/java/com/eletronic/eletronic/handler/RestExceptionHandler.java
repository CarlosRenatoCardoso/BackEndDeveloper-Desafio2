package com.eletronic.eletronic.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.eletronic.eletronic.model.ModeloErro;
import com.eletronic.eletronic.model.exception.ResourceBadRequestException;
import com.eletronic.eletronic.model.exception.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handlerResourceNotFoundExeption(ResourceNotFoundException ex){

        ModeloErro erro = new ModeloErro("Not Found", ex.getMessage(), 404);
        return ResponseEntity.status(404).body(erro);
    }

    @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<?> handlerResourceBadRequestExeption(ResourceNotFoundException ex){

        ModeloErro erro = new ModeloErro("Bad Request", ex.getMessage(), 400);
        return ResponseEntity.status(400).body(erro);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handlerResourceExeption(Exception ex){

        ModeloErro erro = new ModeloErro("Internal Server Error", ex.getMessage(), 500);
        return ResponseEntity.status(500).body(erro);
    }
}
