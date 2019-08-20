
package com.ecej.esmart.model.ecejservice;

public class EsmartOrderRefuseHistPo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartOrderRefuseHist";
	

	//columns START
    /**
     * 拒单记录id       db_column: order_refuse_hist_id   
     */ 	
	private Integer orderRefuseHistId;
    /**
     * 订单id       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 操作类型（1-拒单）       db_column: operator_type   
     */ 	
	private Integer operatorType;
    /**
     * 操作来源(1-用户app 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-后补工单 19-商家微信)       db_column: operator_source   
     */ 	
	private Integer operatorSource;
    /**
     * 操作人ID（ecej平台需要保存，sap不需要保存）       db_column: operator_id   
     */ 	
	private Integer operatorId;
    /**
     * 操作人姓名       db_column: operator_user   
     */ 	
	private String operatorUser;
    /**
     * 操作时间       db_column: operator_time   
     */ 	
	private java.util.Date operatorTime;
    /**
     * 订单编号       db_column: work_order_no   
     */ 	
	private String workOrderNo;
    /**
     * 旧订单状态       db_column: old_order_status   
     */ 	
	private Integer oldOrderStatus;
    /**
     * 新订单状态       db_column: new_order_status   
     */ 	
	private Integer newOrderStatus;
    /**
     * 旧服务站名称       db_column: old_station_name   
     */ 	
	private String oldStationName;
    /**
     * 新服务站名称       db_column: new_station_name   
     */ 	
	private String newStationName;
    /**
     * 原服务公司名称       db_column: old_service_company_name   
     */ 	
	private String oldServiceCompanyName;
    /**
     * 现服务公司名称       db_column: new_service_company_name   
     */ 	
	private String newServiceCompanyName;
    /**
     * 变动原因ID       db_column: order_change_reason_id   
     */ 	
	private Integer orderChangeReasonId;
    /**
     * 操作原因       db_column: operator_reason   
     */ 	
	private String operatorReason;
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


	
	
	public Integer getOrderRefuseHistId() {
		return this.orderRefuseHistId;
	}
	
	public void setOrderRefuseHistId(Integer value) {
		this.orderRefuseHistId = value;
	}
	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getOperatorType() {
		return this.operatorType;
	}
	
	public void setOperatorType(Integer value) {
		this.operatorType = value;
	}
	
	
	public Integer getOperatorSource() {
		return this.operatorSource;
	}
	
	public void setOperatorSource(Integer value) {
		this.operatorSource = value;
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
	
	
	public java.util.Date getOperatorTime() {
		return this.operatorTime;
	}
	
	public void setOperatorTime(java.util.Date value) {
		this.operatorTime = value;
	}
	
	
	public String getWorkOrderNo() {
		return this.workOrderNo;
	}
	
	public void setWorkOrderNo(String value) {
		this.workOrderNo = value;
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
	
	
	public Integer getOrderChangeReasonId() {
		return this.orderChangeReasonId;
	}
	
	public void setOrderChangeReasonId(Integer value) {
		this.orderChangeReasonId = value;
	}
	
	
	public String getOperatorReason() {
		return this.operatorReason;
	}
	
	public void setOperatorReason(String value) {
		this.operatorReason = value;
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

