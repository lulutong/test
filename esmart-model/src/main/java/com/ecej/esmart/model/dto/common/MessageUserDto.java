package com.ecej.esmart.model.dto.common;

import java.io.Serializable;

public class MessageUserDto implements Serializable {

    private static final long serialVersionUID = 8032867640485753293L;
    /**
     * 订单ID
     */
    private Integer workOrderId;
    /**
     * 订单号
     */
    private String workOrderNo;
    /**
     * 订单来源
     */
    private Integer orderSource;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 预约时间 例：2019-03-14 08:00-11:00
     */
    private String appointTime;

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime;
    }
}
