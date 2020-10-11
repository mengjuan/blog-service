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
}
