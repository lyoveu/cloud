package com.wx.news.controller;


import com.wx.news.common.BaseController;
import com.wx.news.common.api.CommonPage;
import com.wx.news.common.api.CommonResult;
import com.wx.news.model.News;
import com.wx.news.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 新闻管理
 */
@Api(tags = "NewsController", description = "新闻管理")
@RestController
@RequestMapping("/news")
@Slf4j
public class NewsController extends BaseController {
    
    @Autowired
    private NewsService newsService;


    @ApiOperation("获取所有新闻列表")
    @GetMapping("/listAll")
    public CommonResult<List<News>> getNewsList() {
        return CommonResult.success(newsService.listAllNews());
    }

    @ApiOperation("添加新闻")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createNews(@RequestBody News news) {
        CommonResult commonResult;
        int count = newsService.createNews(news);
        if (count == 1) {
            commonResult = CommonResult.success(news);
            log.debug("createNews success:{}", news);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createNews failed:{}", news);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id新闻信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult updateNews(@RequestBody News newsDto) {
        CommonResult commonResult;
        int count = newsService.updateNews(newsDto);
        if (count == 1) {
            commonResult = CommonResult.success(newsDto);
            log.debug("updateNews success:{}", newsDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateNews failed:{}", newsDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的新闻")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteNews(@PathVariable("id") Long id) {
        int count = newsService.deleteNews(id);
        if (count == 1) {
            log.debug("deleteNews success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("deleteNews failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("分页查询新闻列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<CommonPage<News>> listNews(@RequestParam(value = "pageNum", defaultValue = "1")
                                                        @ApiParam("页码") Integer pageNum,
                                                   @RequestParam(value = "pageSize", defaultValue = "3")
                                                        @ApiParam("每页数量") Integer pageSize) {
        List<News> newsList = newsService.listNews(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(newsList));
    }

    @ApiOperation("获取指定id的新闻详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<News> news(@PathVariable("id") Long id) {
        return CommonResult.success(newsService.getNews(id));
    }
}
