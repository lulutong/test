package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TimeTableInput implements Serializable{
	
	private static final long serialVersionUID = 7577356631328511660L;

	private Integer cityId;
	private Integer workOrderId;
	private Integer requestSource;
	private Integer orderSource;
	private String guid;
	private String phone;
	private Integer empId;
	private Integer userId;
	private Integer companyId;
	private Integer extensionAgentId;
	private BigDecimal longitude;
	private BigDecimal latitude;
	private Date workDate;
	private Date oldWorkDate;
	private List<ServiceClassAndNum> serviceClassAndNum;
	private Date lockDate;
	private Integer dispatchType = 1;//1平台模式2周期订单
	private String serviceFrequency;//频次
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
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
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getExtensionAgentId() {
		return extensionAgentId;
	}
	public void setExtensionAgentId(Integer extensionAgentId) {
		this.extensionAgentId = extensionAgentId;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	public List<ServiceClassAndNum> getServiceClassAndNum() {
		return serviceClassAndNum;
	}
	public void setServiceClassAndNum(List<ServiceClassAndNum> serviceClassAndNum) {
		this.serviceClassAndNum = serviceClassAndNum;
	}
	public Date getLockDate() {
		return lockDate;
	}
	public void setLockDate(Date lockDate) {
		this.lockDate = lockDate;
	}
	public Date getOldWorkDate() {
		return oldWorkDate;
	}
	public void setOldWorkDate(Date oldWorkDate) {
		this.oldWorkDate = oldWorkDate;
	}
	public Integer getWorkOrderId() {
		return workOrderId;
	}
	public void setWorkOrderId(Integer workOrderId) {
		this.workOrderId = workOrderId;
	}
	public Integer getDispatchType() {
		return dispatchType;
	}
	public void setDispatchType(Integer dispatchType) {
		this.dispatchType = dispatchType;
	}
	public String getServiceFrequency() {
		return serviceFrequency;
	}
	public void setServiceFrequency(String serviceFrequency) {
		this.serviceFrequency = serviceFrequency;
	}
}
