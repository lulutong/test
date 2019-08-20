package com.ecej.esmart.model.ecejservice;


import java.util.Date;

/**
 * <p>类描述：缓存中用户锁定的员工档期信息</p>
 *
 * @author 张佳恒[zjh]
 * @version: v1.0.0.1
 * @since JDK1.8
 * <p>创建日期：2016年6月13日 上午10:56:59</p>
 * Copyright 【新智泛能网络科技有限公司】 2016
 */
public class CacheEmp implements java.io.Serializable {


    /**
     * serialVersionUID:TODO（用一句话描述这个变量[bian liang]表示什么）
     *
     * @since Ver 1.1
     */

    private static final long serialVersionUID = 936372403079659022L;
    private Integer empId;//多能工id
    private Integer scheduleRecordId;//多能工档期id
    // 在途时间预设值
    private String workDate;//上门日期（2.0用）
    private String earliestWorkTime;//最早上门时间
    private String serviceHoursString;//服务耗时
    private int scheduleScaleSalues;//锁定时的档期刻度
    private int lockTime;//锁定时间单位秒
    private Date lock;//锁定时间
    private Integer weixin;//微信立刻下单标识 1:微信


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

    public String getEarliestWorkTime() {
        return earliestWorkTime;
    }

    public void setEarliestWorkTime(String earliestWorkTime) {
        this.earliestWorkTime = earliestWorkTime;
    }

    public String getServiceHoursString() {
        return serviceHoursString;
    }

    public void setServiceHoursString(String serviceHoursString) {
        this.serviceHoursString = serviceHoursString;
    }

    public int getScheduleScaleSalues() {
        return scheduleScaleSalues;
    }

    public void setScheduleScaleSalues(int scheduleScaleSalues) {
        this.scheduleScaleSalues = scheduleScaleSalues;
    }

    public int getLockTime() {
        return lockTime;
    }

    public void setLockTime(int lockTime) {
        this.lockTime = lockTime;
    }

    public Date getLock() {
        return lock;
    }

    public void setLock(Date lock) {
        this.lock = lock;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public Integer getWeixin() {
        return weixin;
    }

    public void setWeixin(Integer weixin) {
        this.weixin = weixin;
    }
}
