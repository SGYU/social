package com.syu.article;

import com.syu.common.util.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @version V1.0
 * @auther songyu@belink.com
 * @title
 * @description
 * @data 2023-06-04 16:28
 */
@Slf4j
@SpringBootApplication
//@MapperScan("com.syu.article.pojo")
//@MapperScan("com.syu.article.service")
public class ArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class, args);
        log.info("文章模块启动成功");
    }
    @Bean
    public IdWorker createIdWorker(){
        return new IdWorker(1,1);
    }
}
