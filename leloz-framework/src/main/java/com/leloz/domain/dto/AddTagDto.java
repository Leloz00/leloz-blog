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
@ApiModel(description = "添加标签dto")
public class AddTagDto {
    //
    @ApiModelProperty("备注")
    private String remark;
    //
    @ApiModelProperty("标签名")
    private String name;
}
