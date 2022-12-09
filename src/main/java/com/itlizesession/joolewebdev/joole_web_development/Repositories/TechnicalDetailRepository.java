package com.itlizesession.joolewebdev.joole_web_development.Repositories;

import com.itlizesession.joolewebdev.joole_web_development.Entity.TechnicalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 Created by Zehui Lu
 */
public interface TechnicalDetailRepository extends JpaRepository<TechnicalDetail, Integer> {
    Optional<List<TechnicalDetail>> findTechnicalDetailsByAirflowBetween(Integer min, Integer max);

    Optional<List<TechnicalDetail>> findTechnicalDetailsByPowerBetween(Integer min, Integer max);

    Optional<List<TechnicalDetail>> findTechnicalDetailsBySoundAtMaxSpeedBetween(Integer min, Integer max);

    Optional<List<TechnicalDetail>> findTechnicalDetailsByFanSweepDiameterBetween(Integer min, Integer max);

    Optional<List<TechnicalDetail>> findTechnicalDetailsByHeightBetween(Integer min, Integer max);
}
