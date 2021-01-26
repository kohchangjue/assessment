package com.example.Assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Feature {

    private @Id @GeneratedValue Long id;
    private @Column String featureName;
    private @Column String email;
    private @Column Boolean enable;

    public Feature() {}

    public Feature(String featureName, String email, Boolean enable) {

        this.featureName=featureName;
        this.email=email;
        this.enable=enable;
    }

    public Long getId() {
        return this.id;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public String getEmail() {
        return this.email;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

}