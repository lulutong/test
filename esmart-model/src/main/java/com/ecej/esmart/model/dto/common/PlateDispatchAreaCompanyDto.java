
package com.ecej.esmart.model.dto.common;

public class PlateDispatchAreaCompanyDto {
    /**
     * 订单ID
     */
    private Integer workOrderId;
    /**
     * 服务区域ID
     */
    private Integer serviceAreaId;
    /**
     * 服务名称
     */
    private String areaName;
    /**
     * 公司ID
     */
    private Integer theirCompanyId;
    /**
     * 公司名称
     */
    private String CompanyName;

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getServiceAreaId() {
        return serviceAreaId;
    }

    public void setServiceAreaId(Integer serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getTheirCompanyId() {
        return theirCompanyId;
    }

    public void setTheirCompanyId(Integer theirCompanyId) {
        this.theirCompanyId = theirCompanyId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }
}

