/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ali Mujthaba
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    
    private int id;
    
    private String fullName;
    
    private long birthDate;
    
}
