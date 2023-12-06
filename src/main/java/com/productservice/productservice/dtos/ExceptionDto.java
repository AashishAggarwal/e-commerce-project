package com.productservice.productservice.dtos;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionDto {
    private HttpStatus httpStatus;
    private String message;
}
