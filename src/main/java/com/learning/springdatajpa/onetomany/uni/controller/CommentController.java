package com.learning.springdatajpa.onetomany.uni.controller;

import com.learning.springdatajpa.onetomany.bi.model.Author;
import com.learning.springdatajpa.onetomany.bi.service.AuthorService;
import com.learning.springdatajpa.onetomany.bi.service.BookService;
import com.learning.springdatajpa.onetomany.uni.model.Comment;
import com.learning.springdatajpa.onetomany.uni.model.Post;
import com.learning.springdatajpa.onetomany.uni.service.CommentService;
import com.learning.springdatajpa.onetomany.uni.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @PostMapping(value = "/createComment")
    public ResponseEntity<Comment> createComment(@RequestBody Comment entity) {
        Comment savedEmployee = commentService.createComment(entity);
        return ResponseEntity.ok(savedEmployee);
    }

    @PostMapping(value = "/createComment/{postId}")
    public ResponseEntity<Comment> createCommentAndAssignToPost(@RequestBody Comment entity,
                                       @PathVariable(name = "postId") Integer postId) {
        Comment savedEmployee = commentService.createCommentAndAssignToPost(entity, postId);
        return ResponseEntity.ok(savedEmployee);
    }
}

/*http://localhost:8081/api/comment/createComment
        {
        "text":"good"
        }
*/

//http://localhost:8081/api/comment/createComment/1
/*{
        "text":"good"
}*/

