package com.leloz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leloz.domain.entity.ArticleTag;
import com.leloz.mapper.ArticleTagMapper;
import com.leloz.service.ArticleTagService;
import org.springframework.stereotype.Service;

/**
 * 文章标签关联表(ArticleTag)表服务实现类
 *
 * @author makejava
 * @since 2023-04-25 13:42:38
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {
}

