/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.service;

import java.util.List;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import org.echocat.kata.java.part1.entity.Author;
import org.echocat.kata.java.part1.entity.Document;
import org.echocat.kata.java.part1.service.DocumentService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author ignis
 */
@SpringBootTest
public class DocumentServiceTest {
    
    @Autowired
    private DocumentService documentService;
    
    @Test
    public void getAllDocumentsTest() throws IOException{
        List<Document> result = documentService.getAllDocuments();
        assertTrue(result.size() > 0);
        assertEquals(14, result.size());
    }
}
