
package com.ecej.esmart.model.ecejservice;

import java.io.Serializable;

public class EsmartDispatchOperatorLogPo implements Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartDispatchOperatorLog";
	

	//columns START
    /**
     * 派工操作日志ID       db_column: dispatch_operator_log_id   
     */ 	
	private Long dispatchOperatorLogId;
    /**
     * 请求源IP       db_column: request_ip   
     */ 	
	private String requestIp;
    /**
     * GUID       db_column: guid   
     */ 	
	private String guid;
    /**
     * 手机号       db_column: phone   
     */ 	
	private String phone;
    /**
     * 城市ID       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 订单编号       db_column: work_order_no   
     */ 	
	private String workOrderNo;
    /**
     * 夜班模式(0-白班模式，1-夜班模式)       db_column: night_model   
     */ 	
	private Integer nightModel;
    /**
     * 请求来源(1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信)       db_column: request_source   
     */ 	
	private Integer requestSource;
    /**
     * 用户ID       db_column: user_id   
     */ 	
	private Integer userId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 推广码       db_column: extension_agent_id   
     */ 	
	private Integer extensionAgentId;
    /**
     * 小区       db_column: community   
     */ 	
	private String community;
    /**
     * 经度       db_column: longitude   
     */ 	
	private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude   
     */ 	
	private java.math.BigDecimal latitude;
    /**
     * 服务品类集合       db_column: service_class_ids   
     */ 	
	private String serviceClassIds;
    /**
     * 派工标识(0-非立刻派工，1-立刻派工)       db_column: order_flag   
     */ 	
	private Integer orderFlag;
    /**
     * 当前登录员工ID       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 当前选中员工ID       db_column: checked_emp_id   
     */ 	
	private Integer checkedEmpId;
    /**
     * 员工领取任务类型(0-普通订单，1-改约订单)       db_column: task_pool_type   
     */ 	
	private Integer taskPoolType;
    /**
     * 预约时间       db_column: appointment_time   
     */ 	
	private java.util.Date appointmentTime;
    /**
     * 操作类型(1-推荐时间,2-时间列表,3-选择时间,4-放弃下单,5-创建工单,6-取消,7-完成,8-改派,9-改约,10-任务池列表,11-领取任务,12-多能工列表,13-抢单池任务列表 ,14-抢单,15-拒单,16-关闭,17-未抢单关闭,18-支付完成,19-派工,20-获取服务区域列表)       db_column: operator_type   
     */ 	
	private Integer operatorType;
    /**
     * 公司ID       db_column: r_company_id   
     */ 	
	private Integer rcompanyId;
    /**
     * 服务站id       db_column: r_station_id   
     */ 	
	private Integer rstationId;
    /**
     * 服务区域id       db_column: r_service_area_id   
     */ 	
	private Integer rserviceAreaId;
    /**
     * 系统推荐时间       db_column: r_recommTime   
     */ 	
	private java.util.Date rrecommTime;
    /**
     * 是否无资源下单(0-是，1-否)       db_column: r_no_resource_flag   
     */ 	
	private Integer rnoResourceFlag;
    /**
     * 锁定时间       db_column: r_lock_time   
     */ 	
	private java.util.Date rlockTime;
    /**
     * 员工ID       db_column: r_emp_id   
     */ 	
	private Integer rempId;
    /**
     * 排班id       db_column: r_schedule_record   
     */ 	
	private Integer rscheduleRecord;
    /**
     * 员工预计开始时间       db_column: r_emp_expect_begin_time   
     */ 	
	private java.util.Date rempExpectBeginTime;
    /**
     * 员工预计上门时间       db_column: r_emp_expect_visit_time   
     */ 	
	private java.util.Date rempExpectVisitTime;
    /**
     * 员工预计结束时间       db_column: r_emp_expect_end_time   
     */ 	
	private java.util.Date rempExpectEndTime;
    /**
     * 派工状态(0-未派工 1-已派工 2-升级派工 3-站长预警  4-取消 5-虚拟预警)       db_column: r_dipatch_status   
     */ 	
	private Integer rdipatchStatus;
    /**
     * 多能工列表       db_column: r_emp_list   
     */ 	
	private String rempList;
    /**
     * 时间列表       db_column: r_time_table   
     */ 	
	private String rtimeTable;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 修改人       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 1:删除 0:未删除       db_column: del_flag   
     */ 	
	private Integer delFlag;
    /**
     * 数据创建时间       db_column: screate_time   
     */ 	
	private java.util.Date screateTime;
    /**
     * 数据更新时间       db_column: supdate_time   
     */ 	
	private java.util.Date supdateTime;
    /**
     * 1 动态派工，2 平台抢单，3 派单模式，默认1       db_column: order_dispatching_mode   
     */ 	
	private Integer orderDispatchingMode;
    /**
     * 抢单服务区域集合       db_column: r_service_area_id_json   
     */ 	
	private String rserviceAreaIdJson;
	//columns END


	
	
	public Long getDispatchOperatorLogId() {
		return this.dispatchOperatorLogId;
	}
	
	public void setDispatchOperatorLogId(Long value) {
		this.dispatchOperatorLogId = value;
	}
	
	
	public String getRequestIp() {
		return this.requestIp;
	}
	
	public void setRequestIp(String value) {
		this.requestIp = value;
	}
	
	
	public String getGuid() {
		return this.guid;
	}
	
	public void setGuid(String value) {
		this.guid = value;
	}
	
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public String getWorkOrderNo() {
		return this.workOrderNo;
	}
	
	public void setWorkOrderNo(String value) {
		this.workOrderNo = value;
	}
	
	
	public Integer getNightModel() {
		return this.nightModel;
	}
	
	public void setNightModel(Integer value) {
		this.nightModel = value;
	}
	
	
	public Integer getRequestSource() {
		return this.requestSource;
	}
	
	public void setRequestSource(Integer value) {
		this.requestSource = value;
	}
	
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	
	public Integer getCompanyId() {
		return this.companyId;
	}
	
	public void setCompanyId(Integer value) {
		this.companyId = value;
	}
	
	
	public Integer getExtensionAgentId() {
		return this.extensionAgentId;
	}
	
	public void setExtensionAgentId(Integer value) {
		this.extensionAgentId = value;
	}
	
	
	public String getCommunity() {
		return this.community;
	}
	
	public void setCommunity(String value) {
		this.community = value;
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
	
	
	public String getServiceClassIds() {
		return this.serviceClassIds;
	}
	
	public void setServiceClassIds(String value) {
		this.serviceClassIds = value;
	}
	
	
	public Integer getOrderFlag() {
		return this.orderFlag;
	}
	
	public void setOrderFlag(Integer value) {
		this.orderFlag = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getCheckedEmpId() {
		return this.checkedEmpId;
	}
	
	public void setCheckedEmpId(Integer value) {
		this.checkedEmpId = value;
	}
	
	
	public Integer getTaskPoolType() {
		return this.taskPoolType;
	}
	
	public void setTaskPoolType(Integer value) {
		this.taskPoolType = value;
	}
	
	
	public java.util.Date getAppointmentTime() {
		return this.appointmentTime;
	}
	
	public void setAppointmentTime(java.util.Date value) {
		this.appointmentTime = value;
	}
	
	
	public Integer getOperatorType() {
		return this.operatorType;
	}
	
	public void setOperatorType(Integer value) {
		this.operatorType = value;
	}
	
	
	public Integer getRcompanyId() {
		return this.rcompanyId;
	}
	
	public void setRcompanyId(Integer value) {
		this.rcompanyId = value;
	}
	
	
	public Integer getRstationId() {
		return this.rstationId;
	}
	
	public void setRstationId(Integer value) {
		this.rstationId = value;
	}
	
	
	public Integer getRserviceAreaId() {
		return this.rserviceAreaId;
	}
	
	public void setRserviceAreaId(Integer value) {
		this.rserviceAreaId = value;
	}
	
	
	public java.util.Date getRrecommTime() {
		return this.rrecommTime;
	}
	
	public void setRrecommTime(java.util.Date value) {
		this.rrecommTime = value;
	}
	
	
	public Integer getRnoResourceFlag() {
		return this.rnoResourceFlag;
	}
	
	public void setRnoResourceFlag(Integer value) {
		this.rnoResourceFlag = value;
	}
	
	
	public java.util.Date getRlockTime() {
		return this.rlockTime;
	}
	
	public void setRlockTime(java.util.Date value) {
		this.rlockTime = value;
	}
	
	
	public Integer getRempId() {
		return this.rempId;
	}
	
	public void setRempId(Integer value) {
		this.rempId = value;
	}
	
	
	public Integer getRscheduleRecord() {
		return this.rscheduleRecord;
	}
	
	public void setRscheduleRecord(Integer value) {
		this.rscheduleRecord = value;
	}
	
	
	public java.util.Date getRempExpectBeginTime() {
		return this.rempExpectBeginTime;
	}
	
	public void setRempExpectBeginTime(java.util.Date value) {
		this.rempExpectBeginTime = value;
	}
	
	
	public java.util.Date getRempExpectVisitTime() {
		return this.rempExpectVisitTime;
	}
	
	public void setRempExpectVisitTime(java.util.Date value) {
		this.rempExpectVisitTime = value;
	}
	
	
	public java.util.Date getRempExpectEndTime() {
		return this.rempExpectEndTime;
	}
	
	public void setRempExpectEndTime(java.util.Date value) {
		this.rempExpectEndTime = value;
	}
	
	
	public Integer getRdipatchStatus() {
		return this.rdipatchStatus;
	}
	
	public void setRdipatchStatus(Integer value) {
		this.rdipatchStatus = value;
	}
	
	
	public String getRempList() {
		return this.rempList;
	}
	
	public void setRempList(String value) {
		this.rempList = value;
	}
	
	
	public String getRtimeTable() {
		return this.rtimeTable;
	}
	
	public void setRtimeTable(String value) {
		this.rtimeTable = value;
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
	
	
	public Integer getDelFlag() {
		return this.delFlag;
	}
	
	public void setDelFlag(Integer value) {
		this.delFlag = value;
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
	
	
	public Integer getOrderDispatchingMode() {
		return this.orderDispatchingMode;
	}
	
	public void setOrderDispatchingMode(Integer value) {
		this.orderDispatchingMode = value;
	}
	
	
	public String getRserviceAreaIdJson() {
		return this.rserviceAreaIdJson;
	}
	
	public void setRserviceAreaIdJson(String value) {
		this.rserviceAreaIdJson = value;
	}
	

	

}

