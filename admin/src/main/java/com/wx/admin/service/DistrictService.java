package com.wx.admin.service;

import com.wx.admin.dto.ProvinceDto;

import java.util.List;

public interface DistrictService {

    /**
     * 获取地区tree
     * @return
     */
    List<ProvinceDto> getDistrictTree();
}
