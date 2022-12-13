package com.itlizesession.Services;

import com.itlizesession.Entity.Description;
import com.itlizesession.Entity.Product;
import com.itlizesession.Entity.ProductType;
import com.itlizesession.Entity.TechnicalDetail;

public interface ProductService {
    // create
    boolean createProduct(Product product, ProductType productType, TechnicalDetail technicalDetail,
                          Description description);

    // read
    Product getProduct(Integer productId);

    // update
    boolean updateProduct(Product product, Integer productId);

    // delete
    boolean deleteProduct(Product Product);
}
