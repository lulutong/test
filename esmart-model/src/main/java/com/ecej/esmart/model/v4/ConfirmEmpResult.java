package com.ecej.esmart.model.v4;

import com.ecej.esmart.model.enums.DispatchTypeEnum;

import java.util.Date;

/**
 * 描述: 确认师傅响应
 *
 **/
public class ConfirmEmpResult implements java.io.Serializable {

    /**
     * 师傅 ID
     */
    private Integer empId;

    /**
     * 排班 ID
     */
    private Integer scheduleRecordId;

    /**
     * 服务站ID
     */
    private Integer stationId;

    /**
     * 服务区域ID
     */
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
     * 派工状态 0-受理中 1-已派工
     */
    private Integer dipatchStatus;

    /**
     * 资源占用状态 1-正常占用资源2-未正常用资源
     */
    private Integer resourceOccupationStatus;

    /**
     * 资源占用详情
     */
    private String scheduleRecordIdPoList;

    //派工方式
    private DispatchTypeEnum dispatchTypeEnum;

    public DispatchTypeEnum getDispatchTypeEnum() {
        return dispatchTypeEnum;
    }

    public void setDispatchTypeEnum(DispatchTypeEnum dispatchTypeEnum) {
        this.dispatchTypeEnum = dispatchTypeEnum;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getScheduleRecordId() {
        return scheduleRecordId;
    }

    public void setScheduleRecordId(Integer scheduleRecordId) {
        this.scheduleRecordId = scheduleRecordId;
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

    public Integer getDipatchStatus() {
        return dipatchStatus;
    }

    public void setDipatchStatus(Integer dipatchStatus) {
        this.dipatchStatus = dipatchStatus;
    }

    public Integer getResourceOccupationStatus() {
        return resourceOccupationStatus;
    }

    public void setResourceOccupationStatus(Integer resourceOccupationStatus) {
        this.resourceOccupationStatus = resourceOccupationStatus;
    }

    public String getScheduleRecordIdPoList() {
        return scheduleRecordIdPoList;
    }

    public void setScheduleRecordIdPoList(String scheduleRecordIdPoList) {
        this.scheduleRecordIdPoList = scheduleRecordIdPoList;
    }
}
