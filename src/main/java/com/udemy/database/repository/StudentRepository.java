/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database.repository;

import com.udemy.database.model.Student;
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
public class StudentRepository {

    @Autowired
    EntityManager em;

    public Student findById(long id) {
        return em.find(Student.class, id);
    }

    public void deleteById(Long id) {
        Student student = findById(id);
        em.remove(student);
    }

//    public void playWithEM() {
//
//        Student student1 = new Student("Bachelors of Medicine");
//        em.persist(student1);
//        em.flush();
//        
//        student1.setStudentName("Bachelors of Nursing");
//        em.flush();
//
//        Student student2 = new Student("Bachelors of Medicine");
//        em.persist(student2);
//        em.flush();
//        student2.setStudentName("Diploma of Nursing");
//        em.flush();
//
//    }
}
