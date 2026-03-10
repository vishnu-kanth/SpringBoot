package com.lpu.ordermanagementsystem.controller;


import com.lpu.ordermanagementsystem.entity.Customer;
import com.lpu.ordermanagementsystem.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
    @DeleteMapping("/{id}")

    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }

}
