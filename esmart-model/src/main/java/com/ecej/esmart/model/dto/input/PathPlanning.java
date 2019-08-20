package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.enums.DispatchMethodEnum;

import java.io.Serializable;
import java.util.Date;

public class PathPlanning implements Serializable {

    private static final long serialVersionUID = 4459964995211795069L;
    private Integer oldEmpId;//旧员工ID
    private Date oldWorkDate;//旧预约日期
    private Integer oldTimeType;//旧预约时间类型(1-上午，2-下午，3-晚上，4-全天)
    private Integer newEmpId;//新员工ID
    private Date newWorkDate;//新预约日期
    private Integer newTimeType;//新预约时间类型(1-上午，2-下午，3-晚上，4-全天)
    private DispatchMethodEnum dispatchType;//操作类型

    public Integer getOldEmpId() {
        return oldEmpId;
    }

    public void setOldEmpId(Integer oldEmpId) {
        this.oldEmpId = oldEmpId;
    }

    public Date getOldWorkDate() {
        return oldWorkDate;
    }

    public void setOldWorkDate(Date oldWorkDate) {
        this.oldWorkDate = oldWorkDate;
    }

    public Integer getOldTimeType() {
        return oldTimeType;
    }

    public void setOldTimeType(Integer oldTimeType) {
        this.oldTimeType = oldTimeType;
    }

    public Integer getNewEmpId() {
        return newEmpId;
    }

    public void setNewEmpId(Integer newEmpId) {
        this.newEmpId = newEmpId;
    }

    public Date getNewWorkDate() {
        return newWorkDate;
    }

    public void setNewWorkDate(Date newWorkDate) {
        this.newWorkDate = newWorkDate;
    }

    public Integer getNewTimeType() {
        return newTimeType;
    }

    public void setNewTimeType(Integer newTimeType) {
        this.newTimeType = newTimeType;
    }

    public DispatchMethodEnum getDispatchType() {
        return dispatchType;
    }

    public void setDispatchType(DispatchMethodEnum dispatchType) {
        this.dispatchType = dispatchType;
    }

    @Override
    public String toString() {
        return "PathPlanningInput{" +
                "oldEmpId=" + oldEmpId +
                ", oldWorkDate=" + oldWorkDate +
                ", oldTimeType=" + oldTimeType +
                ", newEmpId=" + newEmpId +
                ", newWorkDate=" + newWorkDate +
                ", newTimeType=" + newTimeType +
                ", dispatchType=" + dispatchType +
                '}';
    }
}
