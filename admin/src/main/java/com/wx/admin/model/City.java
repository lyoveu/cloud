package com.wx.admin.model;

import java.io.Serializable;

public class City implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Integer cityId;

    /**
     * 城市编码
     *
     * @mbg.generated
     */
    private String cityCode;

    /**
     * 城市名称
     *
     * @mbg.generated
     */
    private String cityName;

    /**
     * 所属省份编码
     *
     * @mbg.generated
     */
    private String provinceCode;

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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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
        sb.append(", cityId=").append(cityId);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", cityName=").append(cityName);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", sort=").append(sort);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}