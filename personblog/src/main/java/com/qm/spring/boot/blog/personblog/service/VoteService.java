package com.qm.spring.boot.blog.personblog.service;

import com.qm.spring.boot.blog.personblog.domain.Vote;

public interface VoteService {

    /**
     * 根据id获取点赞
     * @param id
     * @return
     */
    Vote getVoteById(Long id);

    /**
     * 根据id取消点赞
     * @param id
     */
    void removeVote(Long id);
}
