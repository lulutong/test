
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcCityServiceClassRelPo extends BasePo {
	//alias
	public static final String TABLE_ALIAS = "SvcCityServiceClassRel";
	

	//columns START
    /**
     * 服务品类id       db_column: city_service_class_rel_id   
     */ 	
	private Integer cityServiceClassRelId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 业务类别id       db_column: business_class_id   
     */ 	
	private Integer businessClassId;
    /**
     * 服务大类id       db_column: big_class_id   
     */ 	
	private Integer bigClassId;
    /**
     * 服务品类id       db_column: service_class_id   
     */ 	
	private Integer serviceClassId;
    /**
     * 设备id       db_column: device_id   
     */ 	
	private Integer deviceId;
    /**
     * 服务耗时       db_column: service_elapsed_time   
     */ 	
	private Integer serviceElapsedTime;
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
	private java.math.BigDecimal feeDownLimit;
    /**
     * 顺序       db_column: in_turn   
     */ 	
	private Integer inTurn;
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
     * 下线flag       db_column: user_off_flag   
     */ 	
	private Integer userOffFlag;
    /**
     * 下线flag       db_column: emp_off_flag   
     */ 	
	private Integer empOffFlag;
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


	
	
	public Integer getCityServiceClassRelId() {
		return this.cityServiceClassRelId;
	}
	
	public void setCityServiceClassRelId(Integer value) {
		this.cityServiceClassRelId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getBusinessClassId() {
		return this.businessClassId;
	}
	
	public void setBusinessClassId(Integer value) {
		this.businessClassId = value;
	}
	
	
	public Integer getBigClassId() {
		return this.bigClassId;
	}
	
	public void setBigClassId(Integer value) {
		this.bigClassId = value;
	}
	
	
	public Integer getServiceClassId() {
		return this.serviceClassId;
	}
	
	public void setServiceClassId(Integer value) {
		this.serviceClassId = value;
	}
	
	
	public Integer getDeviceId() {
		return this.deviceId;
	}
	
	public void setDeviceId(Integer value) {
		this.deviceId = value;
	}
	
	
	public Integer getServiceElapsedTime() {
		return this.serviceElapsedTime;
	}
	
	public void setServiceElapsedTime(Integer value) {
		this.serviceElapsedTime = value;
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
	
	
	public java.math.BigDecimal getFeeDownLimit() {
		return this.feeDownLimit;
	}
	
	public void setFeeDownLimit(java.math.BigDecimal value) {
		this.feeDownLimit = value;
	}
	
	
	public Integer getInTurn() {
		return this.inTurn;
	}
	
	public void setInTurn(Integer value) {
		this.inTurn = value;
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
	
	
	public Integer getUserOffFlag() {
		return this.userOffFlag;
	}
	
	public void setUserOffFlag(Integer value) {
		this.userOffFlag = value;
	}
	
	
	public Integer getEmpOffFlag() {
		return this.empOffFlag;
	}
	
	public void setEmpOffFlag(Integer value) {
		this.empOffFlag = value;
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

