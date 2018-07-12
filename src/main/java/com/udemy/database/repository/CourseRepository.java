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
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ali Mujthaba
 */
@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager em;

    public Course findById(long id) {
        return em.find(Course.class, id);
    }

    public void deleteById(Long id) {
        Course course = findById(id);
        em.remove(course);
    }

    public void playWithEM() {

        Course course1 = new Course("Bachelors of Medicine");
        em.persist(course1);
        em.flush();
        
        course1.setCourseName("Bachelors of Nursing");
        em.flush();

        Course course2 = new Course("Bachelors of Medicine");
        em.persist(course2);
        em.flush();
        course2.setCourseName("Diploma of Nursing");
        em.flush();

    }
}
