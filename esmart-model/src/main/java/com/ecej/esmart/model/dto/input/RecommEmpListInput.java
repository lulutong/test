package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class RecommEmpListInput implements Serializable{

	private static final long serialVersionUID = 5959998660655165259L;
	
	//用户id
	private Integer userId;
	//请求来源
	private Integer requestSource;
	//唯一标识
	private String guid;
	//电话号
	private String phone;
	//城市床
	private Integer cityId;
	//预约日期 yyyy-MM-dd HH:mm
	private Date workDate;
	//纬度
	private BigDecimal latitude;
	//经度
	private BigDecimal longitude;
	//服务品类
	private List<ServiceClassAndNum> serviceClassAndNum;
	private Integer lockEmpId;
	//页大小
	private Integer pageSize;
	//页码
	private Integer page;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRequestSource() {
		return requestSource;
	}
	public void setRequestSource(Integer requestSource) {
		this.requestSource = requestSource;
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
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
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
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLockEmpId() {
		return lockEmpId;
	}
	public void setLockEmpId(Integer lockEmpId) {
		this.lockEmpId = lockEmpId;
	}
	
}
