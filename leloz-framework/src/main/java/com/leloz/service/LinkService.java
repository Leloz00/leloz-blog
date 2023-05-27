package com.leloz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leloz.domain.ResponseResult;
import com.leloz.domain.entity.Link;
import com.leloz.domain.vo.PageVo;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2023-04-15 15:17:04
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();

    // 友链模块
    PageVo selectLinkPage(Link link, Integer pageNum, Integer pageSize);
}

