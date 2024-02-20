package com.learning.springdatajpa.onetomany.bi.service;

import com.learning.springdatajpa.manytomany.model.Employee;
import com.learning.springdatajpa.manytomany.model.Project;
import com.learning.springdatajpa.manytomany.repository.EmployeeRepository;
import com.learning.springdatajpa.manytomany.repository.ProjectRepository;
import com.learning.springdatajpa.onetomany.bi.model.Book;
import com.learning.springdatajpa.onetomany.bi.repository.AuthorRepository;
import com.learning.springdatajpa.onetomany.bi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashSet;
import java.util.Set;

@Service
public class BookService {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;


    public Book createBook(Book entity) {
        // save Employee
        Book  book = bookRepository.save(entity);
        return book;
    }
}
