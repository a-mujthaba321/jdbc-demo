/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database;

import com.udemy.database.model.Passport;
import com.udemy.database.model.Student;
import com.udemy.database.repository.StudentRepository;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Ali Mujthaba
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    @Test
    @Transactional
    public void retrieveStudentAndGetPassport() {

        Student student = em.find(Student.class, 2001L);
        logger.info("student ->{}", student);
        logger.info("passport ->{}", student.getPassport());

    }

    @Test
    @Transactional
    public void retrievePassportAndGetStudent() {

        Passport passport = em.find(Passport.class, 3001L);
        logger.info("passport ->{}", passport);
        logger.info("student ->{}", passport.getStudent());
        

    }

}
