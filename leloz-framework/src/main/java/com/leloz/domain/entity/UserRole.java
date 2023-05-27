package com.leloz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Leloz 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_user_role")
public class UserRole {

    /** 用户ID */
    @ApiModelProperty("用户id")
    private Long userId;

    /** 角色ID */
    @ApiModelProperty("角色id")
    private Long roleId;
}
