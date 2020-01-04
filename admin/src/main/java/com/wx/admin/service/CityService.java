package com.wx.admin.service;

import com.wx.admin.model.City;

import java.util.List;

/**
 * CityService
 */
public interface CityService {

    /**
     * 列表
     * @return
     */
    List<City> listAllCity();

    /**
     * 新增
     * @param city
     * @return
     */
    int createCity(City city);

    /**
     * 修改
     * @param city
     * @return
     */
    int updateCity(City city);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteCity(Integer id);

    /**
     * 详情
     * @param id
     * @return
     */
    City getCity(Integer id);
}
