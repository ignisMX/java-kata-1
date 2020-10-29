/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author ignis
 */
public class Magazine extends Document{
    
    private LocalDate publishedAt;
    
    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDate publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "Magazine{" + "isbn=" + super.getIsbn() + ", title=" + super.getTitle() + 
                ", authors=" + super.getAuthors() + ", publishedAt=" + publishedAt + '}';
    }
    
    
}
