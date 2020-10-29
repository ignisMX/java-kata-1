/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1;

import java.util.List;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import org.echocat.kata.java.part1.entity.Book;
import org.echocat.kata.java.part1.entity.Author;
import org.echocat.kata.java.part1.entity.Magazine;
import org.echocat.kata.java.part1.service.ReadFileService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author ignis
 */
@SpringBootTest
public class ReadFileServiceTest {
    
    @Autowired
    private ReadFileService readFileService;
    
    @Test
    public void readAuthors() throws IOException{
        List<Author> authors = readFileService.readAuthors();
        assertTrue(authors.size() > 0);
        assertEquals(6, authors.size());
    }
    
    @Test
    public void readBooks() throws IOException{
        List<Book> books = readFileService.readBooks();
        assertTrue(books.size() > 0);
        assertEquals(8, books.size());
    }
    
    @Test
    public void readMagazines() throws IOException{
        List<Magazine> magazines = readFileService.readMagazines();
        assertTrue(magazines.size() > 0);
        assertEquals(6, magazines.size());
    }
}
