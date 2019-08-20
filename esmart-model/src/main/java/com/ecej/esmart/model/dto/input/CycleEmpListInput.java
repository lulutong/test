package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CycleEmpListInput implements Serializable{

	private static final long serialVersionUID = -6435434179697832253L;

	private Integer requestSource;
	private String phone;
	private Integer cityId;
	private Integer userId;
	private BigDecimal laititude;
	private BigDecimal longitude;
	private List<ServiceClassAndNum>serviceClassAndnumList;
	private Integer companyId;
	private Integer areaId;
	private String serviceFrequency;
	private String guid;
	private Integer skillLabelId;
	
	public Integer getRequestSource() {
		return requestSource;
	}
	public void setRequestSource(Integer requestSource) {
		this.requestSource = requestSource;
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
	public List<ServiceClassAndNum> getServiceClassAndnumList() {
		return serviceClassAndnumList;
	}
	public void setServiceClassAndnumList(
			List<ServiceClassAndNum> serviceClassAndnumList) {
		this.serviceClassAndnumList = serviceClassAndnumList;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getServiceFrequency() {
		return serviceFrequency;
	}
	public void setServiceFrequency(String serviceFrequency) {
		this.serviceFrequency = serviceFrequency;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public Integer getSkillLabelId() {
		return skillLabelId;
	}
	public void setSkillLabelId(Integer skillLabelId) {
		this.skillLabelId = skillLabelId;
	}
	
}
