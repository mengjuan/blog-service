package com.superxuhu.blog.dao.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "article")
@Data
public class Article {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name="catagroy")
    private String catagroy;
    @Column(name="author")
    private String author;
    @Column(name="activeflag")
    private String activeflag;
    @JsonIgnore
    @Column(name = "entry_id")
    private Integer entryId;
    @Column(name="entry_datetime")
    private Timestamp entryDatetime;
}
