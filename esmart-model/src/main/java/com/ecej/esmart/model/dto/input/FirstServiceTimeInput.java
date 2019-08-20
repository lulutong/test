package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;
import com.ecej.esmart.model.dto.common.ServiceTimeEntity;

import java.io.Serializable;
import java.util.List;

public class FirstServiceTimeInput implements Serializable{

	private static final long serialVersionUID = 8923275411737130663L;
	
	private Integer requestSource;
	private Integer orderSource;
	private String phone;
	private Integer cityId;
	private Integer empId;
	private String serviceFrequency;//频次
	private List<ServiceTimeEntity> ServiceTimeEntityList;
	private List<ServiceClassAndNum> ServiceClassAndNumList;
	public Integer getRequestSource() {
		return requestSource;
	}
	public void setRequestSource(Integer requestSource) {
		this.requestSource = requestSource;
	}
	public Integer getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(Integer orderSource) {
		this.orderSource = orderSource;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public List<ServiceTimeEntity> getServiceTimeEntityList() {
		return ServiceTimeEntityList;
	}
	public void setServiceTimeEntityList(
			List<ServiceTimeEntity> serviceTimeEntityList) {
		ServiceTimeEntityList = serviceTimeEntityList;
	}
	public List<ServiceClassAndNum> getServiceClassAndNumList() {
		return ServiceClassAndNumList;
	}
	public void setServiceClassAndNumList(
			List<ServiceClassAndNum> serviceClassAndNumList) {
		ServiceClassAndNumList = serviceClassAndNumList;
	}
	public String getServiceFrequency() {
		return serviceFrequency;
	}
	public void setServiceFrequency(String serviceFrequency) {
		this.serviceFrequency = serviceFrequency;
	}
}
