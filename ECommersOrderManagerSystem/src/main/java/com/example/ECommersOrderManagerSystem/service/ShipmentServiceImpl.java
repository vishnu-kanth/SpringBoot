package com.example.ECommersOrderManagerSystem.service;

import com.example.ECommersOrderManagerSystem.dto.*;
import com.example.ECommersOrderManagerSystem.entity.*;
import com.example.ECommersOrderManagerSystem.mapper.ShipmentMapper;
import com.example.ECommersOrderManagerSystem.repository.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;
    private final WarehouseRepository warehouseRepository;
    private final ShipmentMapper mapper;

    public ShipmentServiceImpl(
            ShipmentRepository shipmentRepository,
            WarehouseRepository warehouseRepository,
            ShipmentMapper mapper) {

        this.shipmentRepository = shipmentRepository;
        this.warehouseRepository = warehouseRepository;
        this.mapper = mapper;
    }

    // CREATE
    @Override
    @Transactional
    public ShipmentResponseDTO createShipment(ShipmentRequestDTO dto) {

        Warehouse warehouse =
                warehouseRepository.findById(dto.getWarehouseId())
                        .orElseThrow(() ->
                                new RuntimeException("Warehouse not found"));

        Shipment shipment = mapper.toEntity(dto, warehouse);

        Shipment saved = shipmentRepository.save(shipment);

        return mapper.toDTO(saved);
    }

    // READ ALL (Pagination)
    @Override
    public Page<ShipmentResponseDTO> getAllShipments(int page, int size) {

        Page<Shipment> shipments =
                shipmentRepository.findAll(PageRequest.of(page, size));

        return shipments.map(mapper::toDTO);
    }

    // READ BY ID
    @Override
    public ShipmentResponseDTO getShipmentById(Long id) {

        Shipment shipment =
                shipmentRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException("Shipment not found"));

        return mapper.toDTO(shipment);
    }

    // DELETE
    @Override
    public void deleteShipment(Long id) {

        shipmentRepository.deleteById(id);
    }
}