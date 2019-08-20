
package com.ecej.esmart.model.ecejservice;


public class EsmartCompanyAppointmentTimeSettingPo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartCompanyAppointmentTimeSetting";
	

	//columns START
    /**
     * 企业预约时间设置ID       db_column: company_appointment_time_setting_id   
     */ 	
	private Integer companyAppointmentTimeSettingId;
    /**
     * 城市ID       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 时间类型(1-上午，2-下午，3-晚上)       db_column: time_type   
     */ 	
	private Integer timeType;
    /**
     * 开始时间       db_column: begin_time   
     */ 	
	private String beginTime;
    /**
     * 结束时间       db_column: end_time   
     */ 	
	private String endTime;
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
    /**
     * 创建者       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 更新者       db_column: update_user   
     */ 	
	private Integer updateUser;
	//columns END


	
	
	public Integer getCompanyAppointmentTimeSettingId() {
		return this.companyAppointmentTimeSettingId;
	}
	
	public void setCompanyAppointmentTimeSettingId(Integer value) {
		this.companyAppointmentTimeSettingId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getCompanyId() {
		return this.companyId;
	}
	
	public void setCompanyId(Integer value) {
		this.companyId = value;
	}
	
	
	public Integer getTimeType() {
		return this.timeType;
	}
	
	public void setTimeType(Integer value) {
		this.timeType = value;
	}
	
	
	public String getBeginTime() {
		return this.beginTime;
	}
	
	public void setBeginTime(String value) {
		this.beginTime = value;
	}
	
	
	public String getEndTime() {
		return this.endTime;
	}
	
	public void setEndTime(String value) {
		this.endTime = value;
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
	
	
	public Integer getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(Integer value) {
		this.createUser = value;
	}
	
	
	public Integer getUpdateUser() {
		return this.updateUser;
	}
	
	public void setUpdateUser(Integer value) {
		this.updateUser = value;
	}
	

	

}

