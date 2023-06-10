package com.syu.article.service;

import com.syu.article.pojo.Article;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version V1.0
 * @auther songyu@belink.com
 * @title
 * @description
 * @data 2023-06-04 16:51
 */
public interface ArticleService {
    Article getArticleById(String id);
    int insertArticle(Article article);
    int deleteArticle(String id);
    int updateArticle(String id, Article article);
    List<Article> listPage(Article article);
}
