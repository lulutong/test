package com.ecej.esmart.model.dto.output;

import com.ecej.nove.base.po.BasePo;

public class ServiceAreaListOutput extends BasePo {
    /**
     * 服务区域ID
     */
    private Integer serviceAreaId;
    /**
     * 服务区域名称
     */
    private String serviceAreaName;
    /**
     * 是否订单服务区域
     */
    private Integer orderAreaFlag;

    public Integer getServiceAreaId() {
        return serviceAreaId;
    }

    public void setServiceAreaId(Integer serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    public String getServiceAreaName() {
        return serviceAreaName;
    }

    public void setServiceAreaName(String serviceAreaName) {
        this.serviceAreaName = serviceAreaName;
    }

    public Integer getOrderAreaFlag() {
        return orderAreaFlag;
    }

    public void setOrderAreaFlag(Integer orderAreaFlag) {
        this.orderAreaFlag = orderAreaFlag;
    }
}
