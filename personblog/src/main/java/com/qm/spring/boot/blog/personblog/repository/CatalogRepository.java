package com.qm.spring.boot.blog.personblog.repository;

import com.qm.spring.boot.blog.personblog.domain.Catalog;
import com.qm.spring.boot.blog.personblog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 分类管理
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long> {

    /**
     * 根据用户查询
     * @param user
     * @return
     */
    List<Catalog> findByUser(User user);

    /**
     * 根据用户及分类名称查询
     * @param user
     * @param name
     * @return
     */
    List<Catalog> findByUserAndName(User user, String name);
}
