package com.superxuhu.blog.service;

import com.superxuhu.blog.dao.entity.Article;

import java.util.List;

public interface BlogService {

    public List<Article> getAllActiveArticles();

}
