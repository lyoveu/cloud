package com.wx.news.service;

import com.wx.news.model.News;

import java.util.List;

/**
 * NewsService
 */
public interface NewsService {

    /**
     * 列表
     * @return
     */
    List<News> listAllNews();

    /**
     * 新增
     * @param news
     * @return
     */
    int createNews(News news);

    /**
     * 修改
     * @param news
     * @return
     */
    int updateNews(News news);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteNews(Long id);

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<News> listNews(int pageNum, int pageSize);

    /**
     * 详情
     * @param id
     * @return
     */
    News getNews(Long id);
}
