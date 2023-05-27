package com.leloz.controller;

import com.leloz.domain.ResponseResult;
import com.leloz.domain.dto.AddArticleDto;
import com.leloz.domain.dto.ArticleDto;
import com.leloz.domain.entity.Article;
import com.leloz.domain.vo.ArticleVo;
import com.leloz.domain.vo.PageVo;
import com.leloz.service.ArticleService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Leloz 
 */
@Api(description = "文章添加，文章列表，文章修改，文章删除")
@RestController
@RequestMapping("/content/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @ApiOperation("文章添加") // 不加字段默认为notes字段
    @PostMapping
    public ResponseResult add(@RequestBody @ApiParam("AddArticleDto对象") AddArticleDto article) {
        return articleService.add(article);
    }

    @ApiOperation(value = "文章查询", notes = "查询文章列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageSize", value = "每页大小"),
            @ApiImplicitParam(name = "pageNum", value = "页号"),
            @ApiImplicitParam(name = "article", value = "Article对象"),
    }
    )
    @GetMapping("/list")
    public ResponseResult list(Article article, Integer pageNum, Integer pageSize) {
        PageVo pageVo = articleService.selectArticlePage(article, pageNum, pageSize);
        return ResponseResult.okResult(pageVo);
    }

    @ApiOperation(value = "文章详情", notes = "通过文章id查询文章详情")
    @GetMapping(value = "/{id}")
    public ResponseResult getInfo(@PathVariable(value = "id") @ApiParam("文章id") Long id) {
        ArticleVo article = articleService.getInfo(id);
        return ResponseResult.okResult(article);
    }

    @ApiOperation(value = "文章修改", notes = "通过ArticleDto对象修改文章")
    @PutMapping
    public ResponseResult edit(@RequestBody @ApiParam("ArticleDto对象") ArticleDto article) {
        articleService.edit(article);
        return ResponseResult.okResult();
    }

    @ApiOperation(value = "文章删除", notes = "通过文章id删除文章")
    @DeleteMapping("/{id}")
    public ResponseResult delete(@PathVariable @ApiParam("文章id") Long id) {
        articleService.removeById(id);
        return ResponseResult.okResult();
    }
}
