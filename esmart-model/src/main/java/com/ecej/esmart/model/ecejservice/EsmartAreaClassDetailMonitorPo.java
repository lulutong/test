
package com.ecej.esmart.model.ecejservice;

public class EsmartAreaClassDetailMonitorPo  implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartAreaClassDetailMonitor";
	

	//columns START
    /**
     * area_class_detail_monitor_id       db_column: class_detail_monitor_id   
     */ 	
	private Integer classDetailMonitorId;
    /**
     * 统计日期       db_column: statistic_date   
     */ 	
	private java.util.Date statisticDate;
    /**
     * 服务区域ID       db_column: service_area_id   
     */ 	
	private Integer serviceAreaId;
    /**
     * 缺失品类ID       db_column: missing_class_id   
     */ 	
	private Integer missingClassId;
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


	
	
	public Integer getClassDetailMonitorId() {
		return this.classDetailMonitorId;
	}
	
	public void setClassDetailMonitorId(Integer value) {
		this.classDetailMonitorId = value;
	}
	
	
	public java.util.Date getStatisticDate() {
		return this.statisticDate;
	}
	
	public void setStatisticDate(java.util.Date value) {
		this.statisticDate = value;
	}
	
	
	public Integer getServiceAreaId() {
		return this.serviceAreaId;
	}
	
	public void setServiceAreaId(Integer value) {
		this.serviceAreaId = value;
	}
	
	
	public Integer getMissingClassId() {
		return this.missingClassId;
	}
	
	public void setMissingClassId(Integer value) {
		this.missingClassId = value;
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

