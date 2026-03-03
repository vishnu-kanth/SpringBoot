package com.example.ECommersOrderManagerSystem.dto;

import lombok.Data;

@Data
public class ShipmentResponseDTO {

    private Long id;
    private String trackingNumber;
    private String status;
    private String customerEmail;
    private String warehouseName;
}
