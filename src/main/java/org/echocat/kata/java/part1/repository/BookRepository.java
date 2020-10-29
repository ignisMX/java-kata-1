/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.repository;

import org.echocat.kata.java.part1.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ignis
 */
@Repository
public interface BookRepository extends JpaRepository<Book, String>{
    
    Book findByIsbn(String isbn);
    
}
