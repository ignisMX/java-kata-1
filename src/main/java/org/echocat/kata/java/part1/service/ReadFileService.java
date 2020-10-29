/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.echocat.kata.java.part1.entity.Author;
import org.echocat.kata.java.part1.entity.Book;
import org.echocat.kata.java.part1.entity.Magazine;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author ignis
 */
@Service
@Component
public class ReadFileService {

    @Autowired
    ResourceLoader resourceLoader;

    private Resource resource;
    private BufferedReader br;
    private File file;

    public List<Author> readAuthors() throws IOException {
        resource = resourceLoader.getResource("classpath:authors.csv");
        file = resource.getFile();
        //file.createNewFile();
        br = new BufferedReader(new FileReader(file));
        String line;
        Author author;
        List<Author> authors = new ArrayList();
        while ((line = br.readLine()) != null) {

            //  separator
            String[] record = line.split(";");
            
            author = new Author();
            author.setEmail(record[0]);
            author.setFirstName(record[1]);
            author.setLastName(record[2]);
            
            authors.add(author);
        }
        
        return authors;
    }
    
    public List<Book> readBooks() throws IOException {
        resource = resourceLoader.getResource("classpath:books.csv");
        file = resource.getFile();
        //file.createNewFile();
        br = new BufferedReader(new FileReader(file));
        String line;
        Book book;
        List<Book> books = new ArrayList();
        while ((line = br.readLine()) != null) {

            //  separator
            String[] record = line.split(";");
            
            book = new Book();
            book.setTitle(record[0]);
            book.setIsbn(record[1]);
            book.setAuthors(record[2]);
            book.setDescription(record[3]);
            
            books.add(book);
        }
        
        return books;
    }
    
    public List<Magazine> readMagazines() throws IOException {
        resource = resourceLoader.getResource("classpath:magazines.csv");
        file = resource.getFile();
        //file.createNewFile();
        br = new BufferedReader(new FileReader(file));
        String line;
        Magazine magazine;
        List<Magazine> magazines = new ArrayList();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while ((line = br.readLine()) != null) {

            //  separator
            String[] record = line.split(";");
            
            magazine = new Magazine();
            magazine.setTitle(record[0]);
            magazine.setIsbn(record[1]);
            magazine.setAuthors(record[2]);
            magazine.setPublishedAt(LocalDate.parse(record[3], formatter));
            
            magazines.add(magazine);
        }
        
        return magazines;
    }
}
