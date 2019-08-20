package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class EmployeeListInput implements Serializable{

	private static final long serialVersionUID = -6237571421169809605L; 
	
	private Integer cityId;
	private String guid;
	private Integer requestSource;
	private String phone;
	private Date workDate;
	private String workOrderNo;
	private Integer serviceAreaId;
	private Integer skillLabelId;
	private BigDecimal longitude;
	private BigDecimal latitude;
	private Integer nightModel;
	private List<ServiceClassAndNum> serviceClassAndNum;
	private Integer dispatchType = 1;//1平台模式2周期订单3极限下单
	private Integer combineGrapPlan = 0;//强派结合-抢单是否可以搜派单多能工   1可以0不可以
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
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	public String getWorkOrderNo() {
		return workOrderNo;
	}
	public void setWorkOrderNo(String workOrderNo) {
		this.workOrderNo = workOrderNo;
	}
	public Integer getServiceAreaId() {
		return serviceAreaId;
	}
	public void setServiceAreaId(Integer serviceAreaId) {
		this.serviceAreaId = serviceAreaId;
	}
	public Integer getSkillLabelId() {
		return skillLabelId;
	}
	public void setSkillLabelId(Integer skillLabelId) {
		this.skillLabelId = skillLabelId;
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
	public Integer getNightModel() {
		return nightModel;
	}
	public void setNightModel(Integer nightModel) {
		this.nightModel = nightModel;
	}
	public List<ServiceClassAndNum> getServiceClassAndNum() {
		return serviceClassAndNum;
	}
	public void setServiceClassAndNum(List<ServiceClassAndNum> serviceClassAndNum) {
		this.serviceClassAndNum = serviceClassAndNum;
	}
	public Integer getDispatchType() {
		return dispatchType;
	}
	public void setDispatchType(Integer dispatchType) {
		this.dispatchType = dispatchType;
	}
	public Integer getCombineGrapPlan() {
		return combineGrapPlan;
	}
	public void setCombineGrapPlan(Integer combineGrapPlan) {
		this.combineGrapPlan = combineGrapPlan;
	}
	
	
}
