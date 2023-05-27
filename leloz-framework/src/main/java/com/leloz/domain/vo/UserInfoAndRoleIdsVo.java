package com.leloz.domain.vo;

import com.leloz.domain.entity.Role;
import com.leloz.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 标签(Tag)表实体类
 *
 * @author makejava
 * @since 2023-04-19 22:33:36
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoAndRoleIdsVo {
    private User user;
    private List<Role> roles;
    private List<Long> roleIds;
}
