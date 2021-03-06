/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author Ali Mujthaba
 */
@Entity
@Data
public class Review {

    @Id
    @GeneratedValue
    private long id;
    
    private String rating;
    
    private String description;
    
    @ManyToOne
    private Course course;

}
