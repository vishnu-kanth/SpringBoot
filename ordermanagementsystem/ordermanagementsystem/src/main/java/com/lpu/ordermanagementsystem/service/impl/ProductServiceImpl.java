package com.lpu.ordermanagementsystem.service.impl;

import com.lpu.ordermanagementsystem.entity.Product;
import com.lpu.ordermanagementsystem.repository.ProductRepository;
import com.lpu.ordermanagementsystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productReposiroty;


    public Product createProduct(Product product) {
        return productReposiroty.save(product);
    }

    public List<Product> getAllProducts() {
        return productReposiroty.findAll();
    }

    public Product getProductById(Long id) {
        return productReposiroty.findById(id).orElse(null);
    }

    @Override
    public void deleteProduct(Long id) {
        productReposiroty.deleteById(id);
    }
}