package com.leloz.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
// leloz-admin，博客后台，Swagger Models
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "添加文章dto")
public class AddArticleDto {

    @ApiModelProperty(notes = "添加的文章id")
    private Long id;
    //
    @ApiModelProperty(notes = "标题")
    private String title;
    //文章内容
    @ApiModelProperty(notes = "文章内容")
    private String content;
    //
    @ApiModelProperty(notes = "文章摘要")
    private String summary;
    //
    @ApiModelProperty(notes = "所属分类id")
    private Long categoryId;

    //
    @ApiModelProperty(notes = "缩略图")
    private String thumbnail;
    //
    @ApiModelProperty(notes = "是否置顶（0否，1是）")
    private String isTop;
    //
    @ApiModelProperty(notes = "状态（0已发布，1草稿）")
    private String status;
    //
    @ApiModelProperty(notes = "访问量")
    private Long viewCount;
    //
    @ApiModelProperty(notes = "是否允许评论 1是，0否")
    private String isComment;

    @ApiModelProperty(notes = "文章标签列表")
    private List<Long> tags;

}
