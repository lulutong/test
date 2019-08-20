package com.ecej.esmart.model.v4;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单地图列表
 */
public class WorkOrderListToMapResult implements Serializable {

    private Integer workOrderId;
    /**
     * 序号
     */
    private Integer orderSequence;
    private BigDecimal longitude;
    private BigDecimal latitude;

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getOrderSequence() {
        return orderSequence;
    }

    public void setOrderSequence(Integer orderSequence) {
        this.orderSequence = orderSequence;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
