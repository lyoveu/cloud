package com.wx.admin.mapper;

import com.wx.admin.model.OnlineMessage;
import com.wx.admin.model.OnlineMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineMessageMapper {
    long countByExample(OnlineMessageExample example);

    int deleteByExample(OnlineMessageExample example);

    int deleteByPrimaryKey(Long messageId);

    int insert(OnlineMessage record);

    int insertSelective(OnlineMessage record);

    List<OnlineMessage> selectByExample(OnlineMessageExample example);

    OnlineMessage selectByPrimaryKey(Long messageId);

    int updateByExampleSelective(@Param("record") OnlineMessage record, @Param("example") OnlineMessageExample example);

    int updateByExample(@Param("record") OnlineMessage record, @Param("example") OnlineMessageExample example);

    int updateByPrimaryKeySelective(OnlineMessage record);

    int updateByPrimaryKey(OnlineMessage record);
}