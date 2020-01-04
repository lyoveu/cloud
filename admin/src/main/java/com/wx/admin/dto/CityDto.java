package com.wx.admin.dto;

import com.wx.admin.model.City;

import java.io.Serializable;
import java.util.List;

public class CityDto extends City implements Serializable {

    /**
     * 区县列表
     */
    private List<AreaDto> areaList;

    public List<AreaDto> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<AreaDto> areaList) {
        this.areaList = areaList;
    }
}