package com.itlizesession.joolewebdev.joole_web_development.Repositories;

import com.itlizesession.joolewebdev.joole_web_development.Entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 Created by Zehui Lu
 */
public interface DescriptionRepository extends JpaRepository<Description, Integer> {
    Optional<List<Description>> findDescriptionByManufacturer(String manufacturer);

    Optional<Description> findDescriptionByManufacturerAndSeriesAndModel(String manufacturer, String series, String model);
}