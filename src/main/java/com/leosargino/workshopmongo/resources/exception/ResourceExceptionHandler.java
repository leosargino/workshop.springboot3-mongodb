package com.leosargino.workshopmongo.resources.exception;

import com.leosargino.workshopmongo.service.exception.ObjetcNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjetcNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjetcNotFoundException e, HttpServletRequest request){

        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(),status.value(),"Não encontrado",e.getMessage(),request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
