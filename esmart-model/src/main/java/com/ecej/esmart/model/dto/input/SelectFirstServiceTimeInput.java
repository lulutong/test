package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;
import com.ecej.esmart.model.dto.common.ServiceTimeEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SelectFirstServiceTimeInput implements Serializable{

	
	private static final long serialVersionUID = -8212123172113474219L;
	private Integer requestSource;
	private Integer orderSource;
	private String phone;
	private Integer cityId;
	private Integer empId;
	private String serviceFrequency;//频次
	private List<ServiceTimeEntity> ServiceTimeEntityList;
	private List<ServiceClassAndNum> ServiceClassAndNumList;
	private Date firstServiceTime;
	private Integer userId;
	private BigDecimal laititude;
	private BigDecimal longitude;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public BigDecimal getLaititude() {
		return laititude;
	}
	public void setLaititude(BigDecimal laititude) {
		this.laititude = laititude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
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
	public Date getFirstServiceTime() {
		return firstServiceTime;
	}
	public void setFirstServiceTime(Date firstServiceTime) {
		this.firstServiceTime = firstServiceTime;
	}
	public String getServiceFrequency() {
		return serviceFrequency;
	}
	public void setServiceFrequency(String serviceFrequency) {
		this.serviceFrequency = serviceFrequency;
	}
}
