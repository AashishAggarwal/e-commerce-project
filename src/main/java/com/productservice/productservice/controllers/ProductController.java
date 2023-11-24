package com.productservice.productservice.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.productservice.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    //Constructor Injection
    ProductController(ProductService productService) {
        this.productService = productService;
    } 

    // localhost:8080/products/1
    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id) {
        // return "Scaler || Product with id: " + id + " is found.";

        return productService.getProductById(id);
    }
    
    @GetMapping
    public void getAllProducts() {
    
    }
    
    @DeleteMapping("/{id}")
    public void deleteProductById() {
    
    }
    
    public void createProduct() {
    
    }
    
    public void updateProductById() {
    
    }

}
