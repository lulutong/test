
package com.ecej.esmart.model.ecejservice;

public class EsmartCityNightSchedulePo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartCityNightSchedule";
	

	//columns START
    /**
     * 城市夜间值班id       db_column: city_night_schedule_id   
     */ 	
	private Integer cityNightScheduleId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 服务站id       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 服务区域ID       db_column: service_area_id   
     */ 	
	private Integer serviceAreaId;
    /**
     * 值班日期       db_column: schedule_date   
     */ 	
	private java.util.Date scheduleDate;
    /**
     * 值班人员id       db_column: schedule_emp_id   
     */ 	
	private Integer scheduleEmpId;
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
     * 公司id       db_column: company_id   
     */ 	
	private Integer companyId;
	//columns END


	
	
	public Integer getCityNightScheduleId() {
		return this.cityNightScheduleId;
	}
	
	public void setCityNightScheduleId(Integer value) {
		this.cityNightScheduleId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	
	public Integer getServiceAreaId() {
		return this.serviceAreaId;
	}
	
	public void setServiceAreaId(Integer value) {
		this.serviceAreaId = value;
	}
	
	
	public java.util.Date getScheduleDate() {
		return this.scheduleDate;
	}
	
	public void setScheduleDate(java.util.Date value) {
		this.scheduleDate = value;
	}
	
	
	public Integer getScheduleEmpId() {
		return this.scheduleEmpId;
	}
	
	public void setScheduleEmpId(Integer value) {
		this.scheduleEmpId = value;
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
	
	
	public Integer getCompanyId() {
		return this.companyId;
	}
	
	public void setCompanyId(Integer value) {
		this.companyId = value;
	}
	

	

}

