package com.example.ECommersOrderManagerSystem.repository;

import com.example.ECommersOrderManagerSystem.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}