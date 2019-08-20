
package com.ecej.esmart.model.ecejservice;

public class EsmartCompanyBaseSettingPo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartCompanyBaseSetting";
	

	//columns START
    /**
     * 企业派工设置ID       db_column: company_base_setting_id   
     */ 	
	private Integer companyBaseSettingId;
    /**
     * 城市ID       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 预约单收单开始时间       db_column: receipt_begin_time   
     */ 	
	private String receiptBeginTime;
    /**
     * 预约单收单截止时间       db_column: receipt_end_time   
     */ 	
	private String receiptEndTime;
    /**
     * 派单推荐方案运算时间       db_column: run_time   
     */ 	
	private String runTime;
    /**
     * 员工选单状态(1-禁止，2-允许)       db_column: choice_order_flag   
     */ 	
	private Integer choiceOrderFlag;
    /**
     * 员工选单开始时间       db_column: choice_order_begin_time   
     */ 	
	private String choiceOrderBeginTime;
    /**
     * 员工选单截止时间       db_column: choice_order_end_time   
     */ 	
	private String choiceOrderEndTime;
    /**
     * 差评回避策略(1-禁用，2-启用)       db_column: negative_evaluate_flag   
     */ 	
	private Integer negativeEvaluateFlag;
    /**
     * 区域轮班月度均衡策略(1-禁用，2-启用)       db_column: area_month_equilibrium_flag   
     */ 	
	private Integer areaMonthEquilibriumFlag;
    /**
     * 员工承接公司业务全品类，不分技能(1-禁用，2-启用)       db_column: all_service_class_flag   
     */ 	
	private Integer allServiceClassFlag;
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
     * 派工版本(1-动态派工，5-统筹派工)       db_column: dispatch_version   
     */ 	
	private Integer dispatchVersion;
    /**
     * 夜间下单开始时间       db_column: night_begin_time   
     */ 	
	private String nightBeginTime;
    /**
     * 夜间下单截止时间       db_column: night_end_time   
     */ 	
	private String nightEndTime;
	//columns END


	
	
	public Integer getCompanyBaseSettingId() {
		return this.companyBaseSettingId;
	}
	
	public void setCompanyBaseSettingId(Integer value) {
		this.companyBaseSettingId = value;
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
	
	
	public String getReceiptBeginTime() {
		return this.receiptBeginTime;
	}
	
	public void setReceiptBeginTime(String value) {
		this.receiptBeginTime = value;
	}
	
	
	public String getReceiptEndTime() {
		return this.receiptEndTime;
	}
	
	public void setReceiptEndTime(String value) {
		this.receiptEndTime = value;
	}
	
	
	public String getRunTime() {
		return this.runTime;
	}
	
	public void setRunTime(String value) {
		this.runTime = value;
	}
	
	
	public Integer getChoiceOrderFlag() {
		return this.choiceOrderFlag;
	}
	
	public void setChoiceOrderFlag(Integer value) {
		this.choiceOrderFlag = value;
	}
	
	
	public String getChoiceOrderBeginTime() {
		return this.choiceOrderBeginTime;
	}
	
	public void setChoiceOrderBeginTime(String value) {
		this.choiceOrderBeginTime = value;
	}
	
	
	public String getChoiceOrderEndTime() {
		return this.choiceOrderEndTime;
	}
	
	public void setChoiceOrderEndTime(String value) {
		this.choiceOrderEndTime = value;
	}
	
	
	public Integer getNegativeEvaluateFlag() {
		return this.negativeEvaluateFlag;
	}
	
	public void setNegativeEvaluateFlag(Integer value) {
		this.negativeEvaluateFlag = value;
	}
	
	
	public Integer getAreaMonthEquilibriumFlag() {
		return this.areaMonthEquilibriumFlag;
	}
	
	public void setAreaMonthEquilibriumFlag(Integer value) {
		this.areaMonthEquilibriumFlag = value;
	}
	
	
	public Integer getAllServiceClassFlag() {
		return this.allServiceClassFlag;
	}
	
	public void setAllServiceClassFlag(Integer value) {
		this.allServiceClassFlag = value;
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
	
	
	public Integer getDispatchVersion() {
		return this.dispatchVersion;
	}
	
	public void setDispatchVersion(Integer value) {
		this.dispatchVersion = value;
	}
	
	
	public String getNightBeginTime() {
		return this.nightBeginTime;
	}
	
	public void setNightBeginTime(String value) {
		this.nightBeginTime = value;
	}
	
	
	public String getNightEndTime() {
		return this.nightEndTime;
	}
	
	public void setNightEndTime(String value) {
		this.nightEndTime = value;
	}
	

	

}

