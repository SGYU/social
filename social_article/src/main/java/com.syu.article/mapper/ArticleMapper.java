package com.syu.article.mapper;

import com.syu.article.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface ArticleMapper{
    /*
    * 根据id查找文章
    * */
    Article getArticleById(@Param("id") String id);
    int insertArticle(Article article);
    int deleteArticle(@Param("id") String id);
    int updateArticle(@Param("id") String id, @Param("article") Article article);
    List<Article> listPage(Article article);
}
