package com.project_bit.repository;

import com.project_bit.entity.Article;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class ArticleRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void testFindByArticleTitle() throws Exception {
        Article article = articleRepository.findByArticleTitle("test");
        Assert.assertNotNull(article);
        Assert.assertEquals(article.getArticleTitle(), "test");
    }

    @Test
    public void testInsertNewArticle() throws Exception {
        Article newArticle = new Article();
        newArticle.setArticleTitle("test");
        newArticle.setArticleContents("Test1234");

        Article article = entityManager.persist(newArticle);
        Assert.assertNotNull(article);
        Assert.assertEquals(article.getArticleTitle(), article.getArticleContents());
    }
}
