package com.example.Assessment.repository;

import com.example.Assessment.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FeatureRepository extends JpaRepository<Feature, Long> {
    Optional<Feature> findByEmailAndFeatureName(String email, String featureName);
}
