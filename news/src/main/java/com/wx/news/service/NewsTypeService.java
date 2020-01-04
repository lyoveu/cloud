package com.wx.news.service;


import com.wx.news.model.NewsType;

import java.util.List;

/**
 * NewsTypeService
 */
public interface NewsTypeService {

    /**
     * 列表
     * @return
     */
    List<NewsType> listAllNewsType();

    /**
     * 新增
     * @param newsType
     * @return
     */
    int createNewsType(NewsType newsType);

    /**
     * 修改
     * @param newsType
     * @return
     */
    int updateNewsType(NewsType newsType);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteNewsType(Integer id);

    /**
     * 详情
     * @param id
     * @return
     */
    NewsType getNewsType(Integer id);
}
