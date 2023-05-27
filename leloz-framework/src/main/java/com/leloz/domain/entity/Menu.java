package com.leloz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * 菜单权限表(Menu)表实体类
 *
 * @author makejava
 * @since 2023-04-24 10:48:21
 */
@ApiModel("菜单权限表(Menu)表实体类")
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_menu")
@Accessors(chain = true) // 链式编程，使set方法拥有返回值
public class Menu  {
    //
    @ApiModelProperty("菜单ID@TableId")
    private Long id;

    //
    @ApiModelProperty("菜单名称")
    private String menuName;
    //
    @ApiModelProperty("父菜单ID")
    private Long parentId;
    //
    @ApiModelProperty("显示顺序")
    private Integer orderNum;
    //
    @ApiModelProperty("路由地址")
    private String path;
    //
    @ApiModelProperty("组件路径")
    private String component;
    //
    @ApiModelProperty("是否为外链（0是 1否）")
    private Integer isFrame;
    //
    @ApiModelProperty("菜单类型（M目录 C菜单 F按钮）")
    private String menuType;
    //
    @ApiModelProperty("菜单状态（0显示 1隐藏）")
    private String visible;
    //
    @ApiModelProperty("菜单状态（0正常 1停用）")
    private String status;
    //
    @ApiModelProperty("权限标识")
    private String perms;
    //
    @ApiModelProperty("菜单图标")
    private String icon;
    //
    @ApiModelProperty("创建者")
    private Long createBy;
    //
    @ApiModelProperty("创建时间")
    private Date createTime;
    //
    @ApiModelProperty("更新者")
    private Long updateBy;
    //
    @ApiModelProperty("更新时间")
    private Date updateTime;
    //
    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("删除标志（0代表未删除，1代表已删除）")
    private String delFlag;

    @TableField(exist = false)
    @ApiModelProperty("子菜单列表？")
    private List<Menu> children;
}

