package com.example.app_rest_api.product.repository;
//By Alejandro Jimenez
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.app_rest_api.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
