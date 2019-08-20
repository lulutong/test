package com.ecej.esmart.model.dto.common;

import java.util.Date;

/**
 * <p>
 *      排班对应的缓存信息
 *      清除师傅两分钟预占使用
 * </p>
 *
 * @author kevin
 * @create 2018-03-15 10:20
 **/
public class CacheScheduleInfo {
    /**
     * 排班ID
     */
    private Integer scheduleRecordId;
    /**
     * 排班默认字符串
     */
    private String agendaSchedule;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    public Integer getScheduleRecordId() {
        return scheduleRecordId;
    }

    public void setScheduleRecordId(Integer scheduleRecordId) {
        this.scheduleRecordId = scheduleRecordId;
    }

    public String getAgendaSchedule() {
        return agendaSchedule;
    }

    public void setAgendaSchedule(String agendaSchedule) {
        this.agendaSchedule = agendaSchedule;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
