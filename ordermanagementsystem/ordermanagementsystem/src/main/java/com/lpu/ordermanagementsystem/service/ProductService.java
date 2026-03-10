package com.lpu.ordermanagementsystem.service;

import com.lpu.ordermanagementsystem.entity.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    void deleteProduct(Long id);

}


