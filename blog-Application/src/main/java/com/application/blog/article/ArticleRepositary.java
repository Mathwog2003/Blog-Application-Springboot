package com.application.blog.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepositary extends JpaRepository<ArticleEntity,Long> {
}
