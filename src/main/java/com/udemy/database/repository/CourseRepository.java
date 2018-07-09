/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database.repository;

import com.udemy.database.model.Course;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ali Mujthaba
 */
@Repository
public class CourseRepository {

    @Autowired
    EntityManager em;

    public Course findById(long id) {

        return em.find(Course.class, id);
    }
}
