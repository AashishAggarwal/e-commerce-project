package com.productservice.productservice.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;
import com.productservice.productservice.services.ProductService;
import com.productservice.productservice.thirdPartyClients.fakestoreclient.FakeStoreClient;

import jakarta.inject.Inject;

@SpringBootTest
public class ProductControllerTest {
    
    @Inject
    private ProductController productController;

    @Inject
    private FakeStoreClient fakeStoreClient;

    @MockBean
    private ProductService productService;

    @Test
    void testAddition() {
        assert(1 + 1 == 2);
    }

    // @Test
    // void testGetProductByIdNegativeTC() throws ProductNotFoundException {
    //     assertThrows(ProductNotFoundException.class, () -> productController.getProductById(1000L));
    //     //assertNull(fakeStoreClient.getProductById(1L));
    // }

    @Test
    void testGetProductByIdMocking() throws ProductNotFoundException {
        when(productService.getProductById(100L)).thenReturn(null);
        // assertNull(productController.getProductById(1L));

        assertNull(productController.getProductById(100L));
    }

    @Test
    void testGetProductByIdMockingException() throws ProductNotFoundException {
        when(productService.getProductById(100L))
            .thenThrow(ProductNotFoundException.class);
        // assertNull(productController.getProductById(1L));

        assertThrows(ProductNotFoundException.class, () -> productController.getProductById(100L));
    }

    @Test
    void testGetProductByIdForCustomLogic() throws ProductNotFoundException {
        GenericProductDto genericProductDto = new GenericProductDto();

        when(productService.getProductById(10L))
                .thenReturn(genericProductDto);

        GenericProductDto genericProductDto1 = productController.getProductById(10L);
        assertEquals(genericProductDto, genericProductDto1);
    }

}
