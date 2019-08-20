
package com.ecej.esmart.model.ecejservice;


public class EsmartCompanyServiceClassSettingPo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartCompanyServiceClassSetting";
	

	//columns START
    /**
     * 新增企业服务品类设置ID       db_column: company_service_class_setting_id   
     */ 	
	private Integer companyServiceClassSettingId;
    /**
     * 城市ID       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 服务品类ID       db_column: service_class_id   
     */ 	
	private Integer serviceClassId;
    /**
     * 紧急服务品类开关（0-禁用 1-启用）       db_column: urgent_service_class_flag   
     */ 	
	private Integer urgentServiceClassFlag;
    /**
     * 起约时间(小时)       db_column: delay_time   
     */ 	
	private Integer delayTime;
    /**
     * 可约天数       db_column: appointment_day   
     */ 	
	private Integer appointmentDay;
    /**
     * 夜间是否可接单（1-禁止接单 2-允许接单）       db_column: night_flag   
     */ 	
	private Integer nightFlag;
    /**
     * 升级标识（1-禁止升级 2-允许升级）       db_column: upgrade_flag   
     */ 	
	private Integer upgradeFlag;
    /**
     * 服务耗时       db_column: service_elapsed_time   
     */ 	
	private Integer serviceElapsedTime;
    /**
     * 服务品类颜色       db_column: rgb_name   
     */ 	
	private String rgbName;
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


	
	
	public Integer getCompanyServiceClassSettingId() {
		return this.companyServiceClassSettingId;
	}
	
	public void setCompanyServiceClassSettingId(Integer value) {
		this.companyServiceClassSettingId = value;
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
	
	
	public Integer getServiceClassId() {
		return this.serviceClassId;
	}
	
	public void setServiceClassId(Integer value) {
		this.serviceClassId = value;
	}
	
	
	public Integer getUrgentServiceClassFlag() {
		return this.urgentServiceClassFlag;
	}
	
	public void setUrgentServiceClassFlag(Integer value) {
		this.urgentServiceClassFlag = value;
	}
	
	
	public Integer getDelayTime() {
		return this.delayTime;
	}
	
	public void setDelayTime(Integer value) {
		this.delayTime = value;
	}
	
	
	public Integer getAppointmentDay() {
		return this.appointmentDay;
	}
	
	public void setAppointmentDay(Integer value) {
		this.appointmentDay = value;
	}
	
	
	public Integer getNightFlag() {
		return this.nightFlag;
	}
	
	public void setNightFlag(Integer value) {
		this.nightFlag = value;
	}
	
	
	public Integer getUpgradeFlag() {
		return this.upgradeFlag;
	}
	
	public void setUpgradeFlag(Integer value) {
		this.upgradeFlag = value;
	}
	
	
	public Integer getServiceElapsedTime() {
		return this.serviceElapsedTime;
	}
	
	public void setServiceElapsedTime(Integer value) {
		this.serviceElapsedTime = value;
	}
	
	
	public String getRgbName() {
		return this.rgbName;
	}
	
	public void setRgbName(String value) {
		this.rgbName = value;
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

