package com.example.vehiclerental.controller;

import com.example.vehiclerental.model.RentalPlan;
import com.example.vehiclerental.service.IRentalPlanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RentalPlanController {

    @Autowired
    private IRentalPlanService service;

    @PostMapping("/addRentalPlan")
    public ResponseEntity<RentalPlan> addRentalPlan(@Valid @RequestBody RentalPlan plan) {
        return new ResponseEntity<>(service.addRentalPlan(plan), HttpStatus.OK);
    }

    @GetMapping("/viewRentalPlanById/{planId}")
    public ResponseEntity<RentalPlan> viewRentalPlanById(@PathVariable String planId) {
        return new ResponseEntity<>(service.viewRentalPlanById(planId), HttpStatus.OK);
    }

    @GetMapping("/viewPlansByVehicleType/{vehicleType}")
    public ResponseEntity<List<RentalPlan>> viewPlansByVehicleType(@PathVariable String vehicleType) {
        return new ResponseEntity<>(service.viewPlansByVehicleType(vehicleType), HttpStatus.OK);
    }

    @GetMapping("/viewPlansByMileageAndDuration/{minMileage}/{durationDays}")
    public ResponseEntity<List<RentalPlan>> viewPlansByMileageAndDuration(
            @PathVariable int minMileage,
            @PathVariable int durationDays) {

        return new ResponseEntity<>(
                service.viewPlansByMileageAndDuration(minMileage, durationDays),
                HttpStatus.OK
        );
    }

    @GetMapping("/getPlanCountByCategory")
    public ResponseEntity<Map<String, Long>> getPlanCountByCategory() {
        return new ResponseEntity<>(service.getPlanCountByCategory(), HttpStatus.OK);
    }
}