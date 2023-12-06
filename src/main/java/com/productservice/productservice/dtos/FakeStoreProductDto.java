package com.productservice.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    // DTO - Dta Transfer Object

    private long id;
    private String title;
    private int price;
    private String category;
    private String description;
    private String image;
    private int dimensions;
    
}
