package com.example.ECommersOrderManagerSystem.repository;

import com.example.ECommersOrderManagerSystem.entity.TrackingEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingEventRepository extends JpaRepository<TrackingEvent, Long> {
}