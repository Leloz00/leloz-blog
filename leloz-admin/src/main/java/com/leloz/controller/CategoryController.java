package com.leloz.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.leloz.domain.ResponseResult;
import com.leloz.domain.entity.Category;
import com.leloz.domain.vo.CategoryVo;
import com.leloz.domain.vo.ExcelCategoryVo;
import com.leloz.domain.vo.PageVo;
import com.leloz.enums.AppHttpCodeEnum;
import com.leloz.service.CategoryService;
import com.leloz.utils.BeanCopyUtils;
import com.leloz.utils.WebUtils;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author Leloz 
 */
@Api(description = "分类接口")
@RestController
@RequestMapping("/content/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @ApiOperation("查询所有分类")
    @GetMapping("/listAllCategory")
    public ResponseResult listAllCategory() {
        List<CategoryVo> list = categoryService.listAllCategory();
        return ResponseResult.okResult(list);
    }


    @ApiOperation("导出所有分类到Excel")
    @PreAuthorize("@ps.hasPermission('content:category:export')")
    @GetMapping("/export")
    public void export(HttpServletResponse response) {
        try {
            //设置下载文件的请求头
            WebUtils.setDownLoadHeader("分类.xlsx", response);
            //获取需要导出的数据
            List<Category> categoryVos = categoryService.list();

            List<ExcelCategoryVo> excelCategoryVos = BeanCopyUtils.copyBeanList(categoryVos, ExcelCategoryVo.class);
            //把数据写入到Excel中
            EasyExcel.write(response.getOutputStream(), ExcelCategoryVo.class).autoCloseStream(Boolean.FALSE).sheet("分类导出")
                    .doWrite(excelCategoryVos);

        } catch (Exception e) {
            //如果出现异常也要响应json
            ResponseResult result = ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR);
            WebUtils.renderString(response, JSON.toJSONString(result));
        }
    }

    // 以下方法属于分类模块
    @ApiOperation("新增分类")
    @PostMapping
    public ResponseResult add(@RequestBody @ApiParam("分类对象") Category category) {
        categoryService.save(category);
        return ResponseResult.okResult();
    }

    @ApiOperation("修改分类")
    @PutMapping
    public ResponseResult edit(@RequestBody @ApiParam("分类对象") Category category) {
        categoryService.updateById(category);
        return ResponseResult.okResult();
    }

    @ApiOperation("删除分类")
    @DeleteMapping(value = "/{id}")
    public ResponseResult remove(@PathVariable(value = "id") @ApiParam("分类id") Long id) {
        categoryService.removeById(id);
        return ResponseResult.okResult();
    }

    @ApiOperation("根据id查询分类")
    @GetMapping(value = "/{id}")
    public ResponseResult getInfo(@PathVariable(value = "id") @ApiParam("分类id") Long id) {
        Category category = categoryService.getById(id);
        return ResponseResult.okResult(category);
    }


    /**
     * 分页查询分类列表
     */
    @ApiOperation("分页查询分类列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize", value = "每页大小"),
            @ApiImplicitParam(name = "pageNum", value = "页号"),
            @ApiImplicitParam(name = "category", value = "Category对象"),
    }
    )
    @GetMapping("/list")
    public ResponseResult list(Category category, Integer pageNum, Integer pageSize) {
        PageVo pageVo = categoryService.selectCategoryPage(category, pageNum, pageSize);
        return ResponseResult.okResult(pageVo);
    }
}
