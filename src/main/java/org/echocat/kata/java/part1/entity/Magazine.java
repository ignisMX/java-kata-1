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
@Entity
public class Magazine {
    
    @Id
    private String isbn;
    
    private String title;
    
    private String authors;
    
    private LocalDate publishedAt;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDate publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "Magazine{" + "isbn=" + isbn + ", title=" + title + ", authors=" + authors + ", publishedAt=" + publishedAt + '}';
    }
    
    
}