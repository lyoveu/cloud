package com.wx.admin.service.impl;

import com.alibaba.fastjson.JSON;
import com.wx.admin.dto.AreaDto;
import com.wx.admin.dto.CityDto;
import com.wx.admin.dto.DistrictDto;
import com.wx.admin.dto.ProvinceDto;
import com.wx.admin.model.Area;
import com.wx.admin.model.City;
import com.wx.admin.model.Province;
import com.wx.admin.service.AreaService;
import com.wx.admin.service.CityService;
import com.wx.admin.service.DistrictService;
import com.wx.admin.service.ProvinceService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private ProvinceService provinceService;
    @Autowired
    private CityService cityService;
    @Autowired
    private AreaService areaService;


    @Override
    public List<ProvinceDto> getDistrictTree() {
        List<Province> provinceList = provinceService.listAllProvince();
        if (provinceList == null || provinceList.isEmpty()) {
            return null;
        }

        List<City> cityList = cityService.listAllCity();
        List<Area> areaList = areaService.listAllArea();

        // 类型转换
        List<ProvinceDto> provinceDtoList = JSON.parseArray(JSON.toJSONString(provinceList), ProvinceDto.class);
        List<CityDto> cityDtoList = JSON.parseArray(JSON.toJSONString(cityList), CityDto.class);
        List<AreaDto> areaDtoList = JSON.parseArray(JSON.toJSONString(areaList), AreaDto.class);

        for (CityDto cityDto : cityDtoList) {
            cityDto.setAreaList(getAreaDtos(cityDto.getCityCode(),areaDtoList));
        }

        for (ProvinceDto provinceDto : provinceDtoList) {
            provinceDto.setCityList(getCityDtos(provinceDto.getProvinceCode(), cityDtoList));
        }

        return provinceDtoList;
    }

    /**
     * 获取城市下的所有地区
     * @param cityCode
     * @param areaDtoList
     * @return
     */
    private List<AreaDto> getAreaDtos(String cityCode, List<AreaDto> areaDtoList) {
        if (StringUtils.isBlank(cityCode) || areaDtoList == null || areaDtoList.isEmpty()) {
            return null;
        }
        List<AreaDto> areaDtos = new ArrayList<>();
        for (AreaDto areaDto : areaDtoList) {
            if (cityCode.equals(areaDto.getCityCode())) {
                areaDtos.add(areaDto);
            }
        }
        return areaDtos;
    }

    /**
     * 获取省下的所有城市
     * @param provinceCode
     * @param cityDtoList
     * @return
     */
    private List<CityDto> getCityDtos(String provinceCode, List<CityDto> cityDtoList) {
        if (StringUtils.isBlank(provinceCode) || cityDtoList == null || cityDtoList.isEmpty()) {
            return null;
        }
        List<CityDto> cityDtos = new ArrayList<>();
        for (CityDto cityDto : cityDtoList) {
            if (provinceCode.equals(cityDto.getProvinceCode())) {
                cityDtos.add(cityDto);
            }
        }
        return cityDtos;
    }
}
