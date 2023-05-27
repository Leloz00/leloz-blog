package com.leloz.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "添加评论dto")
public class AddCommentDto {

    @ApiModelProperty(notes = "添加的评论id")
    private Long id;
    @ApiModelProperty(notes = "评论类型（0代表文章评论，1代表友链评论）")
    private String type;

    @ApiModelProperty(notes = "文章id")
    private Long articleId;

    @ApiModelProperty(notes = "根评论id")
    private Long rootId;

    @ApiModelProperty(notes = "评论内容")
    private String content;

    @ApiModelProperty(notes = "所回复的目标评论的userid")
    private Long toCommentUserId;

    @ApiModelProperty(notes = "回复目标评论id")
    private Long toCommentId;
    @ApiModelProperty(notes = "评论人id")
    private Long createBy;
    @ApiModelProperty(notes = "评论时间")
    private Date createTime;
    @ApiModelProperty(notes = "更新人id")
    private Long updateBy;
    @ApiModelProperty(notes = "更新时间")
    private Date updateTime;

    @ApiModelProperty(notes = "删除标志（0代表未删除，1代表已删除）")
    private Integer delFlag;
}