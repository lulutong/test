
package com.ecej.esmart.model.ecejservice;

public class EsmartSnapshotTemplatePo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartSnapshotTemplate";
	

	//columns START
    /**
     * 派工数据快照模板id       db_column: snapshot_template_id   
     */ 	
	private Integer snapshotTemplateId;
    /**
     * 模板类型(1-推荐时间,2-时间列表,3-选择时间,4-放弃下单,5-多能工列表,6-创建,7-取消,8-完成,9-改约,10-改派,11-派工,12-任务池列表,13-领取任务,14-常规自动派工,15-应急派工,16-升级派工,17-持续派工,18-真实预警)       db_column: template_type   
     */ 	
	private Integer templateType;
    /**
     * 模板步骤       db_column: template_step   
     */ 	
	private Integer templateStep;
    /**
     * 模板内容       db_column: template_content   
     */ 	
	private String templateContent;
    /**
     * mongdb字段       db_column: mongdb_field   
     */ 	
	private String mongdbField;
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
	//columns END


	
	
	public Integer getSnapshotTemplateId() {
		return this.snapshotTemplateId;
	}
	
	public void setSnapshotTemplateId(Integer value) {
		this.snapshotTemplateId = value;
	}
	
	
	public Integer getTemplateType() {
		return this.templateType;
	}
	
	public void setTemplateType(Integer value) {
		this.templateType = value;
	}
	
	
	public Integer getTemplateStep() {
		return this.templateStep;
	}
	
	public void setTemplateStep(Integer value) {
		this.templateStep = value;
	}
	
	
	public String getTemplateContent() {
		return this.templateContent;
	}
	
	public void setTemplateContent(String value) {
		this.templateContent = value;
	}
	
	
	public String getMongdbField() {
		return this.mongdbField;
	}
	
	public void setMongdbField(String value) {
		this.mongdbField = value;
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
	

	

}

