package com.wx.admin.service;

import com.wx.admin.dto.ProvinceDto;
import com.wx.admin.model.Province;

import java.util.List;

/**
 * ProvinceService
 */
public interface ProvinceService {

    /**
     * 列表
     * @return
     */
    List<Province> listAllProvince();

    /**
     * 新增
     * @param province
     * @return
     */
    int createProvince(Province province);

    /**
     * 修改
     * @param province
     * @return
     */
    int updateProvince(Province province);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteProvince(Integer id);

    /**
     * 详情
     * @param id
     * @return
     */
    Province getProvince(Integer id);
}
