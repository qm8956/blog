package com.qm.spring.boot.blog.personblog.service;

import com.qm.spring.boot.blog.personblog.domain.Comment;

public interface CommentService {

    /**
     * 根据id获取评论
     * @param id
     * @return
     */
    Comment getCommentById(Long id);

    /**
     * 根据id删除平冷
     * @param id
     */
    void removeComment(Long id);
}
