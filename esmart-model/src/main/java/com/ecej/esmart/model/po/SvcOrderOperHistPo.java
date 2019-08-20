
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcOrderOperHistPo extends BasePo {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SvcOrderOperHist";
	

	//columns START
    /**
     * 操作历史id       db_column: oper_hist_id   
     */ 	
	private Integer operHistId;
    /**
     * 服务工单id       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 变动原因ID       db_column: order_change_reason_id   
     */ 	
	private Integer orderChangeReasonId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 订单编号       db_column: work_order_no   
     */ 	
	private String workOrderNo;
    /**
     * 操作类型（1-创建，2-手动派工，3-改约，4-取消，5-升级，6-改派，7-不领取任务，8-领取任务，9-自动派工 10-预约 11-拒单 12-关闭订单 13-抢单 14-修改订单 15-加价）       db_column: operator_type   
     */ 	
	private Integer operatorType;
    /**
     * 旧订单状态       db_column: old_order_status   
     */ 	
	private Integer oldOrderStatus;
    /**
     * 新订单状态       db_column: new_order_status   
     */ 	
	private Integer newOrderStatus;
    /**
     * 操作来源(1-用户app 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-后补工单 19-商家微信 20- 服务者端APP 100-自动派工 21-支付宝小程序)       db_column: operator_source   
     */ 	
	private Integer operatorSource;
    /**
     * 操作时间       db_column: operator_time   
     */ 	
	private java.util.Date operatorTime;
    /**
     * 操作人ID（ecej平台需要保存，sap不需要保存）       db_column: operator_id   
     */ 	
	private Integer operatorId;
    /**
     * 操作人姓名       db_column: operator_user   
     */ 	
	private String operatorUser;
    /**
     * 上门前后flag（1-上门前；2-上门后）       db_column: service_in_out_flag   
     */ 	
	private Integer serviceInOutFlag;
    /**
     * 旧服务站名称       db_column: old_station_name   
     */ 	
	private String oldStationName;
    /**
     * 新服务站名称       db_column: new_station_name   
     */ 	
	private String newStationName;
    /**
     * 旧多能工姓名       db_column: old_multi_skill_emp_name   
     */ 	
	private String oldMultiSkillEmpName;
    /**
     * 新多能工姓名       db_column: new_multi_skill_emp_name   
     */ 	
	private String newMultiSkillEmpName;
    /**
     * 旧站长姓名       db_column: old_station_head_name   
     */ 	
	private String oldStationHeadName;
    /**
     * 新站长姓名       db_column: new_station_head_name   
     */ 	
	private String newStationHeadName;
    /**
     * 旧预约开始时间       db_column: old_book_start_time   
     */ 	
	private java.util.Date oldBookStartTime;
    /**
     * 旧预约结束时间       db_column: old_book_end_time   
     */ 	
	private java.util.Date oldBookEndTime;
    /**
     * 新预约开始时间       db_column: new_book_start_time   
     */ 	
	private java.util.Date newBookStartTime;
    /**
     * 新预约结束时间       db_column: new_book_end_time   
     */ 	
	private java.util.Date newBookEndTime;
    /**
     * 旧服务品类       db_column: old_service_class   
     */ 	
	private String oldServiceClass;
    /**
     * 新服务品类       db_column: new_service_class   
     */ 	
	private String newServiceClass;
    /**
     * 关联订单号       db_column: rel_order_no   
     */ 	
	private String relOrderNo;
    /**
     * 操作原因（包括取消原因、改约原因、升级原因）       db_column: operator_reason   
     */ 	
	private String operatorReason;
    /**
     * 原服务公司名称       db_column: old_service_company_name   
     */ 	
	private String oldServiceCompanyName;
    /**
     * 现服务公司名称       db_column: new_service_company_name   
     */ 	
	private String newServiceCompanyName;
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
     * 操作角色 1用户 2员工 3系统 4 商家 5运营后台 6平台工长 7平台工友       db_column: operator_role   
     */ 	
	private Integer operatorRole;
    /**
     * 操作原因标签 121=待支付关闭 122=无人抢单关闭 111=员工拒单       db_column: operator_type_tag   
     */ 	
	private Integer operatorTypeTag;
    /**
     * 是否有责 0=没有 1=有责       db_column: is_liability   
     */ 	
	private Integer isLiability;
    /**
     * 责任方 1=用户 2=员工 3=商家       db_column: liability_party   
     */ 	
	private Integer liabilityParty;
    /**
     * 有责Id       db_column: liability_id   
     */ 	
	private String liabilityId;
    /**
     * json格式存储       db_column: liability_content   
     */ 	
	private String liabilityContent;
	//columns END


	
	
	public Integer getOperHistId() {
		return this.operHistId;
	}
	
	public void setOperHistId(Integer value) {
		this.operHistId = value;
	}
	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	
	
	public Integer getOrderChangeReasonId() {
		return this.orderChangeReasonId;
	}
	
	public void setOrderChangeReasonId(Integer value) {
		this.orderChangeReasonId = value;
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
	
	
	public Integer getOperatorType() {
		return this.operatorType;
	}
	
	public void setOperatorType(Integer value) {
		this.operatorType = value;
	}
	
	
	public Integer getOldOrderStatus() {
		return this.oldOrderStatus;
	}
	
	public void setOldOrderStatus(Integer value) {
		this.oldOrderStatus = value;
	}
	
	
	public Integer getNewOrderStatus() {
		return this.newOrderStatus;
	}
	
	public void setNewOrderStatus(Integer value) {
		this.newOrderStatus = value;
	}
	
	
	public Integer getOperatorSource() {
		return this.operatorSource;
	}
	
	public void setOperatorSource(Integer value) {
		this.operatorSource = value;
	}
	
	
	public java.util.Date getOperatorTime() {
		return this.operatorTime;
	}
	
	public void setOperatorTime(java.util.Date value) {
		this.operatorTime = value;
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
	
	
	public Integer getServiceInOutFlag() {
		return this.serviceInOutFlag;
	}
	
	public void setServiceInOutFlag(Integer value) {
		this.serviceInOutFlag = value;
	}
	
	
	public String getOldStationName() {
		return this.oldStationName;
	}
	
	public void setOldStationName(String value) {
		this.oldStationName = value;
	}
	
	
	public String getNewStationName() {
		return this.newStationName;
	}
	
	public void setNewStationName(String value) {
		this.newStationName = value;
	}
	
	
	public String getOldMultiSkillEmpName() {
		return this.oldMultiSkillEmpName;
	}
	
	public void setOldMultiSkillEmpName(String value) {
		this.oldMultiSkillEmpName = value;
	}
	
	
	public String getNewMultiSkillEmpName() {
		return this.newMultiSkillEmpName;
	}
	
	public void setNewMultiSkillEmpName(String value) {
		this.newMultiSkillEmpName = value;
	}
	
	
	public String getOldStationHeadName() {
		return this.oldStationHeadName;
	}
	
	public void setOldStationHeadName(String value) {
		this.oldStationHeadName = value;
	}
	
	
	public String getNewStationHeadName() {
		return this.newStationHeadName;
	}
	
	public void setNewStationHeadName(String value) {
		this.newStationHeadName = value;
	}
	
	
	public java.util.Date getOldBookStartTime() {
		return this.oldBookStartTime;
	}
	
	public void setOldBookStartTime(java.util.Date value) {
		this.oldBookStartTime = value;
	}
	
	
	public java.util.Date getOldBookEndTime() {
		return this.oldBookEndTime;
	}
	
	public void setOldBookEndTime(java.util.Date value) {
		this.oldBookEndTime = value;
	}
	
	
	public java.util.Date getNewBookStartTime() {
		return this.newBookStartTime;
	}
	
	public void setNewBookStartTime(java.util.Date value) {
		this.newBookStartTime = value;
	}
	
	
	public java.util.Date getNewBookEndTime() {
		return this.newBookEndTime;
	}
	
	public void setNewBookEndTime(java.util.Date value) {
		this.newBookEndTime = value;
	}
	
	
	public String getOldServiceClass() {
		return this.oldServiceClass;
	}
	
	public void setOldServiceClass(String value) {
		this.oldServiceClass = value;
	}
	
	
	public String getNewServiceClass() {
		return this.newServiceClass;
	}
	
	public void setNewServiceClass(String value) {
		this.newServiceClass = value;
	}
	
	
	public String getRelOrderNo() {
		return this.relOrderNo;
	}
	
	public void setRelOrderNo(String value) {
		this.relOrderNo = value;
	}
	
	
	public String getOperatorReason() {
		return this.operatorReason;
	}
	
	public void setOperatorReason(String value) {
		this.operatorReason = value;
	}
	
	
	public String getOldServiceCompanyName() {
		return this.oldServiceCompanyName;
	}
	
	public void setOldServiceCompanyName(String value) {
		this.oldServiceCompanyName = value;
	}
	
	
	public String getNewServiceCompanyName() {
		return this.newServiceCompanyName;
	}
	
	public void setNewServiceCompanyName(String value) {
		this.newServiceCompanyName = value;
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
	
	
	public Integer getOperatorRole() {
		return this.operatorRole;
	}
	
	public void setOperatorRole(Integer value) {
		this.operatorRole = value;
	}
	
	
	public Integer getOperatorTypeTag() {
		return this.operatorTypeTag;
	}
	
	public void setOperatorTypeTag(Integer value) {
		this.operatorTypeTag = value;
	}
	
	
	public Integer getIsLiability() {
		return this.isLiability;
	}
	
	public void setIsLiability(Integer value) {
		this.isLiability = value;
	}
	
	
	public Integer getLiabilityParty() {
		return this.liabilityParty;
	}
	
	public void setLiabilityParty(Integer value) {
		this.liabilityParty = value;
	}
	
	
	public String getLiabilityId() {
		return this.liabilityId;
	}
	
	public void setLiabilityId(String value) {
		this.liabilityId = value;
	}
	
	
	public String getLiabilityContent() {
		return this.liabilityContent;
	}
	
	public void setLiabilityContent(String value) {
		this.liabilityContent = value;
	}
	

	

}

