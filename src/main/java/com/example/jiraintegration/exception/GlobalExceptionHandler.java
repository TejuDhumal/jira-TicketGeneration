package com.example.jiraintegration.exception;

import com.example.jiraintegration.dto.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity handleGlobalException(Exception e){
        String message = e.getMessage();
        ApiError error = new ApiError(message);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
