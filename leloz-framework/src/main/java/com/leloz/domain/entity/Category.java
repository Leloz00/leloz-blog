package com.leloz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel("分类表(Category)表实体类")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("leloz_category")
public class Category  {
    @ApiModelProperty("分类id")
    @TableId
    private Long id;

    //
    @ApiModelProperty("分类名")
    private String name;
    //
    @ApiModelProperty("父分类id，如果没有父分类为-1")
    private Long pid;
    //
    @ApiModelProperty("描述")
    private String description;
    //
    @ApiModelProperty("状态0:正常,1禁用")
    private String status;

    @ApiModelProperty("创建人")
    private Long createBy;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新人")
    private Long updateBy;

    @ApiModelProperty("更新时间")
    private Date updateTime;
    //
    @ApiModelProperty("删除标志（0代表未删除，1代表已删除）")
    private Integer delFlag;



}

