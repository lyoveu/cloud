package com.wx.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.wx.admin.mapper.OnlineMessageMapper;
import com.wx.admin.model.OnlineMessage;
import com.wx.admin.model.OnlineMessageExample;
import com.wx.admin.service.OnlineMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * OnlineMessageService实现类
 */
@Service
public class OnlineMessageServiceImpl implements OnlineMessageService {

    @Autowired
    private OnlineMessageMapper onlineMessageMapper;

    @Override
    public List<OnlineMessage> listAllOnlineMessage() {
        return onlineMessageMapper.selectByExample(new OnlineMessageExample());
    }

    @Override
    public int createOnlineMessage(OnlineMessage onlineMessage) {
        return onlineMessageMapper.insertSelective(onlineMessage);
    }

    @Override
    public int updateOnlineMessage(OnlineMessage onlineMessage) {
        return onlineMessageMapper.updateByPrimaryKeySelective(onlineMessage);
    }

    @Override
    public int deleteOnlineMessage(Long id) {
        return onlineMessageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<OnlineMessage> listOnlineMessage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return onlineMessageMapper.selectByExample(new OnlineMessageExample());
    }

    @Override
    public OnlineMessage getOnlineMessage(Long id) {
        return onlineMessageMapper.selectByPrimaryKey(id);
    }
}
