package com.syu.article.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syu.article.pojo.Article;
import com.syu.article.service.ArticleService;
import com.syu.common.entity.Result;
import com.syu.common.entity.ResultPages;
import com.syu.common.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @version V1.0
 * @auther songyu@belink.com
 * @title
 * @description
 * @data 2023-06-04 16:52
 */
//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("/{articleId}")
    public Result<Article> getArticleById(@PathVariable("articleId") @Valid String id){
        Article articleById = articleService.getArticleById(id);
        return new Result<Article>(StatusCode.OK,"查询成功",true,articleById);
    }
    /*
    * 新增文章信息
    * */
    @PostMapping()
    public Result insertArticle(@RequestBody @Valid Article article){
        int result = articleService.insertArticle(article);
        if(result == 0){
            return new Result(StatusCode.ERROR,"新增失败",true);
        }
        return new Result(StatusCode.OK,"新增成功",true);
    }
    /*
    * 修改文章
    * */
    @PutMapping("/{articleId}")
    public Result updateArticle(@PathVariable("articleId") @Valid String id,@RequestBody Article article){
        int result = articleService.updateArticle(id, article);
        if(result == 0){
            return new Result(StatusCode.ERROR,"修改失败",true);
        }
        return new Result(StatusCode.OK,"修改成功",true);
    }
    /*
    * 删除文章
    * */
    @DeleteMapping("/{articleId}")
    public Result deleteArticle(@PathVariable("articleId") @Valid String id){
        int result = articleService.deleteArticle(id);
        if(result == 0){
            return new Result(StatusCode.ERROR,"删除失败",true);
        }
        return new Result(StatusCode.OK,"删除成功",true);
    }
    @RequestMapping("/{pageNum}/{pageSize}")
    public Result<ResultPages<Article>> listPage(@PathVariable("pageNum") Integer pageNum,
                                         @PathVariable("pageSize") Integer pageSize,
                                         @RequestBody Article article){
        //设置分页查询参数
        PageHelper.startPage(pageNum,pageSize);
        List<Article> listArticle = articleService.listPage(article);
        // 封装分页查询结果到 PageInfo 对象中以获取相关分页信息
        PageInfo pageListArticle = new PageInfo(listArticle);
        return new Result<>(StatusCode.OK,"查询成功",true,
                new ResultPages<>(pageListArticle.getTotal(),pageListArticle.getList()));
    }
    /*
    * 测试统一异常处理
    * */
    @PostMapping("/error")
    public Result error() throws Exception{
        throw new Exception("统一异常处理");
    }
}
