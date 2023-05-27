package com.leloz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leloz.domain.ResponseResult;
import com.leloz.domain.entity.Role;

import java.util.List;


/**
 * 角色信息表(Role)表服务接口
 *
 * @author makejava
 * @since 2023-04-24 10:57:14
 */
public interface RoleService extends IService<Role> {

    List<String> selectRoleKeyByUserId(Long id);

    List<Role> selectRoleAll();

    void updateRole(Role role);

    void insertRole(Role role);

    ResponseResult selectRolePage(Role role, Integer pageNum, Integer pageSize);

    // 用户模块
    List<Long> selectRoleIdByUserId(Long userId);
}

