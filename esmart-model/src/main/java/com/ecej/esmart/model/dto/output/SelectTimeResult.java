package com.ecej.esmart.model.dto.output;

import java.util.Date;

public class SelectTimeResult implements java.io.Serializable {

	
	private static final long serialVersionUID = -6366442882032272569L;

	//用户预约开始时间
	private String startTime;
	//用户预约结束时间
	private String endTime;
	//预计开始时间
	private Date empExpectBeginTime;
	//预计上门时间
	private Date empExpectVisitTime;
	//预计结束时间
	private Date empExpectEndTime;
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
	
}
