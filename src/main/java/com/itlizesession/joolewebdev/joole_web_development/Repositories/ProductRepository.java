package com.itlizesession.joolewebdev.joole_web_development.Repositories;

import com.itlizesession.joolewebdev.joole_web_development.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 Created by Zehui Lu
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<Product> findProductByProductId(Integer productId);

    Optional<List<Product>> findProductsByProductBrand(String brand);

    Optional<List<Product>> findProductsByCertification(String certification);
}
