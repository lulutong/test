
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcEmpAreaRelationPo extends BasePo {
	//alias
	public static final String TABLE_ALIAS = "SvcEmpAreaRelation";
	

	//columns START
    /**
     * 人员服务区域关系id       db_column: emp_area_relation_id   
     */ 	
	private Integer empAreaRelationId;
    /**
     * 员工ID       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 服务区域id       db_column: service_area_id   
     */ 	
	private Integer serviceAreaId;
    /**
     * 创建用户       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 创建时间       db_column: create_time   
     */ 	
	private java.util.Date createTime;
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


	
	
	public Integer getEmpAreaRelationId() {
		return this.empAreaRelationId;
	}
	
	public void setEmpAreaRelationId(Integer value) {
		this.empAreaRelationId = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getServiceAreaId() {
		return this.serviceAreaId;
	}
	
	public void setServiceAreaId(Integer value) {
		this.serviceAreaId = value;
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

