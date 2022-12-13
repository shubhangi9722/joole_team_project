package com.itlizesession.Repository;


import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductTypeRepository<ProductType> extends JpaRepository<ProductType, Integer> {

}
