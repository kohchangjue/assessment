package com.example.Assessment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class FeatureNotModifiedAdvice {

    @ResponseBody
    @ExceptionHandler(FeatureNotModifiedException.class)
    ResponseEntity<Object> featureNotModifiedHandler(FeatureNotModifiedException ex) {
        return new ResponseEntity<Object>(HttpStatus.NOT_MODIFIED);
    }
}




