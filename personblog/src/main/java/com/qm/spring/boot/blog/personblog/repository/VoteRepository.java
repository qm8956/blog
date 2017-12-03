package com.qm.spring.boot.blog.personblog.repository;

import com.qm.spring.boot.blog.personblog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
