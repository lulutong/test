package com.ecej.esmart.model.dto.common;

import java.io.Serializable;

public class ServiceTimeEntity implements Serializable{

	private static final long serialVersionUID = -3755701703252139582L;
	private String guid;
	private String parentOrderNo;//父订单
	private Integer week; //周几
	private String startTime; //时间
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
	public Integer getWeek() {
		return week;
	}
	public void setWeek(Integer week) {
		this.week = week;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
}
