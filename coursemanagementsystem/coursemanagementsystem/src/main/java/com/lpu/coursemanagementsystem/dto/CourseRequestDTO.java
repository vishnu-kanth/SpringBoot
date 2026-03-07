package com.lpu.coursemanagementsystem.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequestDTO {

    @NotBlank(message="Titile is Required")
    private String title;

    private String description;

    @NotBlank(message="Instructor is Requried")
    private String instructor;

    @Min(1)
    private int duration;

    @PositiveOrZero
    private Double price;

}