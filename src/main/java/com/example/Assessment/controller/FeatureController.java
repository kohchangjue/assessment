package com.example.Assessment.controller;

import com.example.Assessment.exception.FeatureNotModifiedException;
import com.example.Assessment.model.Feature;
import com.example.Assessment.exception.FeatureNotFoundException;
import com.example.Assessment.repository.FeatureRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
class FeatureController {

    private final FeatureRepository repository;

    FeatureController(FeatureRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/feature")
    Map<String, Boolean> getFeature(@RequestParam String email, @RequestParam String featureName) {
        return repository.findByEmailAndFeatureName(email, featureName)
                .map(feature-> Collections.singletonMap("canAccess", feature.getEnable()))
                .orElseThrow(() -> new FeatureNotFoundException(email,featureName));

    }

    @PostMapping("/feature")
    ResponseEntity<Object> createFeature(@RequestBody Feature newFeature) {
        try{
            repository.save(newFeature);
        }
        catch (Exception ex){
            throw new FeatureNotModifiedException();
        }
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}