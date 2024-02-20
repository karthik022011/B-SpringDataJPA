package com.learning.springdatajpa.onetomany.uni.service;

import com.learning.springdatajpa.onetomany.bi.model.Book;
import com.learning.springdatajpa.onetomany.bi.repository.AuthorRepository;
import com.learning.springdatajpa.onetomany.bi.repository.BookRepository;
import com.learning.springdatajpa.onetomany.uni.model.Comment;
import com.learning.springdatajpa.onetomany.uni.repository.CommentRepository;
import com.learning.springdatajpa.onetomany.uni.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;


    public Comment createComment(Comment entity) {
        Comment  book = commentRepository.save(entity);
        return book;
    }
}
