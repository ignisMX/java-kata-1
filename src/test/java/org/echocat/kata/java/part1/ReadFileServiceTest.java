/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.echocat.kata.java.part1.service.ReadFileService;
import org.echocat.kata.java.part1.entity.Author;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ignis
 */
//@Transactional
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
public class ReadFileServiceTest {
    
    @Autowired
    private ReadFileService readFileService = new ReadFileService();
    
    @Test
    public void readAuthors() throws Exception{
        List<Author> authors = readFileService.readAuthors();
        
        assertTrue(authors.size() > 0);
    }
}
