
package com.ecej.esmart.model.ecejservice;


public class EsmartAreaClassMonitorPo  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartAreaClassMonitor";
	

	//columns START
    /**
     * 区域品类覆盖监控ID       db_column: class_monitor_id   
     */ 	
	private Integer classMonitorId;
    /**
     * 统计日期       db_column: statistic_date   
     */ 	
	private java.util.Date statisticDate;
    /**
     * 城市ID       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 服务区域ID       db_column: service_area_id   
     */ 	
	private Integer serviceAreaId;
    /**
     * 排班人数       db_column: schedule_persion_count   
     */ 	
	private Integer schedulePersionCount;
    /**
     * 承接品类数量       db_column: carry_on_class_count   
     */ 	
	private Integer carryOnClassCount;
    /**
     * 可服务品类数量       db_column: service_class_count   
     */ 	
	private Integer serviceClassCount;
    /**
     * 缺失品类数量       db_column: missing_class_count   
     */ 	
	private Integer missingClassCount;
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
	//columns END


	
	
	public Integer getClassMonitorId() {
		return this.classMonitorId;
	}
	
	public void setClassMonitorId(Integer value) {
		this.classMonitorId = value;
	}
	
	
	public java.util.Date getStatisticDate() {
		return this.statisticDate;
	}
	
	public void setStatisticDate(java.util.Date value) {
		this.statisticDate = value;
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
	
	
	public Integer getServiceAreaId() {
		return this.serviceAreaId;
	}
	
	public void setServiceAreaId(Integer value) {
		this.serviceAreaId = value;
	}
	
	
	public Integer getSchedulePersionCount() {
		return this.schedulePersionCount;
	}
	
	public void setSchedulePersionCount(Integer value) {
		this.schedulePersionCount = value;
	}
	
	
	public Integer getCarryOnClassCount() {
		return this.carryOnClassCount;
	}
	
	public void setCarryOnClassCount(Integer value) {
		this.carryOnClassCount = value;
	}
	
	
	public Integer getServiceClassCount() {
		return this.serviceClassCount;
	}
	
	public void setServiceClassCount(Integer value) {
		this.serviceClassCount = value;
	}
	
	
	public Integer getMissingClassCount() {
		return this.missingClassCount;
	}
	
	public void setMissingClassCount(Integer value) {
		this.missingClassCount = value;
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
	

	

}

