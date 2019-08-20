package com.ecej.esmart.model.v4;

import java.io.Serializable;

public class TimeTablev4 implements Serializable{

	//开始时间
	private String startTime;
	//结束时间
	private String endTime;
	//可选状态 0可选 1不可选 2选中
	private int optionalState = 1;
	//时间类型描述
	private String timeTypeName;
	//时间类型
	private Integer timeType;
	//订单数量
	private Integer orderNum = 0;
	// 1 : 剩余单量   2 : 升级单量
	private Integer orderNumType;

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getOrderNumType() {
		return orderNumType;
	}

	public void setOrderNumType(Integer orderNumType) {
		this.orderNumType = orderNumType;
	}

	public String getTimeTypeName() {
		return timeTypeName;
	}

	public void setTimeTypeName(String timeTypeName) {
		this.timeTypeName = timeTypeName;
	}

	public Integer getTimeType() {
		return timeType;
	}

	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
	}

	public int getOptionalState() {
		return optionalState;
	}
	public void setOptionalState(int optionalState) {
		this.optionalState = optionalState;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
