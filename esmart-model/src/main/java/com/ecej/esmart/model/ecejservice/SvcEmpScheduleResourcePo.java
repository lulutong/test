
package com.ecej.esmart.model.ecejservice;

public class SvcEmpScheduleResourcePo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SvcEmpScheduleResource";
	

	//columns START
    /**
     * 排班ID       db_column: resource_id   
     */ 	
	private Integer resourceId;
    /**
     * 班次ID       db_column: shift_define_id   
     */ 	
	private Integer shiftDefineId;
    /**
     * 员工ID       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 班次类型（0-专项排班 1-常规排班）       db_column: shift_type   
     */ 	
	private Integer shiftType;
    /**
     * 排班记录日期       db_column: schedule_date   
     */ 	
	private java.util.Date scheduleDate;
    /**
     * 是否跨天       db_column: is_same_day   
     */ 	
	private Integer isSameDay;
    /**
     * 开始时间       db_column: begin_time   
     */ 	
	private java.util.Date beginTime;
    /**
     * 结束时间       db_column: end_time   
     */ 	
	private java.util.Date endTime;
    /**
     * 日程档期(000000111101001101010) 0-可用     1-已用       2-预占       db_column: agenda_schedule   
     */ 	
	private String agendaSchedule;
    /**
     * 刻度(例：一刻度=10分钟)       db_column: scale_value   
     */ 	
	private Integer scaleValue;
    /**
     * 状态（0-不可派 1-可派）       db_column: schedule_status   
     */ 	
	private Integer scheduleStatus;
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
     * 是否排班人员       db_column: shift_flag   
     */ 	
	private Boolean shiftFlag;
    /**
     * 下班时间       db_column: off_duty_time   
     */ 	
	private java.util.Date offDutyTime;
    /**
     * 备注       db_column: remark   
     */ 	
	private String remark;
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


	
	
	public Integer getResourceId() {
		return this.resourceId;
	}
	
	public void setResourceId(Integer value) {
		this.resourceId = value;
	}
	
	
	public Integer getShiftDefineId() {
		return this.shiftDefineId;
	}
	
	public void setShiftDefineId(Integer value) {
		this.shiftDefineId = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getShiftType() {
		return this.shiftType;
	}
	
	public void setShiftType(Integer value) {
		this.shiftType = value;
	}
	
	
	public java.util.Date getScheduleDate() {
		return this.scheduleDate;
	}
	
	public void setScheduleDate(java.util.Date value) {
		this.scheduleDate = value;
	}
	
	
	public Integer getIsSameDay() {
		return this.isSameDay;
	}
	
	public void setIsSameDay(Integer value) {
		this.isSameDay = value;
	}
	
	
	public java.util.Date getBeginTime() {
		return this.beginTime;
	}
	
	public void setBeginTime(java.util.Date value) {
		this.beginTime = value;
	}
	
	
	public java.util.Date getEndTime() {
		return this.endTime;
	}
	
	public void setEndTime(java.util.Date value) {
		this.endTime = value;
	}
	
	
	public String getAgendaSchedule() {
		return this.agendaSchedule;
	}
	
	public void setAgendaSchedule(String value) {
		this.agendaSchedule = value;
	}
	
	
	public Integer getScaleValue() {
		return this.scaleValue;
	}
	
	public void setScaleValue(Integer value) {
		this.scaleValue = value;
	}
	
	
	public Integer getScheduleStatus() {
		return this.scheduleStatus;
	}
	
	public void setScheduleStatus(Integer value) {
		this.scheduleStatus = value;
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
	
	
	public Boolean getShiftFlag() {
		return this.shiftFlag;
	}
	
	public void setShiftFlag(Boolean value) {
		this.shiftFlag = value;
	}
	
	
	public java.util.Date getOffDutyTime() {
		return this.offDutyTime;
	}
	
	public void setOffDutyTime(java.util.Date value) {
		this.offDutyTime = value;
	}
	
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
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

