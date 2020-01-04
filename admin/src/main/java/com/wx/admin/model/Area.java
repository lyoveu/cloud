package com.wx.admin.model;

import java.io.Serializable;

public class Area implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Integer areaId;

    /**
     * 区县编码
     *
     * @mbg.generated
     */
    private String areaCode;

    /**
     * 区县名称
     *
     * @mbg.generated
     */
    private String areaName;

    /**
     * 所属城市编码
     *
     * @mbg.generated
     */
    private String cityCode;

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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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
        sb.append(", areaId=").append(areaId);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", areaName=").append(areaName);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", sort=").append(sort);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}