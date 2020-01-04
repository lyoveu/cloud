package com.wx.admin.mapper;

import com.wx.admin.model.Area;
import com.wx.admin.model.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    long countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}