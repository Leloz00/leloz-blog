package com.leloz.controller;

import com.leloz.domain.ResponseResult;
import com.leloz.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController     //相应本类的方法
@RequestMapping("/article")

public class ArticleController {
    @Autowired
    private ArticleService articleService;

   /* @GetMapping("/list")
    public List<Article> test(){
        return articleService.list();
    }*/
    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList(){

      ResponseResult result = articleService.hotArticleList();
      return result;
    }

    @GetMapping("/articleList")//使得方法能够被请求需要使用。映射规则
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        return articleService.articleList(pageNum,pageSize,categoryId);
    }
    @PutMapping("/updateViewCount/{id}")
    public ResponseResult updateViewCount(@PathVariable("id") Long id){
        return articleService.updateViewCount(id);
    }


    @GetMapping("/{id}")
    public ResponseResult getArticleDetail(@PathVariable("id") Long id){      //获取路径形式的参数，不然获取到的只会是qurry？id=的形式
        //根据id查询文章详情
        return articleService.getArticleDetail(id);

    }
}
