package com.ecej.esmart.model.dto.common;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述:预约时间列表
 *
 * @author yanpenglei
 * @create 2018-05-21 15:17
 **/
public class ServiceCycleEntity implements Serializable {

    /**
     * 周 1-周一，2-周二，3-周三，4-周四，5-周五，6-周六，7-周日
     */
    private Integer week;

    /**
     * 用户预约开始时间 例如：2018-6-1 08:00 yyyy-MM-dd HH:mm
     */
    private Date startTime;
    /**
     * 请求唯一标识
     */
    private String guid;
    /**
     * 父订单编号
     */
    private String parentOrderNo;

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getParentOrderNo() {
        return parentOrderNo;
    }

    public void setParentOrderNo(String parentOrderNo) {
        this.parentOrderNo = parentOrderNo;
    }
}
