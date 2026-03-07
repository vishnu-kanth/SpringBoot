package com.lpu.coursemanagementsystem.repository;

import com.lpu.coursemanagementsystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {


}
