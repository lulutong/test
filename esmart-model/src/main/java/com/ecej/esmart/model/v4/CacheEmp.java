package com.ecej.esmart.model.v4;

import java.util.Date;

/**
 * 描述: 锁定多能工
 */
public class CacheEmp implements java.io.Serializable {

    /**
     * 师傅 ID
     */
    private Integer empId = 0;
    private Integer stationId;//服务站ID
    private Date workDate;//接单日期
    private Integer optionType;    //1-上午 2-下午 3-晚上
    private Integer lockTime;//锁定时间(秒)
    private Date lock;//锁定开始时间
    private Integer serviceHours;//服务耗时
    /**
     * 1-锁定的库存   2-锁定时间(没减库存)
     */
    private Integer lockType;

    private boolean noTimeOrder = false;

    private Integer serviceAreaId;

    public Integer getServiceAreaId() {
        return serviceAreaId;
    }

    public void setServiceAreaId(Integer serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    public boolean getNoTimeOrder() {
        return noTimeOrder;
    }

    public void setNoTimeOrder(boolean noTimeOrder) {
        this.noTimeOrder = noTimeOrder;
    }

    public Integer getLockType() {
        return lockType;
    }

    public void setLockType(Integer lockType) {
        this.lockType = lockType;
    }

    public Integer getServiceHours() {
        return serviceHours;
    }

    public void setServiceHours(Integer serviceHours) {
        this.serviceHours = serviceHours;
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

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Integer getOptionType() {
        return optionType;
    }

    public void setOptionType(Integer optionType) {
        this.optionType = optionType;
    }

    public Integer getLockTime() {
        return lockTime;
    }

    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    public Date getLock() {
        return lock;
    }

    public void setLock(Date lock) {
        this.lock = lock;
    }
}
