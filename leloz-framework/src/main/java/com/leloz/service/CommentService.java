package com.leloz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leloz.domain.ResponseResult;
import com.leloz.domain.entity.Comment;


/**
 * 评论表(Comment)表服务接口
 *
 * @author makejava
 * @since 2023-04-21 18:00:41
 */
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(String commentType, Long articleId, Integer pageNum, Integer pageSize);
    ResponseResult addComment(Comment comment);
}


