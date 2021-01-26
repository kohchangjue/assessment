package com.example.Assessment.exception;

public class FeatureNotFoundException extends RuntimeException {

    public FeatureNotFoundException(String email, String featureName) {
        super("Could not find feature " + featureName + " with email "+email);
    }
}
