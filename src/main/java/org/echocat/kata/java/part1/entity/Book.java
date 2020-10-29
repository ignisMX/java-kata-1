/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ignis
 */

public class Book extends Document{
    
    private String description;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + super.getIsbn() + ", title=" + super.getTitle() + 
                ", authors=" + super.getAuthors() + ", description=" + description + '}';
    }  
    
}
