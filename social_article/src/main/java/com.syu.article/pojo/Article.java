package com.syu.article.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @version V1.0
 * @auther songyu@belink.com
 * @title
 * @description
 * @data 2023-06-04 16:43
 */

@Data
@ToString
@NoArgsConstructor
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;//ID
    private String columnid;    //专栏ID
    private String userid;      //用户ID
    @Length(max = 12,message = "标题字数最大不超过12个字")
    @NotNull(message = "标题必须不为空")
    private String title;       //标题
    @Length(max = 200,message = "文章正文字数最大不超过12个字")
    @NotNull(message = "文章必须不为空")
    private String content;     //文章正文
    private String image;       //文章封面
    private Date createtime;    //发表日期
    private Date updatetime;    //修改日期
    private String ispublic;    //是否公开
    private String istop;       //是否置顶
    private Integer visits;     //浏览量
    private Integer thumbup;    //点赞数
    private Integer comment;    //评论数
    private String state;       //审核状态
    private String channelid;   //所属频道
    private String url;         //URL
    private String type;        //类型
}
