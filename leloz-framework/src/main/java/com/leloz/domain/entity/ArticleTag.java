package com.leloz.domain.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@ApiModel("文章标签关联表(ArticleTag)表实体类")
@TableName(value="leloz_article_tag")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleTag implements Serializable {
    private static final long serialVersionUID = 625337492348897098L;


    @ApiModelProperty("文章id")
    private Long articleId;

    @ApiModelProperty("标签id")
    private Long tagId;



}

