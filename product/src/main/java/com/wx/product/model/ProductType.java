package com.wx.product.model;

import java.io.Serializable;

public class ProductType implements Serializable {
    private Integer productTypeId;

    /**
     * 产品类型
     *
     * @mbg.generated
     */
    private Integer productType;

    /**
     * 产品类型名称
     *
     * @mbg.generated
     */
    private String productTypeName;

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
    private Integer productTypeState;

    private static final long serialVersionUID = 1L;

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getProductTypeState() {
        return productTypeState;
    }

    public void setProductTypeState(Integer productTypeState) {
        this.productTypeState = productTypeState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productTypeId=").append(productTypeId);
        sb.append(", productType=").append(productType);
        sb.append(", productTypeName=").append(productTypeName);
        sb.append(", sort=").append(sort);
        sb.append(", productTypeState=").append(productTypeState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}