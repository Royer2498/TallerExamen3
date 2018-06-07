package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CommentRepository extends CrudRepository<Comment, Integer> {

    @Query(value = "select p.id, p.text,p.score,p.likes,p.user, p.restaurant, count(p) as count from Comment p group by p.user")
    Iterable<Comment> findComments();

    @Query(value = "select p.id, p.text ,p.text ,p.score,p.likes,p.user, p.restaurant, count(p) as count from Comment p group by p.restaurant")
    Iterable<Comment> findComments2();



}
