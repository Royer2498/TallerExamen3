package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Comment;

import java.util.List;

public interface CommentService {

    Iterable<Comment> listAllComments();

    void saveComment(Comment comment);

    Comment getComment(Integer id);

    void deleteComment(Integer id);

    Iterable<Comment> listAllCommentsByUser(Integer userId);

    Iterable<Comment> findComments();

    Iterable<Comment> findComments2();
}
