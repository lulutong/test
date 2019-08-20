package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

import java.util.Date;

public class DispatchGrabOrderInput  extends BasePo{

    private Integer workOrderId;

    private Integer empId;

    private Integer stationId;

    private Integer serviceAreaId;

    /**
     * 预约开始时间
     */
    private Date bookStartTime;
    /**
     * 预约结束时间
     */
    private Date bookEndTime;
    /**
     * 员工预计开始时间
     */
    private Date empExpectBeginTime;
    /**
     * 员工预计上门时间
     */
    private Date empExpectVisitTime;
    /**
     * 员工预计结束时间
     */
    private Date empExpectEndTime;

    /**
     * 排班id
     */
    private Integer scheduleRecordId;

    /**
     * 档期 JSON
     */
    private String scheduleRecordJson;

    private Integer[] upgradeType;


    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

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

    public Date getBookStartTime() {
        return bookStartTime;
    }

    public void setBookStartTime(Date bookStartTime) {
        this.bookStartTime = bookStartTime;
    }

    public Date getBookEndTime() {
        return bookEndTime;
    }

    public void setBookEndTime(Date bookEndTime) {
        this.bookEndTime = bookEndTime;
    }

    public Date getEmpExpectBeginTime() {
        return empExpectBeginTime;
    }

    public void setEmpExpectBeginTime(Date empExpectBeginTime) {
        this.empExpectBeginTime = empExpectBeginTime;
    }

    public Date getEmpExpectVisitTime() {
        return empExpectVisitTime;
    }

    public void setEmpExpectVisitTime(Date empExpectVisitTime) {
        this.empExpectVisitTime = empExpectVisitTime;
    }

    public Date getEmpExpectEndTime() {
        return empExpectEndTime;
    }

    public void setEmpExpectEndTime(Date empExpectEndTime) {
        this.empExpectEndTime = empExpectEndTime;
    }

    public Integer getScheduleRecordId() {
        return scheduleRecordId;
    }

    public void setScheduleRecordId(Integer scheduleRecordId) {
        this.scheduleRecordId = scheduleRecordId;
    }

    public String getScheduleRecordJson() {
        return scheduleRecordJson;
    }

    public void setScheduleRecordJson(String scheduleRecordJson) {
        this.scheduleRecordJson = scheduleRecordJson;
    }

    public Integer[] getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(Integer[] upgradeType) {
        this.upgradeType = upgradeType;
    }
}
