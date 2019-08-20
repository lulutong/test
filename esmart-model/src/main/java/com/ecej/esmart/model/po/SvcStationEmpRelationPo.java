
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcStationEmpRelationPo extends BasePo {
	//alias
	public static final String TABLE_ALIAS = "SvcStationEmpRelation";
	

	//columns START
    /**
     * 关系ID       db_column: station_emp_relation_id   
     */ 	
	private Integer stationEmpRelationId;
    /**
     * 小组ID       db_column: group_id   
     */ 	
	private Integer groupId;
    /**
     * 员工ID       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 服务站ID       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 状态(0-锁定 1-激活 2-解散)       db_column: status   
     */ 	
	private Integer status;
    /**
     * 是否是负责人(0-否 1-是)       db_column: principal_flag   
     */ 	
	private Integer principalFlag;
    /**
     * 分成比例       db_column: split_ratio   
     */ 	
	private String splitRatio;
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


	
	
	public Integer getStationEmpRelationId() {
		return this.stationEmpRelationId;
	}
	
	public void setStationEmpRelationId(Integer value) {
		this.stationEmpRelationId = value;
	}
	
	
	public Integer getGroupId() {
		return this.groupId;
	}
	
	public void setGroupId(Integer value) {
		this.groupId = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	
	public Integer getPrincipalFlag() {
		return this.principalFlag;
	}
	
	public void setPrincipalFlag(Integer value) {
		this.principalFlag = value;
	}
	
	
	public String getSplitRatio() {
		return this.splitRatio;
	}
	
	public void setSplitRatio(String value) {
		this.splitRatio = value;
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

