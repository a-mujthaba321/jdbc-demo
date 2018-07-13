/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author Ali Mujthaba
 */
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private long id;
    
    private String fullName;
    
    @OneToOne
    private Passport passport;
    
    @Override
    public String toString(){
        return String.format("Student[%s]", fullName);
    }

}
