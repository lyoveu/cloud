package com.wx.admin.service;

import com.wx.admin.model.OnlineMessage;

import java.util.List;

/**
 * OnlineMessageService
 */
public interface OnlineMessageService {

    /**
     * 列表
     * @return
     */
    List<OnlineMessage> listAllOnlineMessage();

    /**
     * 新增
     * @param onlineMessage
     * @return
     */
    int createOnlineMessage(OnlineMessage onlineMessage);

    /**
     * 修改
     * @param onlineMessage
     * @return
     */
    int updateOnlineMessage(OnlineMessage onlineMessage);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteOnlineMessage(Long id);

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<OnlineMessage> listOnlineMessage(int pageNum, int pageSize);

    /**
     * 详情
     * @param id
     * @return
     */
    OnlineMessage getOnlineMessage(Long id);
}
