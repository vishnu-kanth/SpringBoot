package com.example.ECommersOrderManagerSystem.service;

import com.example.ECommersOrderManagerSystem.dto.*;
import org.springframework.data.domain.Page;

public interface ShipmentService {

    ShipmentResponseDTO createShipment(ShipmentRequestDTO dto);

    Page<ShipmentResponseDTO> getAllShipments(int page, int size);

    ShipmentResponseDTO getShipmentById(Long id);

    void deleteShipment(Long id);
}
