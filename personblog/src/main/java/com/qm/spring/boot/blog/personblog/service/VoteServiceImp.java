package com.qm.spring.boot.blog.personblog.service;

import com.qm.spring.boot.blog.personblog.domain.Vote;
import com.qm.spring.boot.blog.personblog.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author QM
 */
@Service
public class VoteServiceImp implements VoteService {

    @Autowired
    VoteRepository voteRepository;
    @Override
    public Vote getVoteById(Long id) {
        return voteRepository.findOne(id);
    }

    @Override
    public void removeVote(Long id) {
        voteRepository.delete(id);
    }
}
