package com.lpu.coursemanagementsystem.controller;

import com.lpu.coursemanagementsystem.dto.CourseRequestDTO;
import com.lpu.coursemanagementsystem.dto.CourseResponseDTO;
import com.lpu.coursemanagementsystem.payload.ApiResponse;
import com.lpu.coursemanagementsystem.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<CourseResponseDTO>> createCourse(
            @Valid @RequestBody CourseRequestDTO dto){

        CourseResponseDTO response = service.createCourse(dto);

        ApiResponse<CourseResponseDTO> api =
                new ApiResponse<>(true,"Course created",response);

        return new ResponseEntity<>(api, HttpStatus.CREATED);
    }

}