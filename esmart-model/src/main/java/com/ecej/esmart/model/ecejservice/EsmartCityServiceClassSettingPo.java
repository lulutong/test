
package com.ecej.esmart.model.ecejservice;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class EsmartCityServiceClassSettingPo implements Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartCityServiceClassSetting";


	//columns START
    /**
     * 城市服务品类设置id       db_column: city_service_class_setting_id   
     */ 	
	private java.lang.Integer cityServiceClassSettingId;
    /**
     * 城市id       db_column: city_id
     */
	private java.lang.Integer cityId;
    /**
     * 服务品类id       db_column: service_class_id
     */
	private java.lang.Integer serviceClassId;
    /**
     * 延迟预约时间(天)       db_column: delay_time
     */
	private java.lang.Integer delayTime;
    /**
     * 启用状态（0-启用 1-禁用）       db_column: setting_status
     */
	private Integer settingStatus;
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
	private java.lang.Integer createUser;
    /**
     * 更新者       db_column: update_user
     */
	private java.lang.Integer updateUser;
    /**
     * 延迟预约时间(小时)       db_column: delay_hour_time
     */
	private java.lang.Integer delayHourTime;
    /**
     * 最晚预约时间点       db_column: last_appoinment_time
     */
	private java.util.Date lastAppoinmentTime;
    /**
     * 最早可预约时间       db_column: first_appoinment_time
     */
	private java.util.Date firstAppoinmentTime;
    /**
     * 改约时限（请求来源=1,10,11,12,13,17,21时生效）       db_column: retime_limit_time
     */
	private java.lang.Integer retimeLimitTime;
	/**
	 * 暂停服务开始时间       db_column: pause_service_begin_time
	 */
	private java.util.Date pauseServiceBeginTime;
	/**
	 * 暂停服务截止时间       db_column: pause_service_end_time
	 */
	private java.util.Date pauseServiceEndTime;

	//columns END


	public Date getPauseServiceBeginTime() {
		return pauseServiceBeginTime;
	}

	public void setPauseServiceBeginTime(Date pauseServiceBeginTime) {
		this.pauseServiceBeginTime = pauseServiceBeginTime;
	}

	public java.util.Date getPauseServiceEndTime() {
		return pauseServiceEndTime;
	}

	public void setPauseServiceEndTime(java.util.Date pauseServiceEndTime) {
		this.pauseServiceEndTime = pauseServiceEndTime;
	}

	public java.lang.Integer getCityServiceClassSettingId() {
		return this.cityServiceClassSettingId;
	}

	public void setCityServiceClassSettingId(java.lang.Integer value) {
		this.cityServiceClassSettingId = value;
	}


	public java.lang.Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(java.lang.Integer value) {
		this.cityId = value;
	}


	public java.lang.Integer getServiceClassId() {
		return this.serviceClassId;
	}

	public void setServiceClassId(java.lang.Integer value) {
		this.serviceClassId = value;
	}


	public java.lang.Integer getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(java.lang.Integer value) {
		this.delayTime = value;
	}


	public Integer getSettingStatus() {
		return this.settingStatus;
	}

	public void setSettingStatus(Integer value) {
		this.settingStatus = value;
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


	public java.lang.Integer getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(java.lang.Integer value) {
		this.createUser = value;
	}


	public java.lang.Integer getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(java.lang.Integer value) {
		this.updateUser = value;
	}


	public java.lang.Integer getDelayHourTime() {
		return this.delayHourTime;
	}

	public void setDelayHourTime(java.lang.Integer value) {
		this.delayHourTime = value;
	}
	
	
	public java.util.Date getLastAppoinmentTime() {
		return this.lastAppoinmentTime;
	}
	
	public void setLastAppoinmentTime(java.util.Date value) {
		this.lastAppoinmentTime = value;
	}
	
	
	public java.util.Date getFirstAppoinmentTime() {
		return this.firstAppoinmentTime;
	}
	
	public void setFirstAppoinmentTime(java.util.Date value) {
		this.firstAppoinmentTime = value;
	}
	

	public java.lang.Integer getRetimeLimitTime() {
		return this.retimeLimitTime;
	}

	public void setRetimeLimitTime(java.lang.Integer value) {
		this.retimeLimitTime = value;
	}


	public static void main(String[] args) {
		System.out.println(LocalDate.now().plusDays(1));
	}

}

