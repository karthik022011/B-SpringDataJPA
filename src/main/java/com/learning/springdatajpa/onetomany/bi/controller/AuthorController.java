package com.learning.springdatajpa.onetomany.bi.controller;

import com.learning.springdatajpa.manytomany.model.Employee;
import com.learning.springdatajpa.manytomany.service.EmployeeService;
import com.learning.springdatajpa.manytomany.service.ProjectService;
import com.learning.springdatajpa.onetomany.bi.model.Author;
import com.learning.springdatajpa.onetomany.bi.service.AuthorService;
import com.learning.springdatajpa.onetomany.bi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/createAuthor")
    public ResponseEntity<Author> createAuthor(@RequestBody Author entity) {
        Author savedEmployee = authorService.createAuthor(entity);
        return ResponseEntity.ok(savedEmployee);
    }
}
