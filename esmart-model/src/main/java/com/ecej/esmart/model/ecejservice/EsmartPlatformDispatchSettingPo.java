
package com.ecej.esmart.model.ecejservice;

public class EsmartPlatformDispatchSettingPo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartPlatformDispatchSetting";
	

	//columns START
    /**
     * 平台派工设置id       db_column: platform_dispatch_setting_id   
     */ 	
	private Integer platformDispatchSettingId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 抢单模式-繁忙师傅广播通知开关(0-允许，1-禁止)       db_column: message_notice_flag   
     */ 	
	private Integer messageNoticeFlag;
    /**
     * 消息通知开始时间       db_column: notice_start_time   
     */ 	
	private java.util.Date noticeStartTime;
    /**
     * 消息通知截止时间       db_column: notice_end_time   
     */ 	
	private java.util.Date noticeEndTime;
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


	
	
	public Integer getPlatformDispatchSettingId() {
		return this.platformDispatchSettingId;
	}
	
	public void setPlatformDispatchSettingId(Integer value) {
		this.platformDispatchSettingId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getMessageNoticeFlag() {
		return this.messageNoticeFlag;
	}
	
	public void setMessageNoticeFlag(Integer value) {
		this.messageNoticeFlag = value;
	}
	
	
	public java.util.Date getNoticeStartTime() {
		return this.noticeStartTime;
	}
	
	public void setNoticeStartTime(java.util.Date value) {
		this.noticeStartTime = value;
	}
	
	
	public java.util.Date getNoticeEndTime() {
		return this.noticeEndTime;
	}
	
	public void setNoticeEndTime(java.util.Date value) {
		this.noticeEndTime = value;
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

