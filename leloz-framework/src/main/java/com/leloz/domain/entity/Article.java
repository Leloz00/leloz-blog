package com.leloz.domain.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;


@ApiModel(description = "文章实体类")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("leloz_article")
@Accessors(chain = true)
public class Article {
    @TableId
    private Long id;
    //标题
    @ApiModelProperty("标题")
    private String title;
    //
    @ApiModelProperty("文章内容")
    private String content;
    //
    @ApiModelProperty("文章类型:1 文章 2草稿")
    private String type;
    //
    @ApiModelProperty("文章摘要")
    private String summary;

    @ApiModelProperty("分类名")
    @TableField(exist = false)
    private String categoryName;

    //
    @ApiModelProperty("所属分类id")
    private Long categoryId;
    //
    @ApiModelProperty("缩略图")
    private String thumbnail;
    //
    @ApiModelProperty("是否置顶（0否，1是）")
    private String isTop;
    //
    @ApiModelProperty("状态（0已发布，1草稿）")
    private String status;
    //
    @ApiModelProperty("评论数")
    private Integer commentCount;
    //
    @ApiModelProperty("访问量")
    private Long viewCount;
    //
    @ApiModelProperty("是否允许评论 1是，0否")
    private String isComment;

    @ApiModelProperty("创建人")
    @TableField(fill = FieldFill.INSERT)
    private Long createBy;

    @ApiModelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty("更新人")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    //
    @ApiModelProperty("删除标志（0代表未删除，1代表已删除）")
    private Integer delFlag;


    public Article(Long id, long viewCount) {
        this.id = id;
        this.viewCount = viewCount;
    }
}

