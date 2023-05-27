package com.leloz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leloz.domain.ResponseResult;
import com.leloz.domain.dto.AddArticleDto;
import com.leloz.domain.dto.ArticleDto;
import com.leloz.domain.entity.Article;
import com.leloz.domain.vo.ArticleVo;
import com.leloz.domain.vo.PageVo;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);

    ResponseResult add(AddArticleDto article);

    PageVo selectArticlePage(Article article, Integer pageNum, Integer pageSize);

    ArticleVo getInfo(Long id);

    void edit(ArticleDto article);
}

