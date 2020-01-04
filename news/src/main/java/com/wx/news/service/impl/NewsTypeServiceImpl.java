package com.wx.news.service.impl;

import com.wx.news.mapper.NewsTypeMapper;
import com.wx.news.model.NewsType;
import com.wx.news.model.NewsTypeExample;
import com.wx.news.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * NewsTypeService实现类
 */
@Service
public class NewsTypeServiceImpl implements NewsTypeService {

    @Autowired
    private NewsTypeMapper newsTypeMapper;

    @Override
    public List<NewsType> listAllNewsType() {
        return newsTypeMapper.selectByExample(new NewsTypeExample());
    }

    @Override
    public int createNewsType(NewsType newsType) {
        return newsTypeMapper.insertSelective(newsType);
    }

    @Override
    public int updateNewsType(NewsType newsType) {
        return newsTypeMapper.updateByPrimaryKeySelective(newsType);
    }

    @Override
    public int deleteNewsType(Integer id) {
        return newsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public NewsType getNewsType(Integer id) {
        return newsTypeMapper.selectByPrimaryKey(id);
    }
}
