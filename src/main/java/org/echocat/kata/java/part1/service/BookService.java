/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.service;

import java.io.IOException;
import java.util.List;
import org.echocat.kata.java.part1.entity.Author;
import org.echocat.kata.java.part1.entity.Book;
import org.echocat.kata.java.part1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ignis
 */

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private ReadFileService readFileService;
    
    public void saveAllBooks() throws IOException{
        List<Book> books = readFileService.readBooks();
        
        bookRepository.saveAll(books);
    }
    
    public Book findByIsbn(String isbn){
        return bookRepository.findByIsbn(isbn);
    }
    
}
