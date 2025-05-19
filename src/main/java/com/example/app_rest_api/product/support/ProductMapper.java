package com.example.app_rest_api.product.support;
//By Alejandro Jimenez
import com.example.app_rest_api.product.api.request.UpdateProductRequest;
import org.springframework.stereotype.Component;
import com.example.app_rest_api.product.api.request.ProductRequest;
import com.example.app_rest_api.product.api.response.ProductResponse;
import com.example.app_rest_api.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}
