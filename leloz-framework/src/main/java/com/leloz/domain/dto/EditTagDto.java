package com.leloz.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// leloz-admin，博客后台，Swagger Models
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "博客后台：修改标签Dto")
public class EditTagDto {

    @ApiModelProperty(notes = "标签ID")
    private Long id;
    //备注
    @ApiModelProperty(notes = "备注")
    private String remark;
    //标签名
    @ApiModelProperty(notes = "标签名")
    private String name;
}
