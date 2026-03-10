package com.lpu.ordermanagementsystem.service.impl;

import com.lpu.ordermanagementsystem.entity.Order;
import com.lpu.ordermanagementsystem.exception.ResourceNotFoundException;
import com.lpu.ordermanagementsystem.repository.OrderRepository;
import com.lpu.ordermanagementsystem.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository
                .findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Order not found with id " + id));
    }
}
