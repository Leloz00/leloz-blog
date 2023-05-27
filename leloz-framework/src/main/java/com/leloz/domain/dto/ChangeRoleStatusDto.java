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
@ApiModel(description = "博客后台：改变角色状态Dto")
public class ChangeRoleStatusDto {

    @ApiModelProperty(notes = "角色ID")
    private Long roleId;
    @ApiModelProperty(notes = "角色状态（0正常 1停用）")
    private String status;
}
