package com.wx.admin.dto;

import com.wx.admin.model.Province;

import java.io.Serializable;
import java.util.List;

public class ProvinceDto extends Province implements Serializable {

    /**
     * 城市列表
     */
    private List<CityDto> cityList;

    public List<CityDto> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityDto> cityList) {
        this.cityList = cityList;
    }
}