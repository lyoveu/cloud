package com.wx.product.model;

import java.io.Serializable;
import java.util.Date;

public class ProductImg implements Serializable {
    private Long productImgId;

    private Long productId;

    private String productImg;

    /**
     * 序号
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 状态：-1删除；0禁用；1正常
     *
     * @mbg.generated
     */
    private Integer productImgState;

    private static final long serialVersionUID = 1L;

    public Long getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getProductImgState() {
        return productImgState;
    }

    public void setProductImgState(Integer productImgState) {
        this.productImgState = productImgState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productImgId=").append(productImgId);
        sb.append(", productId=").append(productId);
        sb.append(", productImg=").append(productImg);
        sb.append(", sort=").append(sort);
        sb.append(", createTime=").append(createTime);
        sb.append(", productImgState=").append(productImgState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}