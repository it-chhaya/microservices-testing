package com.chanchhaya.product.controller;

import java.util.List;

import com.chanchhaya.product.entity.Product;
import com.chanchhaya.product.service.impl.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductServiceImpl productServiceImpl;

    @Autowired
    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @PostMapping
    public Product createNewProduct(@RequestBody Product product) {
        return productServiceImpl.createNewProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProductById(@PathVariable("id") Long id, @RequestBody Product product) {
        product.setId(id);
        return productServiceImpl.updateProductById(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productServiceImpl.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productServiceImpl.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable("id") Long id) {
        productServiceImpl.deleteProductById(id);
        return "Product is deleted successfully";
    }
    
}
