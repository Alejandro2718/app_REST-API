package com.example.app_rest_api.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super(String.format("Product with %d not found", id));
        //"Product with" + id + " not found" -> not good practice
    }
}
