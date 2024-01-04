package com.productservice.productservice.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category extends BaseModel {
    @Column(nullable = false, unique = true)
    private String name;
    
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}

// Catergory ----- Product