/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.echocat.kata.java.part1.controller;

import java.util.List;
import org.echocat.kata.java.part1.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.echocat.kata.java.part1.service.ReadFileService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ignis
 */
@Controller
public class AuthorController {
    
    @Autowired
    private ReadFileService readFileService;

    @RequestMapping("/authors")
    public String getAuthors(Model model) throws Exception{
        List<Author> authors = readFileService.readAuthors();
        
        model.addAttribute("authors", authors);
        
        return "authors";
    }
}
