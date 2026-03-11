package com.example.vehiclerental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalPlan {

    @Id
    @NotBlank(message = "Provide value for plan Id")
    private String planId;

    @NotBlank(message = "Provide value for plan name")
    private String planName;

    @NotBlank(message = "Provide value for vehicle type")
    private String vehicleType;

    @Min(50)
    @Max(500)
    private int minMileage;

    @Min(1)
    private int rentalDurationDays;

    @Positive
    private double dailyRate;

    @NotBlank
    private String rentalCategory;

    private boolean insuranceIncluded;
}