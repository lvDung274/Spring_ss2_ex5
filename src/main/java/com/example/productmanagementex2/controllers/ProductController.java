package com.example.productmanagementex2.controllers;

import com.example.productmanagementex2.models.entities.Product;
import com.example.productmanagementex2.models.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/app/product")
@RequiredArgsConstructor
public class ProductController {
private final ProductService productService;
  @GetMapping
    public List<Product> getAllProducts(){
      return productService.getAllProducts();
  }
}
