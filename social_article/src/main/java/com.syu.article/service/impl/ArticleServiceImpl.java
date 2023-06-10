package com.syu.article.service.impl;

import com.syu.article.mapper.ArticleMapper;
import com.syu.article.pojo.Article;
import com.syu.article.service.ArticleService;
import com.syu.common.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @version V1.0
 * @auther songyu@belink.com
 * @title
 * @description
 * @data 2023-06-04 17:08
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper mapper;
    @Autowired
    private IdWorker idWorker;

    @Override
    public Article getArticleById(String id) {
        return mapper.getArticleById(id);
    }

    @Override
    public List<Article> listPage(Article article) {
        return mapper.listPage(article);
    }

    @Override
    public int updateArticle(String id, Article article) {
        Date date = new Date();
        article.setUpdatetime(date);
        return mapper.updateArticle(id, article);
    }

    @Override
    public int insertArticle(Article article) {
        article.setId(idWorker.nextId()+"");
        Date date = new Date();
        article.setCreatetime(date);
        article.setUpdatetime(date);
        return mapper.insertArticle(article);
    }
    @Override
    public int deleteArticle(String id){
        return mapper.deleteArticle(id);
    }
}
