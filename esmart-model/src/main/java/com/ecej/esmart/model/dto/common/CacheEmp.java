package com.ecej.esmart.model.dto.common;

import java.io.Serializable;
import java.util.Date;

public class CacheEmp implements Serializable{

	private static final long serialVersionUID = 9163521313573422354L;
	
	private Integer empId;//多能工id
	private Integer scheduleRecordId;//多能工档期id
	private Date workDate;//出发时间
	private Integer serviceHours;//服务耗时+在途
	private Integer scheduleScaleSalues;//锁定时的档期刻度
	private Date creatDatetime;//锁定时间单位秒
	
	private boolean update = false;//改约档期重合标识
	
	private Integer startIndex;//老订单占用的1在目标串中的起始位置
	private Integer endIndex;//老订单占用的1在目标串中的截止位置
	
	
	
	//动态在途参数
	//订单id
	private Integer workOrderId;
	//新在途
	private Integer newInWay;
	
	
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
	public Date getCreatDatetime() {
		return creatDatetime;
	}
	public void setCreatDatetime(Date creatDatetime) {
		this.creatDatetime = creatDatetime;
	}
	public Integer getScheduleScaleSalues() {
		return scheduleScaleSalues;
	}
	public void setScheduleScaleSalues(Integer scheduleScaleSalues) {
		this.scheduleScaleSalues = scheduleScaleSalues;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	public Integer getServiceHours() {
		return serviceHours;
	}
	public void setServiceHours(Integer serviceHours) {
		this.serviceHours = serviceHours;
	}
	public boolean getUpdate() {
		return update;
	}
	public void setUpdate(boolean update) {
		this.update = update;
	}
	public Integer getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	public Integer getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}
	public Integer getWorkOrderId() {
		return workOrderId;
	}
	public void setWorkOrderId(Integer workOrderId) {
		this.workOrderId = workOrderId;
	}
	public Integer getNewInWay() {
		return newInWay;
	}
	public void setNewInWay(Integer newInWay) {
		this.newInWay = newInWay;
	}
	
	
}
