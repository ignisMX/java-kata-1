/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.service;

import java.io.IOException;
import java.util.List;
import org.echocat.kata.java.part1.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ignis
 */
@Service
public class DocumentService {

    private ReadFileService readFileService;
    
    @Autowired
    public DocumentService(ReadFileService readFileService) {
        this.readFileService = readFileService;
    }
    
    public List<Document> getAllDocuments() throws IOException{
        
        List<Document> list = readFileService.readBooks();
        list.addAll(readFileService.readMagazines());
        printDocuments(list);
        return list;
    }
    
    public void printDocuments(List<Document> documents){
        for(Document document: documents){
            System.out.println(document);        
        }
    }
    
    public Document findDocumentByIsbn(String isbn) throws IOException{
        List<Document> documents = getAllDocuments();
        Document result =  null;
        for(Document document :  documents){
            
            if(document.getIsbn().equals(isbn)){
                result = document;
            }
        }
        
        return result;
    }
    
    public Document findDocumentByAuthor(String author) throws IOException{
        List<Document> documents = getAllDocuments();
        Document result =  null;
        for(Document document :  documents){
            
            if(document.getAuthors().equals(author)){
                result = document;
            }
        }
        
        return result;
    }
    
}
