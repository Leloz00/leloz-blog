package com.leloz.service;

import com.leloz.domain.ResponseResult;
import com.leloz.domain.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
