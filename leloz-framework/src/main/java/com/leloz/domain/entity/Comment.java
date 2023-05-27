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

import java.util.Date;

@ApiModel("评论表(Comment)表实体类")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("leloz_comment")
public class Comment  {
    @ApiModelProperty("评论id")
    @TableId
    private Long id;

    //
    @ApiModelProperty("评论类型（0代表文章评论，1代表友链评论）")
    private String type;
    //
    @ApiModelProperty("文章id")
    private Long articleId;
    //
    @ApiModelProperty("根评论id")
    private Long rootId;
    //
    @ApiModelProperty("评论内容")
    private String content;
    //
    @ApiModelProperty("所回复的目标评论的userid")
    private Long toCommentUserId;
    //
    @ApiModelProperty("回复目标评论id")
    private Long toCommentId;

    /**
     * 创建人的用户id
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createBy;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新人
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    //删除标志（0代表未删除，1代表已删除）
    private Integer delFlag;



}

