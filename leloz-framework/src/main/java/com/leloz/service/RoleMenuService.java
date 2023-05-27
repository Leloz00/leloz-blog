package com.leloz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leloz.domain.entity.RoleMenu;

/**
 * @Author Leloz 
 */
public interface RoleMenuService extends IService<RoleMenu> {

    void deleteRoleMenuByRoleId(Long id);
}