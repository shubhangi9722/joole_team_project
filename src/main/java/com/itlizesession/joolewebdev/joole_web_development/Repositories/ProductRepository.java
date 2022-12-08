package com.itlizesession.joolewebdev.joole_web_development.Repositories;

import com.itlizesession.joolewebdev.joole_web_development.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
