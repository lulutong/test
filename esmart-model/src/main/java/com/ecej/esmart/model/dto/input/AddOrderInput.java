package com.ecej.esmart.model.dto.input;

import java.io.Serializable;
import java.util.Date;

public class AddOrderInput implements Serializable {


    private static final long serialVersionUID = 621723458993769491L;
    private Integer workOrderId;//订单ID
    private String workOrderNo;//订单号
    private Integer stationId;//服务站ID
    private Date workDate;//预约日期
    private Integer timeType;//预约时间类型(1-上午，2-下午，3-晚上)

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

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Integer getTimeType() {
        return timeType;
    }

    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    @Override
    public String toString() {
        return "AddOrderInput{" +
                "workOrderId=" + workOrderId +
                ", workOrderNo='" + workOrderNo + '\'' +
                ", stationId=" + stationId +
                ", workDate=" + workDate +
                ", timeType=" + timeType +
                '}';
    }
}
