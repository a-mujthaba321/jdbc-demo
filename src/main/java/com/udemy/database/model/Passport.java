/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database.model;

import javax.persistence.Column;
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
public class Passport {

    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable = false)
    private String passportNumber;
    
    @OneToOne(mappedBy = "passport")
    private Student student;

}
