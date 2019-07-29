package com.example.spring.project_bit.repository;

import com.example.spring.project_bit.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    Article findByArticleTitle(String articleTitle);

}
