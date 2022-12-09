package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.ProductType;
import com.itlizesession.Repositories.ProductTypeRepository;
import com.itlizesession.Services.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ProductTypeServiceImplements implements ProductTypeService {

    @Autowired
    private ProductTypeRepository repository;

    @Override
    public ProductType create(ProductType ProductType) {
        return null;
    }

    @Override
    public ProductType findByOneId(int id) {
        return null;
    }

    @Override
    public Set<ProductType> readAll() {
        return null;
    }

    @Override
    public ProductType update(ProductType ProductType) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
