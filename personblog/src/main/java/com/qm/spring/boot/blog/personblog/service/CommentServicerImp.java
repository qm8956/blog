package com.qm.spring.boot.blog.personblog.service;

import com.qm.spring.boot.blog.personblog.domain.Comment;
import com.qm.spring.boot.blog.personblog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 评论接口实现类
 */
@Service
public class CommentServicerImp implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findOne(id);
    }

    @Override
    public void removeComment(Long id) {
        commentRepository.delete(id);
    }
}
