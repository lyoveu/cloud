package com.wx.news.model;

import java.io.Serializable;

public class NewsType implements Serializable {
    /**
     * 新闻类型主键id
     *
     * @mbg.generated
     */
    private Integer newsTypeId;

    /**
     * 新闻类型
     *
     * @mbg.generated
     */
    private Integer newsType;

    /**
     * 新闻类型名称
     *
     * @mbg.generated
     */
    private String newsTypeName;

    /**
     * 序号
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * 状态：-1删除；0禁用；1正常
     *
     * @mbg.generated
     */
    private Integer newsTypeState;

    private static final long serialVersionUID = 1L;

    public Integer getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(Integer newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    public Integer getNewsType() {
        return newsType;
    }

    public void setNewsType(Integer newsType) {
        this.newsType = newsType;
    }

    public String getNewsTypeName() {
        return newsTypeName;
    }

    public void setNewsTypeName(String newsTypeName) {
        this.newsTypeName = newsTypeName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getNewsTypeState() {
        return newsTypeState;
    }

    public void setNewsTypeState(Integer newsTypeState) {
        this.newsTypeState = newsTypeState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", newsTypeId=").append(newsTypeId);
        sb.append(", newsType=").append(newsType);
        sb.append(", newsTypeName=").append(newsTypeName);
        sb.append(", sort=").append(sort);
        sb.append(", newsTypeState=").append(newsTypeState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}