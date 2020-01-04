package com.wx.news.controller;


import com.wx.news.common.BaseController;
import com.wx.news.common.api.CommonResult;
import com.wx.news.model.NewsType;
import com.wx.news.service.NewsTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 新闻类型管理
 */
@Api(tags = "NewsTypeController", description = "新闻类型管理")
@RestController
@RequestMapping("/newsType")
@Slf4j
public class NewsTypeController extends BaseController {
    
    @Autowired
    private NewsTypeService newsTypeService;


    @ApiOperation("获取所有新闻类型列表")
    @GetMapping("/listAll")
    public CommonResult<List<NewsType>> getNewsTypeList() {
        return CommonResult.success(newsTypeService.listAllNewsType());
    }

    @ApiOperation("添加新闻类型")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createNewsType(@RequestBody NewsType newsType) {
        CommonResult commonResult;
        int count = newsTypeService.createNewsType(newsType);
        if (count == 1) {
            commonResult = CommonResult.success(newsType);
            log.debug("createNewsType success:{}", newsType);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createNewsType failed:{}", newsType);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id新闻类型信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult updateNewsType(@RequestBody NewsType newsTypeDto) {
        CommonResult commonResult;
        int count = newsTypeService.updateNewsType(newsTypeDto);
        if (count == 1) {
            commonResult = CommonResult.success(newsTypeDto);
            log.debug("updateNewsType success:{}", newsTypeDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateNewsType failed:{}", newsTypeDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的新闻类型")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteNewsType(@PathVariable("id") Integer id) {
        int count = newsTypeService.deleteNewsType(id);
        if (count == 1) {
            log.debug("deleteNewsType success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("deleteNewsType failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("获取指定id的新闻类型详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<NewsType> newsType(@PathVariable("id") Integer id) {
        return CommonResult.success(newsTypeService.getNewsType(id));
    }
}
