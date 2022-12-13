package com.itlizesession.Service.Implements;

import com.itlizesession.Entity.Product;
import com.itlizesession.Repository.ProductRepository;
import com.itlizesession.Service.ProductService;
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
