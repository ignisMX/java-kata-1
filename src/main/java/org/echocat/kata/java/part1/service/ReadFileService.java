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
import java.util.List;
import java.util.ArrayList;
import org.echocat.kata.java.part1.entity.Book;
import org.echocat.kata.java.part1.entity.Author;
import org.echocat.kata.java.part1.entity.Magazine;
import org.echocat.kata.java.part1.entity.Document;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 *
 * @author ignis
 */
@Service
public class ReadFileService {

    ResourceLoader resourceLoader;

    private Resource resource;
    private BufferedReader br;
    private File file;
    String line;

    @Autowired
    public ReadFileService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public List<Author> readAuthors() throws IOException {
        
        Author author;
        resource = resourceLoader.getResource("classpath:authors.csv");
        file = resource.getFile();
        br = new BufferedReader(new FileReader(file));
        List<Author> authors = new ArrayList();
        int counter = 0;
        while ((line = br.readLine()) != null) {
            if(counter == 0) {
                counter ++;
                continue;
            }
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
    
    public List<Document> readBooks() throws IOException {
        resource = resourceLoader.getResource("classpath:books.csv");
        file = resource.getFile();
        br = new BufferedReader(new FileReader(file));
        Book book;
        List<Document> documents = new ArrayList();
        int counter = 0;
        while ((line = br.readLine()) != null) {
            if (counter == 0) {
                counter++;
                continue;
            }
            //  separator
            String[] record = line.split(";");

            book = new Book();
            book.setTitle(record[0]);
            book.setIsbn(record[1]);
            book.setAuthors(record[2]);
            book.setDescription(record[3]);

            documents.add(book);
        }
        
        return documents;
    }
    
    public List<Document> readMagazines() throws IOException {
        resource = resourceLoader.getResource("classpath:magazines.csv");
        file = resource.getFile();
        br = new BufferedReader(new FileReader(file));
        String line;
        Magazine magazine;
        List<Document> documents = new ArrayList();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        int counter = 0;
        while ((line = br.readLine()) != null) {
            if (counter == 0) {
                counter++;
                continue;
            }
            //  separator
            String[] record = line.split(";");
            
            magazine = new Magazine();
            magazine.setTitle(record[0]);
            magazine.setIsbn(record[1]);
            magazine.setAuthors(record[2]);
            magazine.setPublishedAt(LocalDate.parse(record[3], formatter));
            
            documents.add(magazine);
        }
        
        return documents;
    }
}
