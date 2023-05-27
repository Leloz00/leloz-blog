package com.leloz.service;

import com.leloz.domain.ResponseResult;
import com.leloz.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
