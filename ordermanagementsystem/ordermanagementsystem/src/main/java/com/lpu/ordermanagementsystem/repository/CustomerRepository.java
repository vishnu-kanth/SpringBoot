package com.lpu.ordermanagementsystem.repository;

import com.lpu.ordermanagementsystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
