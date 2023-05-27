package com.leloz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 *
 *
 * @author makejava
 * @since 2023-04-15 15:17:03
 */
@SuppressWarnings("serial")
@ApiModel("友链(Link)表实体类")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("leloz_link")
public class Link  {
    @ApiModelProperty("友链id")
    @TableId
    private Long id;


    @ApiModelProperty("友链名称")
    private String name;

    @ApiModelProperty("友链logo")
    private String logo;

    @ApiModelProperty("友链描述")
    private String description;
    //
    @ApiModelProperty("网站地址")
    private String address;
    //
    @ApiModelProperty("审核状态 (0代表审核通过，1代表审核未通过，2代表未审核)")
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

