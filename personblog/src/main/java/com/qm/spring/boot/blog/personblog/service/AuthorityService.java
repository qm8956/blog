package com.qm.spring.boot.blog.personblog.service;

import com.qm.spring.boot.blog.personblog.domain.Authority;


public interface AuthorityService {

    /**
     * 根据id查找角色
     * @param id
     * @return
     */
    Authority getAuthorityById(Long id);
}
