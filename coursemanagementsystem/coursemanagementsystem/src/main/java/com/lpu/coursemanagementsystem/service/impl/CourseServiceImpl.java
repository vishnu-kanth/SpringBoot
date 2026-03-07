package com.lpu.coursemanagementsystem.service.impl;

import com.lpu.coursemanagementsystem.dto.CourseRequestDTO;
import com.lpu.coursemanagementsystem.dto.CourseResponseDTO;
import com.lpu.coursemanagementsystem.entity.Course;
import com.lpu.coursemanagementsystem.exception.ResourceNotFoundException;
import com.lpu.coursemanagementsystem.repository.CourseRepository;
import com.lpu.coursemanagementsystem.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;
    private final ModelMapper mapper;

    public CourseServiceImpl(CourseRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public CourseResponseDTO createCourse(CourseRequestDTO dto) {

        Course course = mapper.map(dto, Course.class);

        Course saved = repository.save(course);

        return mapper.map(saved, CourseResponseDTO.class);
    }

    @Override
    public CourseResponseDTO getCourseById(Long id) {

        Course course = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));

        return mapper.map(course, CourseResponseDTO.class);
    }

    @Override
    public List<CourseResponseDTO> getAllCourse() {
        return List.of();
    }

    @Override
    public List<CourseResponseDTO> getAllCourses() {

        List<Course> courses = repository.findAll();

        return courses.stream()
                .map(course -> mapper.map(course, CourseResponseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CourseResponseDTO updateCourse(Long id, CourseRequestDTO dto) {

        Course course = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));

        course.setTitle(dto.getTitle());
        course.setDescription(dto.getDescription());
        course.setInstructor(dto.getInstructor());
        course.setDuration(dto.getDuration());
        course.setPrice(dto.getPrice());

        Course updated = repository.save(course);

        return mapper.map(updated, CourseResponseDTO.class);
    }

    @Override
    public void deleteCourse(Long id) {

        Course course = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));

        repository.delete(course);
    }
}