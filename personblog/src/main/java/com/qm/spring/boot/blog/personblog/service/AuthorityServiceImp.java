package com.qm.spring.boot.blog.personblog.service;

import com.qm.spring.boot.blog.personblog.domain.Authority;
import com.qm.spring.boot.blog.personblog.repository.Authorityrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImp implements AuthorityService {

    @Autowired
    private Authorityrepository authorityrepository;

    @Override
    public Authority getAuthorityById(Long id) {
        return authorityrepository.findOne(id);
    }
}
