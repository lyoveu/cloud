package com.wx.admin.mapper;

import com.wx.admin.model.Province;
import com.wx.admin.model.ProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvinceMapper {
    long countByExample(ProvinceExample example);

    int deleteByExample(ProvinceExample example);

    int deleteByPrimaryKey(Integer provinceId);

    int insert(Province record);

    int insertSelective(Province record);

    List<Province> selectByExample(ProvinceExample example);

    Province selectByPrimaryKey(Integer provinceId);

    int updateByExampleSelective(@Param("record") Province record, @Param("example") ProvinceExample example);

    int updateByExample(@Param("record") Province record, @Param("example") ProvinceExample example);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);
}