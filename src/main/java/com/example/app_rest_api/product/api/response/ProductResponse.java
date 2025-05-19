package com.example.app_rest_api.product.api.response;
//By Alejandro Jimenez
public class ProductResponse {
    private final Long id;

    private final String name;

    public ProductResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }
}
