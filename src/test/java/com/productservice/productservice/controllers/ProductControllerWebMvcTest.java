package com.productservice.productservice.controllers;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.services.ProductService;

import jakarta.inject.Inject;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;




@WebMvcTest(ProductController.class)
public class ProductControllerWebMvcTest {

    @MockBean
    private ProductService productService;

    @Inject
    private MockMvc mockMvc;

    @Inject
    private ObjectMapper objectMapper;

    @Test
    void testGetAllProductsReturnsEmptyList() throws Exception {
        when(productService.getAllProducts())
            .thenReturn(new ArrayList<>());

        mockMvc.perform(get("/products"))
            .andExpect(status().isOk())
            .andExpect(content().json("[]"));
    }


    @Test
    void createProductShouldCreateAValidNewProduct() throws Exception {
        GenericProductDto productToCreateDto = new GenericProductDto();
        productToCreateDto.setTitle("Macbook");
        productToCreateDto.setPrice(10000);
        productToCreateDto.setCategory("Laptop");
        productToCreateDto.setDescription("Faster than ever");

        GenericProductDto outputGenericProductDto = new GenericProductDto();
        outputGenericProductDto.setId(100L);
        outputGenericProductDto.setTitle(productToCreateDto.getTitle());
        outputGenericProductDto.setPrice(productToCreateDto.getPrice());
        outputGenericProductDto.setCategory(productToCreateDto.getCategory());
        outputGenericProductDto.setDescription(productToCreateDto.getDescription());

        when(productService.createProduct(productToCreateDto))
            .thenReturn(outputGenericProductDto);

        mockMvc.perform(post("/products")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(productToCreateDto)))
            .andExpect(content().string(objectMapper.writeValueAsString(outputGenericProductDto)))
            .andExpect(status().is(200));

    }
}
