package com.qm.spring.boot.blog.personblog.repository;

import com.qm.spring.boot.blog.personblog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
