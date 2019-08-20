
package com.ecej.esmart.model.ecejservice;

import java.io.Serializable;

public class EsmartCityBaseSettingPo implements Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartCityBaseSetting";
	

	//columns START
    /**
     * 城市基础配置id       db_column: city_base_setting_id   
     */ 	
	private Integer cityBaseSettingId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 熟识服务者优先时间       db_column: often_emp_time   
     */ 	
	private Integer oftenEmpTime;
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
     * 匹配员工技能(0-服务品类 1-技能标签)       db_column: mate_emp_skill_flag   
     */ 	
	private Integer mateEmpSkillFlag;
	//columns END


	
	
	public Integer getCityBaseSettingId() {
		return this.cityBaseSettingId;
	}
	
	public void setCityBaseSettingId(Integer value) {
		this.cityBaseSettingId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getOftenEmpTime() {
		return this.oftenEmpTime;
	}
	
	public void setOftenEmpTime(Integer value) {
		this.oftenEmpTime = value;
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
	
	
	public Integer getMateEmpSkillFlag() {
		return this.mateEmpSkillFlag;
	}
	
	public void setMateEmpSkillFlag(Integer value) {
		this.mateEmpSkillFlag = value;
	}
	

	

}

