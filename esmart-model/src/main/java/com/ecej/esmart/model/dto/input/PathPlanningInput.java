package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.enums.DispatchMethodEnum;

import java.io.Serializable;
import java.util.Date;

public class PathPlanningInput implements Serializable {

    private Integer empId;//旧员工ID
    private Date workDate ;//旧预约日期
    private Integer timeType;//旧预约时间类型(1-上午，2-下午，3-晚上，4-全天)
    private DispatchMethodEnum dispatchType;//操作类型
    private Integer workOrderId;//订单ID


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
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

    public DispatchMethodEnum getDispatchType() {
        return dispatchType;
    }

    public void setDispatchType(DispatchMethodEnum dispatchType) {
        this.dispatchType = dispatchType;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }
}
