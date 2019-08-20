
package com.ecej.esmart.model.dto.common;

public class PlateDispatchClassCountDto {
    /**
     * 订单ID
     */
    private Integer workOrderId;
    /**
     * 服务品类ID
     */
    private Integer serviceClassId;
    /**
     * 品类数量
     */
    private Integer quantity;
    /**
     * 服务品类名称
     */
    private String serviceClassName;

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getServiceClassId() {
        return serviceClassId;
    }

    public void setServiceClassId(Integer serviceClassId) {
        this.serviceClassId = serviceClassId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getServiceClassName() {
        return serviceClassName;
    }

    public void setServiceClassName(String serviceClassName) {
        this.serviceClassName = serviceClassName;
    }
}

