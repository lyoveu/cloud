package com.wx.admin.service;

import com.wx.admin.model.Area;

import java.util.List;

/**
 * AreaService
 */
public interface AreaService {

    /**
     * 列表
     * @return
     */
    List<Area> listAllArea();

    /**
     * 新增
     * @param area
     * @return
     */
    int createArea(Area area);

    /**
     * 修改
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteArea(Integer id);

    /**
     * 详情
     * @param id
     * @return
     */
    Area getArea(Integer id);
}
