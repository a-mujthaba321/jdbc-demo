/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Ali Mujthaba
 */
@Entity
@Data
public class Course {

    @Id
    @GeneratedValue
    private long id;

    private String courseName;

    protected Course() {

    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

}
