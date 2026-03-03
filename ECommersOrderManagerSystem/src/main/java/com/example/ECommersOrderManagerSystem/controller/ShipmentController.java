package com.example.ECommersOrderManagerSystem.controller;

import com.example.ECommersOrderManagerSystem.dto.*;
import com.example.ECommersOrderManagerSystem.service.ShipmentService;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    // CREATE SHIPMENT
    @PostMapping
    public ShipmentResponseDTO createShipment(
            @Valid @RequestBody ShipmentRequestDTO dto) {

        return shipmentService.createShipment(dto);
    }

    // GET ALL SHIPMENTS (Pagination)
    @GetMapping
    public Page<ShipmentResponseDTO> getAllShipments(
            @RequestParam int page,
            @RequestParam int size) {

        return shipmentService.getAllShipments(page, size);
    }

    // GET SHIPMENT BY ID
    @GetMapping("/{id}")
    public ShipmentResponseDTO getShipmentById(
            @PathVariable Long id) {

        return shipmentService.getShipmentById(id);
    }

    // DELETE SHIPMENT
    @DeleteMapping("/{id}")
    public String deleteShipment(@PathVariable Long id) {

        shipmentService.deleteShipment(id);
        return "Shipment deleted successfully";
    }
}