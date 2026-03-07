package com.lpu.coursemanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalTime;

@Entity
@Table(name="courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private int duration;

    private Double price;

    private LocalTime createdAt;

    @PrePersist
    public void prePersist(){
        this.createdAt = LocalTime.now();
    }

    public void setInstructor(@NotBlank(message="Instructor is Requried") String instructor) {
    }
}
