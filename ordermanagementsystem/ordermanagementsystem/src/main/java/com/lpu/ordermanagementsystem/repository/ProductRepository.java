package com.lpu.ordermanagementsystem.repository;


import com.lpu.ordermanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
