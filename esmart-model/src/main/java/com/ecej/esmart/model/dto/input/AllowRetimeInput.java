package com.ecej.esmart.model.dto.input;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;

public class AllowRetimeInput implements Serializable{

	private static final long serialVersionUID = 7244372965749313590L;

	private Integer requestSource;
	private Integer cityId;
	private String workOrderNo;
	private Date appointmentTime;
	private List<ServiceClassAndNum> serviceClassAndNum;
	public Integer getRequestSource() {
		return requestSource;
	}
	public void setRequestSource(Integer requestSource) {
		this.requestSource = requestSource;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getWorkOrderNo() {
		return workOrderNo;
	}
	public void setWorkOrderNo(String workOrderNo) {
		this.workOrderNo = workOrderNo;
	}
	public Date getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public List<ServiceClassAndNum> getServiceClassAndNum() {
		return serviceClassAndNum;
	}
	public void setServiceClassAndNum(List<ServiceClassAndNum> serviceClassAndNum) {
		this.serviceClassAndNum = serviceClassAndNum;
	}
	
}
