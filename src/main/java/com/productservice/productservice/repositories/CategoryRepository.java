package com.productservice.productservice.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.productservice.models.Category;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
    
}
