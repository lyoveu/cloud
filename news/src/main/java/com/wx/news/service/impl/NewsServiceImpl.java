package com.wx.news.service.impl;

import com.github.pagehelper.PageHelper;
import com.wx.news.mapper.NewsMapper;
import com.wx.news.model.News;
import com.wx.news.model.NewsExample;
import com.wx.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * NewsService实现类
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> listAllNews() {
        return newsMapper.selectByExample(new NewsExample());
    }

    @Override
    public int createNews(News news) {
        return newsMapper.insertSelective(news);
    }

    @Override
    public int updateNews(News news) {
        return newsMapper.updateByPrimaryKeySelective(news);
    }

    @Override
    public int deleteNews(Long id) {
        return newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<News> listNews(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return newsMapper.selectByExample(new NewsExample());
    }

    @Override
    public News getNews(Long id) {
        return newsMapper.selectByPrimaryKey(id);
    }
}
