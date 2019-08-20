package com.ecej.esmart.model.dto.common;

import java.io.Serializable;
import java.util.Date;

public class ScheduleRecordIdPo implements Serializable {

    private static final long serialVersionUID = -1597926531219139409L;

    /**
     * 资源占用状态 1-正常占用资源 2-未正常用资源 3-跨档期占用
     */
    private Integer resourceOccupationStatus;

    /**
     * 排班 ID   无排班默认0
     */
    private Integer scheduleRecordId;

    /**
     * 员工ID
     */
    private Integer empId;

    /**
     * 起始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    public Integer getResourceOccupationStatus() {
        return resourceOccupationStatus;
    }

    public void setResourceOccupationStatus(Integer resourceOccupationStatus) {
        this.resourceOccupationStatus = resourceOccupationStatus;
    }

    public Integer getScheduleRecordId() {
        return scheduleRecordId;
    }

    public void setScheduleRecordId(Integer scheduleRecordId) {
        this.scheduleRecordId = scheduleRecordId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
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

    public ScheduleRecordIdPo() {
    }

    /**
     * svc_work_order表
     * `schedule_record_json` varchar(1000) DEFAULT NULL COMMENT '临时小组档期信息',
     * 构造函数[constructor fun] ScheduleRecordIdPo.
     *
     * @param resourceOccupationStatus 资源占用状态 1-正常占用资源2-未正常用资源
     * @param scheduleRecordId         档期ID
     * @param empId                    员工ID
     * @param startTime                员工预计开始时间
     * @param endTime                  员工预计结束时间
     */
    public ScheduleRecordIdPo(Integer resourceOccupationStatus, Integer scheduleRecordId, Integer empId, Date startTime,
                              Date endTime) {
        super();
        this.resourceOccupationStatus = resourceOccupationStatus;
        this.scheduleRecordId = scheduleRecordId;
        this.empId = empId;
        this.startTime = startTime;
        this.endTime = endTime;
    }


}
