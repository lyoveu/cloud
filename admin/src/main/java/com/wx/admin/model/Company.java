package com.wx.admin.model;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable {
    /**
     * 公司id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     * 公司名称
     *
     * @mbg.generated
     */
    private String comanyName;

    /**
     * 电话
     *
     * @mbg.generated
     */
    private String tel;

    /**
     * 传真
     *
     * @mbg.generated
     */
    private String fax;

    /**
     * 邮件
     *
     * @mbg.generated
     */
    private String email;

    /**
     * 网址
     *
     * @mbg.generated
     */
    private String url;

    /**
     * 省
     *
     * @mbg.generated
     */
    private Integer provinceId;

    /**
     * 市
     *
     * @mbg.generated
     */
    private Integer cityId;

    /**
     * 区
     *
     * @mbg.generated
     */
    private Integer areaId;

    /**
     * 街道
     *
     * @mbg.generated
     */
    private String street;

    /**
     * 状态：-1、删除；0、禁用；1、正常
     *
     * @mbg.generated
     */
    private Integer comanyState;

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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getComanyName() {
        return comanyName;
    }

    public void setComanyName(String comanyName) {
        this.comanyName = comanyName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getComanyState() {
        return comanyState;
    }

    public void setComanyState(Integer comanyState) {
        this.comanyState = comanyState;
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
        sb.append(", companyId=").append(companyId);
        sb.append(", comanyName=").append(comanyName);
        sb.append(", tel=").append(tel);
        sb.append(", fax=").append(fax);
        sb.append(", email=").append(email);
        sb.append(", url=").append(url);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", areaId=").append(areaId);
        sb.append(", street=").append(street);
        sb.append(", comanyState=").append(comanyState);
        sb.append(", sort=").append(sort);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", adminId=").append(adminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}