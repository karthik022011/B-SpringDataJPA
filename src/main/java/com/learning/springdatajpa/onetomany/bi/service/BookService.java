package com.learning.springdatajpa.onetomany.bi.service;

import com.learning.springdatajpa.manytomany.model.Employee;
import com.learning.springdatajpa.manytomany.model.Project;
import com.learning.springdatajpa.manytomany.repository.EmployeeRepository;
import com.learning.springdatajpa.manytomany.repository.ProjectRepository;
import com.learning.springdatajpa.onetomany.bi.model.Author;
import com.learning.springdatajpa.onetomany.bi.model.Book;
import com.learning.springdatajpa.onetomany.bi.repository.AuthorRepository;
import com.learning.springdatajpa.onetomany.bi.repository.BookRepository;
import com.learning.springdatajpa.onetomany.uni.model.Comment;
import com.learning.springdatajpa.onetomany.uni.model.Post;
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

    public Author createBookAndAssignToAuthor(Book entity, Integer authorId) {
        // fetch Author
        Author authorTemp = authorRepository.getById(authorId);

        //set author to book
        entity.setAuthor(authorTemp);

        // add Book  to Author
        authorTemp.getBooks().add(entity);

        // save Author
        Author  savedAuthor = authorRepository.save(authorTemp);
        return savedAuthor;
    }
}
