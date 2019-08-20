
package com.ecej.esmart.model.ecejservice;
import java.io.Serializable;

public class EsmartPlatformServiceClassSettingPo implements Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartPlatformServiceClassSetting";
	

	//columns START
    /**
     * 平台服务品类设置id       db_column: platform_service_class_setting_id   
     */ 	
	private Integer platformServiceClassSettingId;
    /**
     * 服务品类id       db_column: service_class_id
     */
	private Integer serviceClassId;
    /**
     * 是否允许夜间预约(0-允许，1-禁止)       db_column: night_model_appointment
     */
	private Integer nightModelAppointment;
    /**
     * 是否紧急服务品类(0-紧急，1-非紧急)       db_column: urgent_flag
     */
	private Integer urgentFlag;
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
	private Integer createUser;
    /**
     * 更新者       db_column: update_user
     */
	private Integer updateUser;
    /**
     * 延迟预约时间(小时)       db_column: delay_time
     */
	private Integer delayTime;
	//columns END




	public Integer getPlatformServiceClassSettingId() {
		return this.platformServiceClassSettingId;
	}

	public void setPlatformServiceClassSettingId(Integer value) {
		this.platformServiceClassSettingId = value;
	}


	public Integer getServiceClassId() {
		return this.serviceClassId;
	}

	public void setServiceClassId(Integer value) {
		this.serviceClassId = value;
	}


	public Integer getNightModelAppointment() {
		return this.nightModelAppointment;
	}

	public void setNightModelAppointment(Integer value) {
		this.nightModelAppointment = value;
	}


	public Integer getUrgentFlag() {
		return this.urgentFlag;
	}

	public void setUrgentFlag(Integer value) {
		this.urgentFlag = value;
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


	public Integer getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(Integer value) {
		this.delayTime = value;
	}
	

	

}

