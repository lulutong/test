
package com.ecej.esmart.model.ecejservice;

public class EsmartScheduleMonitorPo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartScheduleMonitor";
	

	//columns START
    /**
     * 可用资源ID       db_column: schedule_monitor_id   
     */ 	
	private Integer scheduleMonitorId;
    /**
     * 城市ID       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 服务站ID       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 统计日期       db_column: generate_time   
     */ 	
	private java.util.Date generateTime;
    /**
     * 师傅总人数（启用状态）       db_column: emp_count   
     */ 	
	private Integer empCount;
    /**
     * 排班人数       db_column: schedule_count   
     */ 	
	private Integer scheduleCount;
    /**
     * 常规排班人数       db_column: routine_count   
     */ 	
	private Integer routineCount;
    /**
     * 专项排班人数       db_column: special_count   
     */ 	
	private Integer specialCount;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 修改人       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 1:删除 0:未删除       db_column: del_flag   
     */ 	
	private Integer delFlag;
    /**
     * 数据创建时间       db_column: screate_time   
     */ 	
	private java.util.Date screateTime;
    /**
     * 数据更新时间       db_column: supdate_time   
     */ 	
	private java.util.Date supdateTime;
    /**
     * 员工ID       db_column: emp_id   
     */ 	
	private Integer empId;
	//columns END


	
	
	public Integer getScheduleMonitorId() {
		return this.scheduleMonitorId;
	}
	
	public void setScheduleMonitorId(Integer value) {
		this.scheduleMonitorId = value;
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
	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	
	public java.util.Date getGenerateTime() {
		return this.generateTime;
	}
	
	public void setGenerateTime(java.util.Date value) {
		this.generateTime = value;
	}
	
	
	public Integer getEmpCount() {
		return this.empCount;
	}
	
	public void setEmpCount(Integer value) {
		this.empCount = value;
	}
	
	
	public Integer getScheduleCount() {
		return this.scheduleCount;
	}
	
	public void setScheduleCount(Integer value) {
		this.scheduleCount = value;
	}
	
	
	public Integer getRoutineCount() {
		return this.routineCount;
	}
	
	public void setRoutineCount(Integer value) {
		this.routineCount = value;
	}
	
	
	public Integer getSpecialCount() {
		return this.specialCount;
	}
	
	public void setSpecialCount(Integer value) {
		this.specialCount = value;
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
	
	
	public Integer getDelFlag() {
		return this.delFlag;
	}
	
	public void setDelFlag(Integer value) {
		this.delFlag = value;
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
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	

	

}

