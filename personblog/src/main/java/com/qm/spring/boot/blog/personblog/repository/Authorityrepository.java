package com.qm.spring.boot.blog.personblog.repository;

import com.qm.spring.boot.blog.personblog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Authorityrepository extends JpaRepository<Authority, Long> {
}
