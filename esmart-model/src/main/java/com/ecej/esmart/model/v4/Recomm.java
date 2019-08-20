package com.ecej.esmart.model.v4;

import java.io.Serializable;
import java.util.Date;

public class Recomm implements Serializable {
    private Date startTime;
    private Date endTime;
    private String workDate;
    private String workTime;
    private int state;
    private boolean isUrgency;
    private Integer orderModel = 1;
    private Integer timeType;
    private String timeTypeName;
    private Integer serviceAreaId;//服务区域id
    private Integer stationId;//服务站ID
    private Integer serviceCompanyId;//服务公司承接公司


    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getServiceAreaId() {
        return serviceAreaId;
    }

    public void setServiceAreaId(Integer serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    public Integer getServiceCompanyId() {
        return serviceCompanyId;
    }

    public void setServiceCompanyId(Integer serviceCompanyId) {
        this.serviceCompanyId = serviceCompanyId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean getIsUrgency() {
        return isUrgency;
    }

    public void setIsUrgency(boolean urgency) {
        isUrgency = urgency;
    }

    public Integer getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(Integer orderModel) {
        this.orderModel = orderModel;
    }

    public Integer getTimeType() {
        return timeType;
    }

    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    public String getTimeTypeName() {
        return timeTypeName;
    }

    public void setTimeTypeName(String timeTypeName) {
        this.timeTypeName = timeTypeName;
    }
}
