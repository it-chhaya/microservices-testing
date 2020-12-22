package com.chanchhaya.product.service;

import java.util.List;

import com.chanchhaya.product.entity.Product;

public interface ProductService {

    Product createNewProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProductById(Product product);
    void deleteProductById(Long id);
    
}
