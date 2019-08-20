
package com.ecej.esmart.model.ecejservice;

import java.io.Serializable;

public class SvcBusinessClassPo implements Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SvcBusinessClass";
	

	//columns START
    /**
     * 业务类别id       db_column: business_class_id   
     */ 	
	private Integer businessClassId;
    /**
     * 业务类别名称       db_column: business_class_name   
     */ 	
	private String businessClassName;
    /**
     * 业务key(APP区分业务按钮标识)       db_column: business_key   
     */ 	
	private String businessKey;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 创建时间       db_column: create_time   
     */ 	
	private java.util.Date createTime;
    /**
     * 更新人       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 更新时间       db_column: update_time   
     */ 	
	private java.util.Date updateTime;
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


	
	
	public Integer getBusinessClassId() {
		return this.businessClassId;
	}
	
	public void setBusinessClassId(Integer value) {
		this.businessClassId = value;
	}
	
	
	public String getBusinessClassName() {
		return this.businessClassName;
	}
	
	public void setBusinessClassName(String value) {
		this.businessClassName = value;
	}
	
	
	public String getBusinessKey() {
		return this.businessKey;
	}
	
	public void setBusinessKey(String value) {
		this.businessKey = value;
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

