
package com.ecej.esmart.model.ecejservice;

public class SvcClassLabelRelationPo implements java.io.Serializable  {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SvcClassLabelRelation";
	

	//columns START
    /**
     * 服务品类关联标签id       db_column: class_label_relation_id   
     */ 	
	private Integer classLabelRelationId;
    /**
     * 服务品类id       db_column: service_class_id   
     */ 	
	private Integer serviceClassId;
    /**
     * 技能标签id       db_column: skill_label_id   
     */ 	
	private Integer skillLabelId;
    /**
     * 服务大类id       db_column: big_class_id   
     */ 	
	private Integer bigClassId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 基准量       db_column: standard_count   
     */ 	
	private Integer standardCount;
    /**
     * 状态（0-禁用 1-启用       db_column: del_flag   
     */ 	
	private Integer delFlag;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 更新人       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 创建时间       db_column: create_time   
     */ 	
	private java.util.Date createTime;
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
	//columns END


	
	
	public Integer getClassLabelRelationId() {
		return this.classLabelRelationId;
	}
	
	public void setClassLabelRelationId(Integer value) {
		this.classLabelRelationId = value;
	}
	
	
	public Integer getServiceClassId() {
		return this.serviceClassId;
	}
	
	public void setServiceClassId(Integer value) {
		this.serviceClassId = value;
	}
	
	
	public Integer getSkillLabelId() {
		return this.skillLabelId;
	}
	
	public void setSkillLabelId(Integer value) {
		this.skillLabelId = value;
	}
	
	
	public Integer getBigClassId() {
		return this.bigClassId;
	}
	
	public void setBigClassId(Integer value) {
		this.bigClassId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getStandardCount() {
		return this.standardCount;
	}
	
	public void setStandardCount(Integer value) {
		this.standardCount = value;
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
	
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
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
	

	

}

