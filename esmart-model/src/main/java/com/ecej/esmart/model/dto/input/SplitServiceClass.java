package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SplitServiceClass implements Serializable{

	private static final long serialVersionUID = -3657202349402950174L;
	
	private Integer requestSource;
	private Integer cityId;
	private String guid;
	private Integer userId;
	private String phone;
	private Integer companyId;
	private Integer extensionAgentId;
	private String cellName;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private List<ServiceClassAndNum> serviceClassAndNum;
	private Integer nightModel;
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
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getCellName() {
		return cellName;
	}
	public void setCellName(String cellName) {
		this.cellName = cellName;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public List<ServiceClassAndNum> getServiceClassAndNum() {
		return serviceClassAndNum;
	}
	public void setServiceClassAndNum(List<ServiceClassAndNum> serviceClassAndNum) {
		this.serviceClassAndNum = serviceClassAndNum;
	}
	public Integer getNightModel() {
		return nightModel;
	}
	public void setNightModel(Integer nightModel) {
		this.nightModel = nightModel;
	}
}
