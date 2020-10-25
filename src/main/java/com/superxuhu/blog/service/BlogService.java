package com.superxuhu.blog.service;

import com.superxuhu.blog.dao.entity.Article;

import java.util.List;

public interface BlogService {

    List<Article> getAllActiveArticles();

    Article getArticleById(Integer id);

    void saveArticle(Article article);

    void deleteArticleById(Integer id);



}
