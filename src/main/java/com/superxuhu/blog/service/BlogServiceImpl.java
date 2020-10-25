package com.superxuhu.blog.service;

import com.superxuhu.blog.dao.entity.Article;
import com.superxuhu.blog.dao.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getAllActiveArticles() {
        return articleRepository.findAllActiveArticles();
    }

    @Override
    public Article getArticleById(Integer id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void deleteArticleById(Integer id) {
        articleRepository.deleteById(id);
    }


}
