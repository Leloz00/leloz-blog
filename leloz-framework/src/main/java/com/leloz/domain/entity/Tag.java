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
 * 标签(Tag)表实体类
 *
 * @author makejava
 * @since 2023-04-24 09:33:27
 */
@SuppressWarnings("serial")
@ApiModel("标签(Tag)表实体类")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("leloz_tag")
public class Tag  {
    @ApiModelProperty("标签id")
    @TableId
    private Long id;

    //标签名
    @ApiModelProperty("标签名")
    private String name;
    
    private Long createBy;
    
    private Date createTime;
    
    private Long updateBy;
    
    private Date updateTime;
    //删除标志（0代表未删除，1代表已删除）
    @ApiModelProperty("删除标志（0代表未删除，1代表已删除）")
    private Integer delFlag;
    //备注
    @ApiModelProperty("备注")
    private String remark;



}

