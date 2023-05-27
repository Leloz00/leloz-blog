package com.leloz.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 博客后台
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "博客后台：查询标签列表Dto")
public class TagListDto {
    @ApiModelProperty(notes = "标签名")
    private String name;
    @ApiModelProperty(notes = "备注")
    private String remark;
}
