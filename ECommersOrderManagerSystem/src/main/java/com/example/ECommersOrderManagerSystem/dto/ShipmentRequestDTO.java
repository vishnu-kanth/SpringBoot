package com.example.ECommersOrderManagerSystem.dto;

import jakarta.validation.constraints.*;

import lombok.Data;

@Data
public class ShipmentRequestDTO {

    @NotBlank(message = "Tracking number required")
    private String trackingNumber;

    @NotBlank(message = "Status required")
    private String status;

    @Email(message = "Invalid email")
    private String customerEmail;

    @NotNull(message = "Warehouse id required")
    private Long warehouseId;
}