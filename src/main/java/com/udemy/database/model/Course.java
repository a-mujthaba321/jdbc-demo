/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import lombok.Data;

/**
 *
 * @author Ali Mujthaba
 */
@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String courseName;

    private Integer numberOfStudents;

    private String lecturerName;

    private Boolean isFull;

//    @OneToMany(mappedBy = "course")
//    private List<Review> reviews = new ArrayList<>();

    public Course() {

    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

}
