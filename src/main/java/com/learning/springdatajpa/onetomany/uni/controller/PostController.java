package com.learning.springdatajpa.onetomany.uni.controller;

import com.learning.springdatajpa.onetomany.bi.model.Author;
import com.learning.springdatajpa.onetomany.bi.service.AuthorService;
import com.learning.springdatajpa.onetomany.bi.service.BookService;
import com.learning.springdatajpa.onetomany.uni.model.Post;
import com.learning.springdatajpa.onetomany.uni.service.CommentService;
import com.learning.springdatajpa.onetomany.uni.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/createPost")
    public ResponseEntity<Post> createPost(@RequestBody Post entity) {
        Post savedEmployee = postService.createPost(entity);
        return ResponseEntity.ok(savedEmployee);
    }
}
