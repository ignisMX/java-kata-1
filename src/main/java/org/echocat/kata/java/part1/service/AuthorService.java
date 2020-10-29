/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.service;

import java.io.IOException;
import java.util.List;
import org.echocat.kata.java.part1.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.echocat.kata.java.part1.repository.AuthorRepository;
/**
 *
 * @author ignis
 */
@Service
public class AuthorService {
    
    @Autowired
    private AuthorRepository authorRepository;
    
    @Autowired
    private ReadFileService readFileService;
    
    public void saveAllAuthors() throws IOException{
        List<Author> authors = readFileService.readAuthors();
        
        authorRepository.saveAll(authors);
    }
    
    
}
