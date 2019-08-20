
package com.ecej.esmart.model.ecejservice;

import java.io.Serializable;

public class EsmartOrderPathPlanningPo implements Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartOrderPathPlanning";
	

	//columns START
    /**
     * 订单路径规划ID       db_column: order_path_planning_id   
     */ 	
	private Integer orderPathPlanningId;
    /**
     * 订单ID       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 员工id       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 时间类型(1-上午，2-下午，3-晚上)       db_column: time_type   
     */ 	
	private Integer timeType;
    /**
     * 时间类型名称(1-上午，2-下午，3-晚上)       db_column: time_type_name   
     */ 	
	private String timeTypeName;
    /**
     * 订单组别       db_column: order_group   
     */ 	
	private String orderGroup;
    /**
     * 订单序号       db_column: order_sequence   
     */ 	
	private Integer orderSequence;
    /**
     * 方案类型(1-系统推荐，2-手动派工)       db_column: order_scheme   
     */ 	
	private Integer orderScheme;
    /**
     * 发布状态(1-未发布，2-已发布)       db_column: publish_status   
     */ 	
	private Integer publishStatus;
    /**
     * 路径规划时间       db_column: publish_date   
     */ 	
	private java.util.Date publishDate;
    /**
     * 订单预约日期       db_column: order_date   
     */ 	
	private java.util.Date orderDate;
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
     * 服务站id       db_column: station_id   
     */ 	
	private Integer stationId;
	//columns END


	
	
	public Integer getOrderPathPlanningId() {
		return this.orderPathPlanningId;
	}
	
	public void setOrderPathPlanningId(Integer value) {
		this.orderPathPlanningId = value;
	}
	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getTimeType() {
		return this.timeType;
	}
	
	public void setTimeType(Integer value) {
		this.timeType = value;
	}
	
	
	public String getTimeTypeName() {
		return this.timeTypeName;
	}
	
	public void setTimeTypeName(String value) {
		this.timeTypeName = value;
	}
	
	
	public String getOrderGroup() {
		return this.orderGroup;
	}
	
	public void setOrderGroup(String value) {
		this.orderGroup = value;
	}
	
	
	public Integer getOrderSequence() {
		return this.orderSequence;
	}
	
	public void setOrderSequence(Integer value) {
		this.orderSequence = value;
	}
	
	
	public Integer getOrderScheme() {
		return this.orderScheme;
	}
	
	public void setOrderScheme(Integer value) {
		this.orderScheme = value;
	}
	
	
	public Integer getPublishStatus() {
		return this.publishStatus;
	}
	
	public void setPublishStatus(Integer value) {
		this.publishStatus = value;
	}
	
	
	public java.util.Date getPublishDate() {
		return this.publishDate;
	}
	
	public void setPublishDate(java.util.Date value) {
		this.publishDate = value;
	}
	
	
	public java.util.Date getOrderDate() {
		return this.orderDate;
	}
	
	public void setOrderDate(java.util.Date value) {
		this.orderDate = value;
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
	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	

	

}

