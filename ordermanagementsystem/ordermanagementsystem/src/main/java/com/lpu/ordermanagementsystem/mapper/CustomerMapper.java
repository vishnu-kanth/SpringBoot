package com.lpu.ordermanagementsystem.mapper;

import com.lpu.ordermanagementsystem.dto.CustomerDTO;
import com.lpu.ordermanagementsystem.entity.Customer;

public class CustomerMapper {

    public static CustomerDTO toDTO(Customer customer) {

        if (customer == null) return null;

        CustomerDTO dto = new CustomerDTO();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setEmail(customer.getEmail());
        dto.setPhone(customer.getPhone());
        dto.setAddress(customer.getAddress());

        return dto;
    }

    public static Customer toEntity(CustomerDTO dto) {

        if (dto == null) return null;

        Customer customer = new Customer();
        customer.setId(dto.getId());
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setPhone(dto.getPhone());
        customer.setAddress(dto.getAddress());

        return customer;
    }
}
