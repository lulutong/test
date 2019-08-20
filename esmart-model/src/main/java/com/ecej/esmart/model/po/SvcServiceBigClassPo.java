
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcServiceBigClassPo extends BasePo {
	//alias
	public static final String TABLE_ALIAS = "SvcServiceBigClass";
	

	//columns START
    /**
     * 服务大类id       db_column: big_class_id   
     */ 	
	private Integer bigClassId;
    /**
     * 业务类别id       db_column: business_class_id   
     */ 	
	private Integer businessClassId;
    /**
     * 服务大类名称       db_column: big_class_name   
     */ 	
	private String bigClassName;
    /**
     * APP区分服务大类按钮标识       db_column: service_key   
     */ 	
	private String serviceKey;
    /**
     * 基础数据版本(1-旧版本，2-新版本)       db_column: base_data_version   
     */ 	
	private Integer baseDataVersion;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 创建日期       db_column: create_time   
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
     * 禁用flag       db_column: off_flag   
     */ 	
	private Integer offFlag;
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


	
	
	public Integer getBigClassId() {
		return this.bigClassId;
	}
	
	public void setBigClassId(Integer value) {
		this.bigClassId = value;
	}
	
	
	public Integer getBusinessClassId() {
		return this.businessClassId;
	}
	
	public void setBusinessClassId(Integer value) {
		this.businessClassId = value;
	}
	
	
	public String getBigClassName() {
		return this.bigClassName;
	}
	
	public void setBigClassName(String value) {
		this.bigClassName = value;
	}
	
	
	public String getServiceKey() {
		return this.serviceKey;
	}
	
	public void setServiceKey(String value) {
		this.serviceKey = value;
	}
	
	
	public Integer getBaseDataVersion() {
		return this.baseDataVersion;
	}
	
	public void setBaseDataVersion(Integer value) {
		this.baseDataVersion = value;
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
	
	
	public Integer getOffFlag() {
		return this.offFlag;
	}
	
	public void setOffFlag(Integer value) {
		this.offFlag = value;
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

