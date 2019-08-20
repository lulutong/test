
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcServiceClassPo extends BasePo {
	//alias
	public static final String TABLE_ALIAS = "SvcServiceClass";
	

	//columns START
    /**
     * 服务品类id       db_column: service_class_id   
     */ 	
	private Integer serviceClassId;
    /**
     * 服务大类id       db_column: service_big_class_id   
     */ 	
	private Integer serviceBigClassId;
    /**
     * 设备id       db_column: device_id   
     */ 	
	private Integer deviceId;
    /**
     * 服务品类名称       db_column: service_class_name   
     */ 	
	private String serviceClassName;
    /**
     * 品类别名       db_column: service_class_alias   
     */ 	
	private String serviceClassAlias;
    /**
     * 品类耗时       db_column: service_class_consume   
     */ 	
	private Integer serviceClassConsume;
    /**
     * 品类耗时上限       db_column: consume_up_limit   
     */ 	
	private Integer consumeUpLimit;
    /**
     * 品类耗时下限       db_column: consume_down_limit   
     */ 	
	private Integer consumeDownLimit;
    /**
     * 品类收费上限       db_column: fee_up_limit   
     */ 	
	private java.math.BigDecimal feeUpLimit;
    /**
     * 品类收费下限       db_column: fee_down_limit   
     */ 	
	private Integer feeDownLimit;
    /**
     * 基础数据版本(1-旧版本，2-新版本)       db_column: base_data_version   
     */ 	
	private Integer baseDataVersion;
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
    /**
     * 顺序       db_column: in_turn   
     */ 	
	private Integer inTurn;
	//columns END


	
	
	public Integer getServiceClassId() {
		return this.serviceClassId;
	}
	
	public void setServiceClassId(Integer value) {
		this.serviceClassId = value;
	}
	
	
	public Integer getServiceBigClassId() {
		return this.serviceBigClassId;
	}
	
	public void setServiceBigClassId(Integer value) {
		this.serviceBigClassId = value;
	}
	
	
	public Integer getDeviceId() {
		return this.deviceId;
	}
	
	public void setDeviceId(Integer value) {
		this.deviceId = value;
	}
	
	
	public String getServiceClassName() {
		return this.serviceClassName;
	}
	
	public void setServiceClassName(String value) {
		this.serviceClassName = value;
	}
	
	
	public String getServiceClassAlias() {
		return this.serviceClassAlias;
	}
	
	public void setServiceClassAlias(String value) {
		this.serviceClassAlias = value;
	}
	
	
	public Integer getServiceClassConsume() {
		return this.serviceClassConsume;
	}
	
	public void setServiceClassConsume(Integer value) {
		this.serviceClassConsume = value;
	}
	
	
	public Integer getConsumeUpLimit() {
		return this.consumeUpLimit;
	}
	
	public void setConsumeUpLimit(Integer value) {
		this.consumeUpLimit = value;
	}
	
	
	public Integer getConsumeDownLimit() {
		return this.consumeDownLimit;
	}
	
	public void setConsumeDownLimit(Integer value) {
		this.consumeDownLimit = value;
	}
	
	
	public java.math.BigDecimal getFeeUpLimit() {
		return this.feeUpLimit;
	}
	
	public void setFeeUpLimit(java.math.BigDecimal value) {
		this.feeUpLimit = value;
	}
	
	
	public Integer getFeeDownLimit() {
		return this.feeDownLimit;
	}
	
	public void setFeeDownLimit(Integer value) {
		this.feeDownLimit = value;
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
	
	
	public Integer getInTurn() {
		return this.inTurn;
	}
	
	public void setInTurn(Integer value) {
		this.inTurn = value;
	}
	

	

}

