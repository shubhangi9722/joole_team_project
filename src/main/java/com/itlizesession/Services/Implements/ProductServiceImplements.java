package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.Product;
import com.itlizesession.Repositories.ProductRepository;
import com.itlizesession.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplements implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
