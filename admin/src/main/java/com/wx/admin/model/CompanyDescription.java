package com.wx.admin.model;

import java.io.Serializable;

public class CompanyDescription implements Serializable {
    /**
     * 公司简介主键id
     *
     * @mbg.generated
     */
    private Integer companyDescriptionId;

    /**
     * 公司id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     * 公司简介
     *
     * @mbg.generated
     */
    private String companyDescription;

    private static final long serialVersionUID = 1L;

    public Integer getCompanyDescriptionId() {
        return companyDescriptionId;
    }

    public void setCompanyDescriptionId(Integer companyDescriptionId) {
        this.companyDescriptionId = companyDescriptionId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyDescriptionId=").append(companyDescriptionId);
        sb.append(", companyId=").append(companyId);
        sb.append(", companyDescription=").append(companyDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}