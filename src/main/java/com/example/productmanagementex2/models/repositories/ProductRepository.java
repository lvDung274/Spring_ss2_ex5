package com.example.productmanagementex2.models.repositories;

import com.example.productmanagementex2.models.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(1, "Ip", 18000),
                    new Product(2, "flycam", 66666),
                    new Product(3, "laptop", 23333),
                    new Product(4, "camera", 15222)
            )
    );
    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(String id) {
        return products.stream()
                .filter(p -> String.valueOf(p.getId()).equals(id))
                .findFirst()
                .orElse(null);
    }

    public Product save(Product product) {
        products.add(product);
        return product;
    }

    public Product updateProduct(String id, Product updatedProduct) {
        Product existing = getProductById(id);
        if (existing != null) {
            existing.setName(updatedProduct.getName());
            existing.setPrice(updatedProduct.getPrice());
            return existing;
        }
        return null;
    }

    public void deleteById(String id) {
        products.removeIf(p -> String.valueOf(p.getId()).equals(id));    }
}
