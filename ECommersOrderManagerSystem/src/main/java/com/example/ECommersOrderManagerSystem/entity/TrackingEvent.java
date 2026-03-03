package com.example.ECommersOrderManagerSystem.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventType;
    private LocalDateTime timestamp;
    private String location;

    @ManyToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;
}
