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
}
