package com.superxuhu.blog.dao.repository;


import com.superxuhu.blog.dao.entity.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article,Integer> {
    @Query("select a from Article a where activeflag='Y' order by entryDatetime desc")
    List<Article> findAllActiveArticles();
}
