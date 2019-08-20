
package com.ecej.esmart.model.ecejservice;


public class EsmartPlanDispatchOrderPoolPo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartPlanDispatchOrderPool";
	

	//columns START
    /**
     * 派单池任务id       db_column: plan_dispatch_order_pool_id   
     */ 	
	private Integer planDispatchOrderPoolId;
    /**
     * 订单id       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 服务站id       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 服务区域id       db_column: service_area_id   
     */ 	
	private Integer serviceAreaId;
    /**
     * 技能标签id       db_column: skill_label_id   
     */ 	
	private Integer skillLabelId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 员工id       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 用户id       db_column: user_id   
     */ 	
	private Integer userId;
    /**
     * 资源占用状态 1-正常占用资源2-未正常用资源       db_column: resource_occupation_status   
     */ 	
	private Integer resourceOccupationStatus;
    /**
     * 0-未派单 1-已派单 2-取消       db_column: plan_dispatch_order_status   
     */ 	
	private Integer planDispatchOrderStatus;
    /**
     * 订单来源(1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信)       db_column: order_source   
     */ 	
	private Integer orderSource;
    /**
     * 预约开始时间       db_column: book_start_time   
     */ 	
	private java.util.Date bookStartTime;
    /**
     * 预约结束时间       db_column: book_end_time   
     */ 	
	private java.util.Date bookEndTime;
    /**
     * 排班id       db_column: schedule_record_id   
     */ 	
	private Integer scheduleRecordId;
    /**
     * 员工预计开始时间       db_column: emp_expect_begin_time   
     */ 	
	private java.util.Date empExpectBeginTime;
    /**
     * 员工预计上门时间       db_column: emp_expect_visit_time   
     */ 	
	private java.util.Date empExpectVisitTime;
    /**
     * 员工预计结束时间       db_column: emp_expect_end_time   
     */ 	
	private java.util.Date empExpectEndTime;
    /**
     * 临时小组档期信息       db_column: schedule_record_json   
     */ 	
	private String scheduleRecordJson;
    /**
     * 经度       db_column: longitude   
     */ 	
	private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude   
     */ 	
	private java.math.BigDecimal latitude;
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


	
	
	public Integer getPlanDispatchOrderPoolId() {
		return this.planDispatchOrderPoolId;
	}
	
	public void setPlanDispatchOrderPoolId(Integer value) {
		this.planDispatchOrderPoolId = value;
	}
	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	
	public Integer getServiceAreaId() {
		return this.serviceAreaId;
	}
	
	public void setServiceAreaId(Integer value) {
		this.serviceAreaId = value;
	}
	
	
	public Integer getSkillLabelId() {
		return this.skillLabelId;
	}
	
	public void setSkillLabelId(Integer value) {
		this.skillLabelId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	
	public Integer getResourceOccupationStatus() {
		return this.resourceOccupationStatus;
	}
	
	public void setResourceOccupationStatus(Integer value) {
		this.resourceOccupationStatus = value;
	}
	
	
	public Integer getPlanDispatchOrderStatus() {
		return this.planDispatchOrderStatus;
	}
	
	public void setPlanDispatchOrderStatus(Integer value) {
		this.planDispatchOrderStatus = value;
	}
	
	
	public Integer getOrderSource() {
		return this.orderSource;
	}
	
	public void setOrderSource(Integer value) {
		this.orderSource = value;
	}
	
	
	public java.util.Date getBookStartTime() {
		return this.bookStartTime;
	}
	
	public void setBookStartTime(java.util.Date value) {
		this.bookStartTime = value;
	}
	
	
	public java.util.Date getBookEndTime() {
		return this.bookEndTime;
	}
	
	public void setBookEndTime(java.util.Date value) {
		this.bookEndTime = value;
	}
	
	
	public Integer getScheduleRecordId() {
		return this.scheduleRecordId;
	}
	
	public void setScheduleRecordId(Integer value) {
		this.scheduleRecordId = value;
	}
	
	
	public java.util.Date getEmpExpectBeginTime() {
		return this.empExpectBeginTime;
	}
	
	public void setEmpExpectBeginTime(java.util.Date value) {
		this.empExpectBeginTime = value;
	}
	
	
	public java.util.Date getEmpExpectVisitTime() {
		return this.empExpectVisitTime;
	}
	
	public void setEmpExpectVisitTime(java.util.Date value) {
		this.empExpectVisitTime = value;
	}
	
	
	public java.util.Date getEmpExpectEndTime() {
		return this.empExpectEndTime;
	}
	
	public void setEmpExpectEndTime(java.util.Date value) {
		this.empExpectEndTime = value;
	}
	
	
	public String getScheduleRecordJson() {
		return this.scheduleRecordJson;
	}
	
	public void setScheduleRecordJson(String value) {
		this.scheduleRecordJson = value;
	}
	
	
	public java.math.BigDecimal getLongitude() {
		return this.longitude;
	}
	
	public void setLongitude(java.math.BigDecimal value) {
		this.longitude = value;
	}
	
	
	public java.math.BigDecimal getLatitude() {
		return this.latitude;
	}
	
	public void setLatitude(java.math.BigDecimal value) {
		this.latitude = value;
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

