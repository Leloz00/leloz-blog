package com.leloz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/**
 * 用户表(User)表实体类
 *
 * @author makejava
 * @since 2023-04-15 15:37:10
 */
@ApiModel(description = "用户实体类")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class User  {
    //主键@TableId
    @ApiModelProperty("主键@TableId")
    private Long id;

    //用户名
    @ApiModelProperty("用户名")
    private String userName;
    //昵称
    @ApiModelProperty("昵称")
    private String nickName;
    //密码
    @ApiModelProperty("密码")
    private String password;
    //用户类型：0代表普通用户，1代表管理员
    @ApiModelProperty("用户类型：0代表普通用户，1代表管理员")
    private String type;
    //账号状态（0正常 1停用）
    @ApiModelProperty("账号状态（0正常 1停用）")
    private String status;
    //邮箱
    @ApiModelProperty("邮箱")
    private String email;
    //手机号
    @ApiModelProperty("手机号")
    private String phonenumber;
    //用户性别（0男，1女，2未知）
    @ApiModelProperty("用户性别（0男，1女，2未知）")
    private String sex;
    //头像
    @ApiModelProperty("头像")
    private String avatar;
    //创建人的用户id
    @ApiModelProperty("创建人的用户id")
    private Long createBy;
    //创建时间
    @ApiModelProperty("创建时间")
    private Date createTime;
    //更新人
    @ApiModelProperty("更新人")
    private Long updateBy;
    //更新时间
    @ApiModelProperty("更新时间")
    private Date updateTime;
    //删除标志（0代表未删除，1代表已删除）
    @ApiModelProperty("删除标志（0代表未删除，1代表已删除）")
    private Integer delFlag;


    //关联角色id数组，非user表字段
    @TableField(exist = false)
    @ApiModelProperty("关联角色id数组，非user表字段")
    private Long[] roleIds;

}

