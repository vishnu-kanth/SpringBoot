package com.lpu.coursemanagementsystem.service;


import com.lpu.coursemanagementsystem.dto.CourseRequestDTO;
import com.lpu.coursemanagementsystem.dto.CourseResponseDTO;

import java.util.List;

public interface CourseService {

    CourseResponseDTO createCourse(CourseRequestDTO dto);

    CourseResponseDTO getCourseById(Long id);

    List<CourseResponseDTO> getAllCourse();

    List<CourseResponseDTO> getAllCourses();

    CourseResponseDTO updateCourse(Long id, CourseRequestDTO dto);

    void deleteCourse(Long id);

}
