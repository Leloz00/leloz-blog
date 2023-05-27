package com.leloz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leloz.domain.entity.Role;

import java.util.List;


/**
 * 角色信息表(Role)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-24 10:57:12
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleKeyByUserId(Long userId);

    // 用户接口
    List<Long> selectRoleIdByUserId(Long userId);
}
