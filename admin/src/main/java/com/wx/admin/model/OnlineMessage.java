package com.wx.admin.model;

import java.io.Serializable;
import java.util.Date;

public class OnlineMessage implements Serializable {
    /**
     * 在线留言信息主键id
     *
     * @mbg.generated
     */
    private Long messageId;

    /**
     * 用户名
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 电话
     *
     * @mbg.generated
     */
    private String tel;

    /**
     * 留言状态：1、未读；2、待处理；3、已处理
     *
     * @mbg.generated
     */
    private String messageStatus;

    /**
     * 留言时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    private Long adminId;

    private static final long serialVersionUID = 1L;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageId=").append(messageId);
        sb.append(", userName=").append(userName);
        sb.append(", email=").append(email);
        sb.append(", content=").append(content);
        sb.append(", tel=").append(tel);
        sb.append(", messageStatus=").append(messageStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", adminId=").append(adminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}