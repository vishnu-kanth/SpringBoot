package com.lpu.ordermanagementsystem.repository;

import com.lpu.ordermanagementsystem.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
