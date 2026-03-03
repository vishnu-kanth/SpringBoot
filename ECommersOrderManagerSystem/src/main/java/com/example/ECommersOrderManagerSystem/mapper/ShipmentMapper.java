package com.example.ECommersOrderManagerSystem.mapper;

import com.example.ECommersOrderManagerSystem.dto.*;
import com.example.ECommersOrderManagerSystem.entity.*;
import org.springframework.stereotype.Component;

@Component
public class ShipmentMapper {

    // RequestDTO → Entity
    public Shipment toEntity(ShipmentRequestDTO dto, Warehouse warehouse) {

        Shipment shipment = new Shipment();

        shipment.setTrackingNumber(dto.getTrackingNumber());
        shipment.setStatus(dto.getStatus());
        shipment.setCustomerEmail(dto.getCustomerEmail());
        shipment.setWarehouse(warehouse);

        return shipment;
    }

    // Entity → ResponseDTO
    public ShipmentResponseDTO toDTO(Shipment shipment) {

        ShipmentResponseDTO dto = new ShipmentResponseDTO();

        dto.setId(shipment.getId());
        dto.setTrackingNumber(shipment.getTrackingNumber());
        dto.setStatus(shipment.getStatus());
        dto.setCustomerEmail(shipment.getCustomerEmail());

        if (shipment.getWarehouse() != null) {
            dto.setWarehouseName(
                    shipment.getWarehouse().getName());
        }

        return dto;
    }
}