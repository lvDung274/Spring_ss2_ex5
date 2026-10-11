package com.example.productmanagementex2.models.services;

import com.example.productmanagementex2.models.entities.Product;
import com.example.productmanagementex2.models.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
private  final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
    public Product getProductById(String id) {
        return productRepository.getProductById(id);
    }
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product update(String id, Product product) {
        return productRepository.updateProduct(id, product);
    }

    public void deleteById(String id) {
        productRepository.deleteById(id);
    }
}
