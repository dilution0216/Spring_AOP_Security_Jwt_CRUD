package com.sparta.spring_post2.repository;

import com.sparta.spring_post2.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
