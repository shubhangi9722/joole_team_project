package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.Description;
import com.itlizesession.Entity.Product;
import com.itlizesession.Entity.ProductType;
import com.itlizesession.Entity.TechnicalDetail;
import com.itlizesession.Repositories.DescriptionRepository;
import com.itlizesession.Repositories.ProductRepository;
import com.itlizesession.Repositories.ProductTypeRepository;
import com.itlizesession.Repositories.TechnicalDetailRepository;
import com.itlizesession.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImplements implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private DescriptionRepository descriptionRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private TechnicalDetailRepository technicalDetailRepository;

    @Override
    public boolean createProduct(Product product, ProductType productType, TechnicalDetail technicalDetail,
                                 Description description) {
        if (product == null) {
            System.out.println("null input");
            return false;
        }
        Product target = getProduct(product.getProductId());
        if (target != null) {
            System.out.println("Product already exists");
            return false;
        }
        try {
            product.setProductType(productType);
            product.setDescription(description);
            product.setTechnicalDetail(technicalDetail);

            productTypeRepository.save(productType);
            descriptionRepository.save(description);
            technicalDetailRepository.save(technicalDetail);
            productRepository.save(product);
        } catch (Exception e) {
            System.out.println("something wrong when creating: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Product getProduct(Integer productId) {
        if (productId == null) return null;
        Optional<Product> res = productRepository.findById(productId);
        if (res.isPresent()) {
            return res.get();
        }
        return null;
    }

    @Override
    public boolean updateProduct(Product product, Integer productId) {
        if (product == null || productId == null) {
            System.out.println("null input");
            return false;
        }
        Product productToUpdate = productRepository.getById(productId);
        if (productToUpdate == null) {
            System.out.println("No description with id: " + productId);
            return false;
        }
        try {
            productToUpdate.setProductBrand(product.getProductBrand());
            productToUpdate.setCertification(product.getCertification());
        } catch (Exception e) {
            System.out.println("something wrong when updating: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteProduct(Product product) {
        if (product == null) {
            System.out.println("null input");
            return false;
        }
        try {
            productRepository.delete(product);
        } catch (Exception e) {
            System.out.println("something wrong when deleting: " + e.getMessage());
            return false;
        }
        return true;
    }
}
