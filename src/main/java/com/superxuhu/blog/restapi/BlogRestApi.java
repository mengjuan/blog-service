package com.superxuhu.blog.restapi;

import com.superxuhu.blog.dao.entity.Article;
import com.superxuhu.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogRestApi {
    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/articles",method = RequestMethod.GET)
    public List<Article> getArticles(){
        return blogService.getAllActiveArticles();
    }
}
