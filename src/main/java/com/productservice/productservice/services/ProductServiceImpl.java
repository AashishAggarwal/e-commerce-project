package com.productservice.productservice.services;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public String getProductById(Long id) {
        // throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
        return "Scaler || Product with id: " + id + " is found. Ghost is here.";
    }

    @Override
    public void getAllProducts() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    @Override
    public void deleteProductById() {
        throw new UnsupportedOperationException("Unimplemented method 'deleteProductById'");
    }

    @Override
    public void createProduct() {
        throw new UnsupportedOperationException("Unimplemented method 'createProduct'");
    }

    @Override
    public void updateProductById() {
        throw new UnsupportedOperationException("Unimplemented method 'updateProductById'");
    }

}
