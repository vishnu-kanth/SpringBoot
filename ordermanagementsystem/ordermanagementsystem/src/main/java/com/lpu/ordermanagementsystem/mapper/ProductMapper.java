package com.lpu.ordermanagementsystem.mapper;

import com.lpu.ordermanagementsystem.dto.ProductDTO;
import com.lpu.ordermanagementsystem.entity.Product;

public class ProductMapper {

    public static ProductDTO toDTO(Product product) {

        if (product == null) return null;

        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setStockQuantity(product.getStockQuantity());
        dto.setCategory(product.getCategory());

        return dto;
    }

    public static Product toEntity(ProductDTO dto) {

        if (dto == null) return null;

        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setStockQuantity(dto.getStockQuantity());
        product.setCategory(dto.getCategory());

        return product;
    }
}