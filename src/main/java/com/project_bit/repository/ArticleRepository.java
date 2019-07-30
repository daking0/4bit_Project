package com.project_bit.repository;

import com.project_bit.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    Article findByArticleTitle(String articleTitle);

}
