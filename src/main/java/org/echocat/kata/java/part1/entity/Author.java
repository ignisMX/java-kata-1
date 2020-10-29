/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ignis
 */
@Entity
public class Author {
    
    @Id
    private String email;
    
    private String firstName;
    
    private String lastName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" + "email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
}
