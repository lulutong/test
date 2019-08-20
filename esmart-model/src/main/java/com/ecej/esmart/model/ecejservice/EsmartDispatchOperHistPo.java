
package com.ecej.esmart.model.ecejservice;

public class EsmartDispatchOperHistPo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartDispatchOperHist";
	

	//columns START
    /**
     * 派工记录ID       db_column: dispatch_oper_hist_id   
     */ 	
	private Long dispatchOperHistId;
    /**
     * 订单编号       db_column: work_order_no   
     */ 	
	private String workOrderNo;
    /**
     * 操作人ID(任务池-emp_id,手动派工-station_id,其它-0)       db_column: operator_id   
     */ 	
	private Integer operatorId;
    /**
     * 操作人姓名       db_column: operator_user   
     */ 	
	private String operatorUser;
    /**
     * 预计派工时间       db_column: expect_dispatch_time   
     */ 	
	private java.util.Date expectDispatchTime;
    /**
     * 预约开始时间       db_column: book_start_time   
     */ 	
	private java.util.Date bookStartTime;
    /**
     * 派工方式(1- 推广码立刻派工,2- 地推活动立刻派工,3- 任务池领取任务,4- 手动派工,5- 应急派工,6- 重单派工,7-常规自动派工,8-超期自动派工,9-超期手动派工,10-预警,11-紧急品类派工)       db_column: dispatch_type   
     */ 	
	private Integer dispatchType;
    /**
     * 预警原因(1 无满足技能人员 2 无排班 3 被剔除 4时间满)       db_column: warn_type   
     */ 	
	private Integer warnType;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 服务站id       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 服务区域ID       db_column: service_area_id   
     */ 	
	private Integer serviceAreaId;
    /**
     * 服务品类明细       db_column: service_json   
     */ 	
	private String serviceJson;
    /**
     * 员工位置明细       db_column: emp_position_json   
     */ 	
	private String empPositionJson;
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
     * 语音电话接听状态（0-未接听 1-已接听）       db_column: answer_status   
     */ 	
	private Integer answerStatus;
	//columns END


	
	
	public Long getDispatchOperHistId() {
		return this.dispatchOperHistId;
	}
	
	public void setDispatchOperHistId(Long value) {
		this.dispatchOperHistId = value;
	}
	
	
	public String getWorkOrderNo() {
		return this.workOrderNo;
	}
	
	public void setWorkOrderNo(String value) {
		this.workOrderNo = value;
	}
	
	
	public Integer getOperatorId() {
		return this.operatorId;
	}
	
	public void setOperatorId(Integer value) {
		this.operatorId = value;
	}
	
	
	public String getOperatorUser() {
		return this.operatorUser;
	}
	
	public void setOperatorUser(String value) {
		this.operatorUser = value;
	}
	
	
	public java.util.Date getExpectDispatchTime() {
		return this.expectDispatchTime;
	}
	
	public void setExpectDispatchTime(java.util.Date value) {
		this.expectDispatchTime = value;
	}
	
	
	public java.util.Date getBookStartTime() {
		return this.bookStartTime;
	}
	
	public void setBookStartTime(java.util.Date value) {
		this.bookStartTime = value;
	}
	
	
	public Integer getDispatchType() {
		return this.dispatchType;
	}
	
	public void setDispatchType(Integer value) {
		this.dispatchType = value;
	}
	
	
	public Integer getWarnType() {
		return this.warnType;
	}
	
	public void setWarnType(Integer value) {
		this.warnType = value;
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
	
	
	public String getServiceJson() {
		return this.serviceJson;
	}
	
	public void setServiceJson(String value) {
		this.serviceJson = value;
	}
	
	
	public String getEmpPositionJson() {
		return this.empPositionJson;
	}
	
	public void setEmpPositionJson(String value) {
		this.empPositionJson = value;
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
	
	
	public Integer getAnswerStatus() {
		return this.answerStatus;
	}
	
	public void setAnswerStatus(Integer value) {
		this.answerStatus = value;
	}
	

	

}

