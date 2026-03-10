package com.lpu.ordermanagementsystem.service.impl;


import com.lpu.ordermanagementsystem.entity.Customer;
import com.lpu.ordermanagementsystem.exception.ResourceNotFoundException;
import com.lpu.ordermanagementsystem.repository.CustomerRepository;
import com.lpu.ordermanagementsystem.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        Customer customer = customerRepository
                .findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Customer not found with id " + id));
        return customer;
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
