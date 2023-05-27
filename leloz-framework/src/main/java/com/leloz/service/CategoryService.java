package com.leloz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leloz.domain.ResponseResult;
import com.leloz.domain.entity.Category;
import com.leloz.domain.vo.CategoryVo;
import com.leloz.domain.vo.PageVo;

import java.util.List;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-04-15 10:30:55
 */
public interface CategoryService extends IService<Category> {


    ResponseResult getCategoryList();

    List<CategoryVo> listAllCategory();

    // 分类接口
    PageVo selectCategoryPage(Category category, Integer pageNum, Integer pageSize);
}

