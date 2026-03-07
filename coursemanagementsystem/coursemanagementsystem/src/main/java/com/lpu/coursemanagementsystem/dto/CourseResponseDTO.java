package com.lpu.coursemanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponseDTO {

    private long id;

    private String title;

    private String description;

    private String instructor;

    private Double price;

    private LocalTime createdAt;

}
