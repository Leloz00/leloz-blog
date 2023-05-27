package com.leloz.controller;

import com.leloz.domain.ResponseResult;
import com.leloz.service.UploadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author Leloz 
 */
@Api(description = "图片上传接口")
@RestController
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @ApiOperation("上传图片")
    @PostMapping("/upload")
    public ResponseResult uploadImg(@RequestParam("img") MultipartFile multipartFile) {
        return uploadService.uploadImg(multipartFile);
    }
}