package com.wx.admin.model;

import java.io.Serializable;

public class Province implements Serializable {
    private Integer provinceId;

    /**
     * 省编码
     *
     * @mbg.generated
     */
    private String provinceCode;

    /**
     * 省名称
     *
     * @mbg.generated
     */
    private String provinceName;

    /**
     * 序号
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * 状态：0、禁用；1、正常
     *
     * @mbg.generated
     */
    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", provinceId=").append(provinceId);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", sort=").append(sort);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}