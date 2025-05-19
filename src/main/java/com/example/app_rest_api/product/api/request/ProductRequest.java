package com.example.app_rest_api.product.api.request;
//By Alejandro Jimenez
import com.fasterxml.jackson.annotation.JsonCreator;

public class ProductRequest {
    private final String name;
    
    @JsonCreator
    public ProductRequest(String name) { this.name = name; }
    
    
    public String getName() { return name; }
}
