package com.example.app_rest_api.product.service;
//By Alejandro Jimenez
import com.example.app_rest_api.product.api.request.UpdateProductRequest;
import com.example.app_rest_api.product.support.ProductExceptionSupplier;
import org.springframework.stereotype.Service;
import com.example.app_rest_api.product.api.request.ProductRequest;
import com.example.app_rest_api.product.api.response.ProductResponse;
import com.example.app_rest_api.product.domain.Product;
import com.example.app_rest_api.product.repository.ProductRepository;
import com.example.app_rest_api.product.support.ProductMapper;
//By Alejandro Jimenez
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }

    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return productMapper.toProductResponse(product);
    }

    public ProductResponse update(Long id, UpdateProductRequest updateProductRequest) {
        Product product = productRepository.findById(id).orElseThrow(
                ProductExceptionSupplier.productNotFound(id));
        productRepository.save(productMapper.toProduct(product, updateProductRequest));
        return productMapper.toProductResponse(product);
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream().map(productMapper::toProductResponse).collect(Collectors.toList());
    }
    public void delete(Long id){
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        productRepository.deleteById(product.getId());
    }

}
