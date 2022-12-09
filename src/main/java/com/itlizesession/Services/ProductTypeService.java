package com.itlizesession.Services;

import com.itlizesession.Entity.ProductType;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

public interface ProductTypeService {
    @Transactional
    ProductType create(ProductType ProductType);

    ProductType findByOneId(int id);

    Set<ProductType> readAll();

    ProductType update(ProductType ProductType);

    void delete(int id);
}
