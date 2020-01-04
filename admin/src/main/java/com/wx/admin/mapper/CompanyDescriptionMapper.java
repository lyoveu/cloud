package com.wx.admin.mapper;

import com.wx.admin.model.CompanyDescription;
import com.wx.admin.model.CompanyDescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyDescriptionMapper {
    long countByExample(CompanyDescriptionExample example);

    int deleteByExample(CompanyDescriptionExample example);

    int deleteByPrimaryKey(Integer companyDescriptionId);

    int insert(CompanyDescription record);

    int insertSelective(CompanyDescription record);

    List<CompanyDescription> selectByExample(CompanyDescriptionExample example);

    CompanyDescription selectByPrimaryKey(Integer companyDescriptionId);

    int updateByExampleSelective(@Param("record") CompanyDescription record, @Param("example") CompanyDescriptionExample example);

    int updateByExample(@Param("record") CompanyDescription record, @Param("example") CompanyDescriptionExample example);

    int updateByPrimaryKeySelective(CompanyDescription record);

    int updateByPrimaryKey(CompanyDescription record);
}