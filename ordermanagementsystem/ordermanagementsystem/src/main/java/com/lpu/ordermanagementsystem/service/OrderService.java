package com.lpu.ordermanagementsystem.service;

import com.lpu.ordermanagementsystem.entity.Order;

import java.util.List;

public interface OrderService {

    Order createOrder(Order order);

    List<Order> getAllOrders();

    Order getOrderById(Long id);

}
