package com.lpu.ordermanagementsystem.mapper;

import com.lpu.ordermanagementsystem.dto.OrderDTO;
import com.lpu.ordermanagementsystem.entity.Order;



public class OrderMapper {

    public static OrderDTO toDTO(Order order) {

        if (order == null) {
            return null;
        }

        return OrderDTO.builder()
                .id(order.getId())
                .orderDate(order.getOrderDate())
                .status(order.getStatus())
                .totalAmount(order.getTotalAmount())
                .customerId(order.getCustomer() != null ? order.getCustomer().getId() : null)
                .build();
    }

    public static Order toEntity(OrderDTO dto) {

        if (dto == null) {
            return null;
        }

        Order order = new Order();

        order.setId(dto.getId());
        order.setOrderDate(dto.getOrderDate());
        order.setStatus(dto.getStatus());
        order.setTotalAmount(dto.getTotalAmount());

        return order;
    }
}

