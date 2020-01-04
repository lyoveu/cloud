package com.wx.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Product implements Serializable {
    /**
     * 产品id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     * 产品类型
     *
     * @mbg.generated
     */
    private Integer productType;

    /**
     * 产品名称
     *
     * @mbg.generated
     */
    private String productName;

    /**
     * 产品标题
     *
     * @mbg.generated
     */
    private String productTitle;

    /**
     * 产品副标题
     *
     * @mbg.generated
     */
    private String productSubhead;

    /**
     * 产品头图
     *
     * @mbg.generated
     */
    private String productHeader;

    /**
     * 市场价
     *
     * @mbg.generated
     */
    private BigDecimal marketPrice;

    /**
     * 价格
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 是否首页展示：0、否；1、是
     *
     * @mbg.generated
     */
    private Integer isHome;

    /**
     * 是否推荐：0、否；1、是
     *
     * @mbg.generated
     */
    private Integer isRecommend;

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
    private Integer productState;

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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductSubhead() {
        return productSubhead;
    }

    public void setProductSubhead(String productSubhead) {
        this.productSubhead = productSubhead;
    }

    public String getProductHeader() {
        return productHeader;
    }

    public void setProductHeader(String productHeader) {
        this.productHeader = productHeader;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsHome() {
        return isHome;
    }

    public void setIsHome(Integer isHome) {
        this.isHome = isHome;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getProductState() {
        return productState;
    }

    public void setProductState(Integer productState) {
        this.productState = productState;
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
        sb.append(", productId=").append(productId);
        sb.append(", productType=").append(productType);
        sb.append(", productName=").append(productName);
        sb.append(", productTitle=").append(productTitle);
        sb.append(", productSubhead=").append(productSubhead);
        sb.append(", productHeader=").append(productHeader);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", price=").append(price);
        sb.append(", description=").append(description);
        sb.append(", isHome=").append(isHome);
        sb.append(", isRecommend=").append(isRecommend);
        sb.append(", sort=").append(sort);
        sb.append(", productState=").append(productState);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", adminId=").append(adminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}