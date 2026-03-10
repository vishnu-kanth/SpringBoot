package com.lpu.ordermanagementsystem.service;

import com.lpu.ordermanagementsystem.entity.Customer;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    void deleteCustomer(Long id);
}
