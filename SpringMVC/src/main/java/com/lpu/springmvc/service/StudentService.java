package com.lpu.springmvc.service;

import com.lpu.springmvc.entity.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    List<Student> getAll();
    Student getById(Long id);
    void delete(Long id);
}
