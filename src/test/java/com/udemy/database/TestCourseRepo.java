/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database;

import com.udemy.database.model.Course;
import com.udemy.database.repository.CourseRepository;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Ali Mujthaba
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCourseRepo {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository courseRepo;

    @Test
    public void findById() {
        Course course = courseRepo.findById(1);
        assertEquals("Bachelor of Hibernate", course.getCourseName());
        logger.info("Test is running");
    }

    @Test
    @DirtiesContext
    public void deleteById() {
        courseRepo.deleteById(1L);
        assertNull(courseRepo.findById(1L));
    }

}
