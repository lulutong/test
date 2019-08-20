
package com.ecej.esmart.model.ecejservice;

public class EsmartEmpLocSettingPo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartEmpLocSetting";
	

	//columns START
    /**
     * 员工接单位置ID       db_column: emp_loc_setting_id   
     */ 	
	private Integer empLocSettingId;
    /**
     * 员工ID       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 员工起始位置经度       db_column: begin_loc_long   
     */ 	
	private java.math.BigDecimal beginLocLong;
    /**
     * 员工起始位置纬度       db_column: begin_loc_lat   
     */ 	
	private java.math.BigDecimal beginLocLat;
    /**
     * 员工截止位置经度       db_column: end_loc_long   
     */ 	
	private java.math.BigDecimal endLocLong;
    /**
     * 员工截止位置纬度       db_column: end_loc_lat   
     */ 	
	private java.math.BigDecimal endLocLat;
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
     * 开始位置地址       db_column: begin_loc_detail   
     */ 	
	private String beginLocDetail;
    /**
     * 截止位置地址       db_column: end_loc_detail   
     */ 	
	private String endLocDetail;
	//columns END


	
	
	public Integer getEmpLocSettingId() {
		return this.empLocSettingId;
	}
	
	public void setEmpLocSettingId(Integer value) {
		this.empLocSettingId = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public java.math.BigDecimal getBeginLocLong() {
		return this.beginLocLong;
	}
	
	public void setBeginLocLong(java.math.BigDecimal value) {
		this.beginLocLong = value;
	}
	
	
	public java.math.BigDecimal getBeginLocLat() {
		return this.beginLocLat;
	}
	
	public void setBeginLocLat(java.math.BigDecimal value) {
		this.beginLocLat = value;
	}
	
	
	public java.math.BigDecimal getEndLocLong() {
		return this.endLocLong;
	}
	
	public void setEndLocLong(java.math.BigDecimal value) {
		this.endLocLong = value;
	}
	
	
	public java.math.BigDecimal getEndLocLat() {
		return this.endLocLat;
	}
	
	public void setEndLocLat(java.math.BigDecimal value) {
		this.endLocLat = value;
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
	
	
	public String getBeginLocDetail() {
		return this.beginLocDetail;
	}
	
	public void setBeginLocDetail(String value) {
		this.beginLocDetail = value;
	}
	
	
	public String getEndLocDetail() {
		return this.endLocDetail;
	}
	
	public void setEndLocDetail(String value) {
		this.endLocDetail = value;
	}
	

	

}

