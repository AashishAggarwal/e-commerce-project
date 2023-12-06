package com.productservice.productservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.productservice.productservice.dtos.ExceptionDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;

@ControllerAdvice 
public class ProductControllerAdvices {
    
    @ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException e) {

        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setHttpStatus(HttpStatus.NOT_FOUND);
        exceptionDto.setMessage(e.getMessage());
        return new ResponseEntity<>(exceptionDto, HttpStatus.BAD_REQUEST);

    }

    // @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    // @ResponseStatus(HttpStatus.NOT_FOUND)
    // @ResponseBody()
    // private ExceptionDto handleArrayIndexOutofBoundException(ArrayIndexOutOfBoundsException e) {
        
    //     ExceptionDto exceptionDto = new ExceptionDto();
    //     exceptionDto.setHttpStatus(HttpStatus.NOT_FOUND);
    //     exceptionDto.setMessage(e.getMessage());
    //     return exceptionDto;

    // }

    // @ExceptionHandler(NullPointerException.class)
    // private ResponseEntity<ExceptionDto> NullPointerException( NullPointerException nullPointerException) {
    //     return null;
    // }
}
