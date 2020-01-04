package com.wx.admin.service.impl;

import com.wx.admin.mapper.CityMapper;
import com.wx.admin.model.City;
import com.wx.admin.model.CityExample;
import com.wx.admin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CityService实现类
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> listAllCity() {
        return cityMapper.selectByExample(new CityExample());
    }

    @Override
    public int createCity(City city) {
        return cityMapper.insertSelective(city);
    }

    @Override
    public int updateCity(City city) {
        return cityMapper.updateByPrimaryKeySelective(city);
    }

    @Override
    public int deleteCity(Integer id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public City getCity(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }
}
