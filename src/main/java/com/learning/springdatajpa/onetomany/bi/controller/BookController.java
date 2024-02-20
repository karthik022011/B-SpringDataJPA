package com.learning.springdatajpa.onetomany.bi.controller;


import com.learning.springdatajpa.onetomany.bi.model.Book;
import com.learning.springdatajpa.onetomany.bi.service.AuthorService;
import com.learning.springdatajpa.onetomany.bi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @PostMapping("/createBook")
    public ResponseEntity<Book> createBook(@RequestBody Book entity) {
        // save Project
        Book project = bookService.createBook(entity);
        return ResponseEntity.ok(project);
    }

    @PostMapping(value = "/createBook/{authorId}")
    public ResponseEntity<Book> createBookAndAssignToAuthor(@RequestBody Book entity,
                                                                @PathVariable(name = "authorId") Integer authorId) {
        Book savedBook = bookService.createBookAndAssignToAuthor(entity, authorId);
        return ResponseEntity.ok(savedBook);
    }

}

//http://localhost:8081/api/book/createBook/1
/*{
        "title":"RichDad & PoorDad"
}*/
