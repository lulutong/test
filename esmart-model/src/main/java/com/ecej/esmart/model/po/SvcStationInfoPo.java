
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcStationInfoPo extends BasePo{
	//alias
	public static final String TABLE_ALIAS = "SvcStationInfo";
	

	//columns START
    /**
     * 服务站ID       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 状态       db_column: status   
     */ 	
	private Integer status;
    /**
     * 服务站名称       db_column: station_name   
     */ 	
	private String stationName;
    /**
     * 原系统编码       db_column: source_no   
     */ 	
	private String sourceNo;
    /**
     * 经度       db_column: longitude   
     */ 	
	private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude   
     */ 	
	private java.math.BigDecimal latitude;
    /**
     * 站长ID       db_column: station_head_id   
     */ 	
	private Integer stationHeadId;
    /**
     * 地址       db_column: address   
     */ 	
	private String address;
    /**
     * 创建者       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 创建时间       db_column: create_time   
     */ 	
	private java.util.Date createTime;
    /**
     * 更新者       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 更新时间       db_column: update_time   
     */ 	
	private java.util.Date updateTime;
    /**
     * 所属公司ID       db_column: their_company_id   
     */ 	
	private Integer theirCompanyId;
    /**
     * 数据创建时间       db_column: screate_time   
     */ 	
	private java.util.Date screateTime;
    /**
     * 数据更新时间       db_column: supdate_time   
     */ 	
	private java.util.Date supdateTime;
    /**
     * 1:删除 0:未删除       db_column: del_flag   
     */ 	
	private Integer delFlag;
	//columns END


	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	
	public String getStationName() {
		return this.stationName;
	}
	
	public void setStationName(String value) {
		this.stationName = value;
	}
	
	
	public String getSourceNo() {
		return this.sourceNo;
	}
	
	public void setSourceNo(String value) {
		this.sourceNo = value;
	}
	
	
	public java.math.BigDecimal getLongitude() {
		return this.longitude;
	}
	
	public void setLongitude(java.math.BigDecimal value) {
		this.longitude = value;
	}
	
	
	public java.math.BigDecimal getLatitude() {
		return this.latitude;
	}
	
	public void setLatitude(java.math.BigDecimal value) {
		this.latitude = value;
	}
	
	
	public Integer getStationHeadId() {
		return this.stationHeadId;
	}
	
	public void setStationHeadId(Integer value) {
		this.stationHeadId = value;
	}
	
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	
	public Integer getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(Integer value) {
		this.createUser = value;
	}
	
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	
	public Integer getUpdateUser() {
		return this.updateUser;
	}
	
	public void setUpdateUser(Integer value) {
		this.updateUser = value;
	}
	
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	
	
	public Integer getTheirCompanyId() {
		return this.theirCompanyId;
	}
	
	public void setTheirCompanyId(Integer value) {
		this.theirCompanyId = value;
	}
	
	
	public java.util.Date getScreateTime() {
		return this.screateTime;
	}
	
	public void setScreateTime(java.util.Date value) {
		this.screateTime = value;
	}
	
	
	public java.util.Date getSupdateTime() {
		return this.supdateTime;
	}
	
	public void setSupdateTime(java.util.Date value) {
		this.supdateTime = value;
	}
	
	
	public Integer getDelFlag() {
		return this.delFlag;
	}
	
	public void setDelFlag(Integer value) {
		this.delFlag = value;
	}
	

	

}

