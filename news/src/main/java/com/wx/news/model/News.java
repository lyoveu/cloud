package com.wx.news.model;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable {
    /**
     * 新闻id
     *
     * @mbg.generated
     */
    private Long newsId;

    /**
     * 类型
     *
     * @mbg.generated
     */
    private Integer newsType;

    /**
     * 标题
     *
     * @mbg.generated
     */
    private String newsTitle;

    /**
     * 副标题
     *
     * @mbg.generated
     */
    private String newsSubhead;

    /**
     * 内容
     *
     * @mbg.generated
     */
    private String newsContent;

    /**
     * 来源
     *
     * @mbg.generated
     */
    private Integer newsSource;

    /**
     * 作者
     *
     * @mbg.generated
     */
    private String newsAuthor;

    /**
     * 阅读量
     *
     * @mbg.generated
     */
    private Integer readCount;

    /**
     * 发布时间
     *
     * @mbg.generated
     */
    private Date newsPublishTime;

    private Integer sort;

    /**
     * 状态：-1删除；0禁用；1正常
     *
     * @mbg.generated
     */
    private Integer newsState;

    /**
     * 创建时间
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

    /**
     * 管理员
     *
     * @mbg.generated
     */
    private Long adminId;

    private static final long serialVersionUID = 1L;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public Integer getNewsType() {
        return newsType;
    }

    public void setNewsType(Integer newsType) {
        this.newsType = newsType;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsSubhead() {
        return newsSubhead;
    }

    public void setNewsSubhead(String newsSubhead) {
        this.newsSubhead = newsSubhead;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public Integer getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(Integer newsSource) {
        this.newsSource = newsSource;
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Date getNewsPublishTime() {
        return newsPublishTime;
    }

    public void setNewsPublishTime(Date newsPublishTime) {
        this.newsPublishTime = newsPublishTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getNewsState() {
        return newsState;
    }

    public void setNewsState(Integer newsState) {
        this.newsState = newsState;
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
        sb.append(", newsId=").append(newsId);
        sb.append(", newsType=").append(newsType);
        sb.append(", newsTitle=").append(newsTitle);
        sb.append(", newsSubhead=").append(newsSubhead);
        sb.append(", newsContent=").append(newsContent);
        sb.append(", newsSource=").append(newsSource);
        sb.append(", newsAuthor=").append(newsAuthor);
        sb.append(", readCount=").append(readCount);
        sb.append(", newsPublishTime=").append(newsPublishTime);
        sb.append(", sort=").append(sort);
        sb.append(", newsState=").append(newsState);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", adminId=").append(adminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}