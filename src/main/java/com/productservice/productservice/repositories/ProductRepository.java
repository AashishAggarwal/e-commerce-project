package com.productservice.productservice.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.productservice.models.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    
}
