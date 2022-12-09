package com.itlizesession.Repositories;

import com.itlizesession.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

/**
 Created by Zehui Lu
 */
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {
    Optional<List<ProductType>> findProductTypeByType(String type);

    Optional<List<ProductType>> findProductTypeByApplication(String application);

    Optional<List<ProductType>> findProductTypeByMountingLocation(String mountingLocation);

    Optional<List<ProductType>> findProductTypeByAccessories(String accessories);

    Optional<List<ProductType>> findProductTypeByModelYearBetween(Date start, Date end);
}
