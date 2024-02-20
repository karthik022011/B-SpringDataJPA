package com.learning.springdatajpa.onetomany.bi.controller;


import com.learning.springdatajpa.manytomany.model.Project;
import com.learning.springdatajpa.manytomany.service.EmployeeService;
import com.learning.springdatajpa.manytomany.service.ProjectService;
import com.learning.springdatajpa.onetomany.bi.model.Book;
import com.learning.springdatajpa.onetomany.bi.service.AuthorService;
import com.learning.springdatajpa.onetomany.bi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
public class BookController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @PostMapping("/createProject")
    public ResponseEntity<Book> createBook(@RequestBody Book entity) {
        // save Project
        Book project = bookService.createBook(entity);
        return ResponseEntity.ok(project);
    }

}
