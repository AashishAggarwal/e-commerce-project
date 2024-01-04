package com.productservice.productservice.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.productservice.models.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    @Override
    List<Product> findAll();

    List<Product> findAllByTitle(String title);

    List<Product> findAllByTitleAndDescription(String title, String description);

    List<Product> findByPrice_ValueGreaterThanEqual(Integer value);

    List<Product> findByPrice_ValueLessThanEqual(Integer value);

    List<Product> findByPrice_ValueBetween(Integer x, Integer y);
}
