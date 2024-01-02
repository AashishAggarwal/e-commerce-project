package com.productservice.productservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;
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
    public GenericProductDto getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
        return productService.getProductById(id);
    }
    
    @GetMapping
    public List<GenericProductDto> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @DeleteMapping("/{id}")
    public GenericProductDto deleteProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
        return productService.deleteProductById(id);
    }
    
    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto) {
        return productService.createProduct(genericProductDto);
    }
    
    @PatchMapping("/{id}")
    public GenericProductDto updateProductById(@PathVariable("id") Long id, @RequestBody GenericProductDto genericProductDto) {
        return productService.updateProductById(id, genericProductDto);
    }

    // @ExceptionHandler(ProductNotFoundException.class)
    // private ExceptionDto handleProductNotFoundException(ProductNotFoundException e) {
    //     ExceptionDto exceptionDto = new ExceptionDto();
    //     exceptionDto.setMessage(e.getMessage());
    //     exceptionDto.setHttpStatus(HttpStatus.NOT_FOUND);
    //     return exceptionDto;
    // }
}
