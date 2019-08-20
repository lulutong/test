
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcCityPo extends BasePo{
	//alias
	public static final String TABLE_ALIAS = "SvcCity";
	

	//columns START
    /**
     * 城市编号       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 城市拼音       db_column: city_pinyin   
     */ 	
	private String cityPinyin;
    /**
     * 城市编码       db_column: city_code_no   
     */ 	
	private String cityCodeNo;
    /**
     * 城市名称       db_column: city_name   
     */ 	
	private String cityName;
    /**
     * 经度       db_column: longitude   
     */ 	
	private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude   
     */ 	
	private java.math.BigDecimal latitude;
    /**
     * 状态(0-启用 1-禁用 2-删除)       db_column: status   
     */ 	
	private Integer status;
    /**
     * 服务热线       db_column: hotline   
     */ 	
	private String hotline;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 创建日期       db_column: create_time   
     */ 	
	private java.util.Date createTime;
    /**
     * 更新人       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 更新时间       db_column: update_time   
     */ 	
	private java.util.Date updateTime;
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


	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public String getCityPinyin() {
		return this.cityPinyin;
	}
	
	public void setCityPinyin(String value) {
		this.cityPinyin = value;
	}
	
	
	public String getCityCodeNo() {
		return this.cityCodeNo;
	}
	
	public void setCityCodeNo(String value) {
		this.cityCodeNo = value;
	}
	
	
	public String getCityName() {
		return this.cityName;
	}
	
	public void setCityName(String value) {
		this.cityName = value;
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
	
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	
	public String getHotline() {
		return this.hotline;
	}
	
	public void setHotline(String value) {
		this.hotline = value;
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

