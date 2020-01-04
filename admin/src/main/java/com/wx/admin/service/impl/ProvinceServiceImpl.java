package com.wx.admin.service.impl;

import com.alibaba.fastjson.JSON;
import com.wx.admin.dto.ProvinceDto;
import com.wx.admin.mapper.ProvinceMapper;
import com.wx.admin.model.Province;
import com.wx.admin.model.ProvinceExample;
import com.wx.admin.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ProvinceService实现类
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<Province> listAllProvince() {
        return provinceMapper.selectByExample(new ProvinceExample());
    }

    @Override
    public int createProvince(Province province) {
        return provinceMapper.insertSelective(province);
    }

    @Override
    public int updateProvince(Province province) {
        return provinceMapper.updateByPrimaryKeySelective(province);
    }

    @Override
    public int deleteProvince(Integer id) {
        return provinceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Province getProvince(Integer id) {
        return provinceMapper.selectByPrimaryKey(id);
    }
}
