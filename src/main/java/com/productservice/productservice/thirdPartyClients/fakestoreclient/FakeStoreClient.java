package com.productservice.productservice.thirdPartyClients.fakestoreclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;

@Component
public class FakeStoreClient{

    private RestTemplateBuilder restTemplateBuilder;

    private String specificProductUrl;
    private String genericProductsUrl;

    FakeStoreClient(RestTemplateBuilder restTemplateBuilder, 
        @Value("${fakestore.api.url}") String fakeStoreUrl,
        @Value("${fakestore.api.paths.products}") String pathForProducts) {
        this.restTemplateBuilder = restTemplateBuilder;
        this.specificProductUrl = fakeStoreUrl + pathForProducts + "/{id}";
        this.genericProductsUrl = fakeStoreUrl + pathForProducts;
    }

    public FakeStoreProductDto getProductById(Long id) throws ProductNotFoundException {
        // Integrate the FakeStore API here
        // RestTemplate

        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity = 
            restTemplate.getForEntity(specificProductUrl, FakeStoreProductDto.class, id);

        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();

        if (fakeStoreProductDto == null) {
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }

        return fakeStoreProductDto;
    }

    public List<FakeStoreProductDto> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto[]> responseEntity = 
            restTemplate.getForEntity(genericProductsUrl, FakeStoreProductDto[].class);

        List<FakeStoreProductDto> fakeStoreProductDtos = List.of(responseEntity.getBody());

        return fakeStoreProductDtos;
    }

    public FakeStoreProductDto deleteProductById(Long id) throws ProductNotFoundException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        
		RequestCallback requestCallback = restTemplate.acceptHeaderRequestCallback(FakeStoreProductDto.class);
		ResponseExtractor<ResponseEntity<FakeStoreProductDto>> responseExtractor = 
            restTemplate.responseEntityExtractor(FakeStoreProductDto.class);
        ResponseEntity<FakeStoreProductDto> responseEntity = 
            restTemplate.execute(specificProductUrl, HttpMethod.DELETE, requestCallback, responseExtractor, id);

        if (responseEntity == null) {
            throw new ProductNotFoundException("Product with id " + id + " not found");
        }

		return responseEntity.getBody();
    }

    public FakeStoreProductDto createProduct(GenericProductDto genericProductDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        
        ResponseEntity<FakeStoreProductDto> responseEntity = 
            restTemplate.postForEntity(genericProductsUrl, genericProductDto, FakeStoreProductDto.class);
        return responseEntity.getBody();
    }

    public FakeStoreProductDto updateProductById(Long id, GenericProductDto genericProductDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        
        FakeStoreProductDto responseEntity = 
            restTemplate.patchForObject(specificProductUrl, genericProductDto, FakeStoreProductDto.class, id);
        return responseEntity;
    }
    
}
