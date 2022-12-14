package com.itlizesession.Repository;

import com.itlizesession.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {
//    Optional<List<ProductType>> findProductTypeByType(String type);
//
//    Optional<List<ProductType>> findProductTypeByApplication(String application);
//
//    Optional<List<ProductType>> findProductTypeByMountingLocation(String mountingLocation);
//
//    Optional<List<ProductType>> findProductTypeByAccessories(String accessories);
//
//    Optional<List<ProductType>> findProductTypeByModelYearBetween(Date start, Date end);
}
