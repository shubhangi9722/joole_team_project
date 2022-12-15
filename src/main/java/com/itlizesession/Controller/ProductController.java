package com.itlizesession.Controller;

import com.itlizesession.Entity.Product;
//import com.itlizesession.Entity.Description;
//import com.itlizesession.Entity.ProductType;
//import com.itlizesession.Entity.TechnicalDetail;
import com.itlizesession.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    // Get all products
    @GetMapping("/allProducts")
    public ResponseEntity<List<Product>>findAllProducts() { return new ResponseEntity<>(productService.findAllProducts(), HttpStatus.OK) ; }

    @GetMapping("/{id}")
        public ResponseEntity<Product> findProductBYId(@PathVariable int id) {
            return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

//    @PostMapping("/create")
//    public Product createProduct(@RequestParam("brand") String brand, @RequestParam("certification") String certification,
//                                 @RequestBody ProductType productType, @RequestBody TechnicalDetail technicalDetail, @RequestBody Description description) {
//        Product product1 = new Product();
//        product1.setProductBrand(brand);
//        product1.setCertification(certification);
//        product1.setProductType(productType);
//        product1.setTechnicalDetail(technicalDetail);
//        product1.setDescription(description);
//        return productService.createProduct(product1);
//    }
//
    @GetMapping("/{id}")
    public ResponseEntity<Product> readProduct(@RequestParam("productId") Integer productId) {
        return new ResponseEntity<>(productService.getProduct(productId), HttpStatus.OK);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        productService.updateProduct(product, product.getProductId());
        return new ResponseEntity<>(productService.getProduct(product.getProductId()), HttpStatus.OK) ;
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id) {
        return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
    }
}
