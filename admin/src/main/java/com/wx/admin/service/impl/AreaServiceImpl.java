package com.wx.admin.service.impl;

import com.wx.admin.mapper.AreaMapper;
import com.wx.admin.model.Area;
import com.wx.admin.model.AreaExample;
import com.wx.admin.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AreaService实现类
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> listAllArea() {
        return areaMapper.selectByExample(new AreaExample());
    }

    @Override
    public int createArea(Area area) {
        return areaMapper.insertSelective(area);
    }

    @Override
    public int updateArea(Area area) {
        return areaMapper.updateByPrimaryKeySelective(area);
    }

    @Override
    public int deleteArea(Integer id) {
        return areaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Area getArea(Integer id) {
        return areaMapper.selectByPrimaryKey(id);
    }
}
