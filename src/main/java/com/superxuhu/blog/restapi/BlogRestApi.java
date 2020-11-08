package com.superxuhu.blog.restapi;

import com.superxuhu.blog.dao.entity.Article;
import com.superxuhu.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/articles/{id}",method = RequestMethod.GET)
    public Article getArticleById(@PathVariable("id") Integer id){
        return blogService.getArticleById(id);
    }

    @RequestMapping(value = "/articles",method = RequestMethod.POST)
    public String saveArticle(@RequestBody Article article){
        blogService.saveArticle(article);
        return "success";
    }

    @RequestMapping(value = "/articles/{id}",method = RequestMethod.DELETE)
    public String deleteArticle(@PathVariable("id") Integer id){
        blogService.deleteArticleById(id);
        return "success";
    }
}
