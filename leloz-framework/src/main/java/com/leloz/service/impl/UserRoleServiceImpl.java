package com.leloz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leloz.domain.entity.UserRole;
import com.leloz.mapper.UserRoleMapper;
import com.leloz.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * @Author Leloz 
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
}
