package com.sparta.spring_post2.repository;

import com.sparta.spring_post2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}