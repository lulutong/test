
package com.ecej.esmart.model.v4;

public class EsmartWorkOrder implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartWorkOrderV4";
	

	//columns START
    /**
     * 派工4.0工单id       db_column: work_order_v4_id   
     */ 	
	private Integer workOrderV4Id;
    /**
     * 订单号       db_column: work_order_no   
     */ 	
	private String workOrderNo;
    /**
     * 订单ID       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 服务站id       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 服务区域ID       db_column: service_area_id   
     */ 	
	private Integer serviceAreaId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 预约开始时间       db_column: book_start_time   
     */ 	
	private java.util.Date bookStartTime;
    /**
     * 预约结束时间       db_column: book_end_time   
     */ 	
	private java.util.Date bookEndTime;
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
     * 经度       db_column: longitude   
     */ 	
	private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude   
     */ 	
	private java.math.BigDecimal latitude;
    /**
     * 0-未派单 1-已派单 2-取消 4-已完成,5-申领       db_column: dispatch_order_status   
     */ 	
	private Integer dispatchOrderStatus;
    /**
     * 派单类型(1-系统派工，2-后台派工，3-员工抢单)       db_column: dispatch_type   
     */ 	
	private Integer dispatchType;
    /**
     * 时间类型(1-上午，2-下午，3-晚上)       db_column: time_type   
     */ 	
	private Integer timeType;
    /**
     * 时间类型名称(1-上午，2-下午，3-晚上)       db_column: time_type_name   
     */ 	
	private String timeTypeName;
    /**
     * 升级单标识(0-非升级单 1-升级单)       db_column: upgrade_flag   
     */ 	
	private Integer upgradeFlag;
    /**
     * 订单组别       db_column: order_group   
     */ 	
	private String orderGroup;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 修改人       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 备用标示 0 可用 1删除       db_column: del_flag   
     */ 	
	private Integer delFlag;
    /**
     * 数据创建时间       db_column: create_time   
     */ 	
	private java.util.Date createTime;
    /**
     * 数据最后更新时间       db_column: update_time   
     */ 	
	private java.util.Date updateTime;
    /**
     * 用户ID       db_column: user_id   
     */ 	
	private Integer userId;
    /**
     * 员工id       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 服务耗时       db_column: service_hours   
     */ 	
	private Integer serviceHours;
	//columns END

	/**
	 * 占用库存状态  1  占用   0  没占用       db_column: inventory_state
	 */
	private Integer inventoryState;
	//columns END


	public Integer getInventoryState() {
		return inventoryState;
	}

	public void setInventoryState(Integer inventoryState) {
		this.inventoryState = inventoryState;
	}

	public Integer getWorkOrderV4Id() {
		return this.workOrderV4Id;
	}
	
	public void setWorkOrderV4Id(Integer value) {
		this.workOrderV4Id = value;
	}
	
	
	public String getWorkOrderNo() {
		return this.workOrderNo;
	}
	
	public void setWorkOrderNo(String value) {
		this.workOrderNo = value;
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
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
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
	
	
	public Integer getDispatchOrderStatus() {
		return this.dispatchOrderStatus;
	}
	
	public void setDispatchOrderStatus(Integer value) {
		this.dispatchOrderStatus = value;
	}
	
	
	public Integer getDispatchType() {
		return this.dispatchType;
	}
	
	public void setDispatchType(Integer value) {
		this.dispatchType = value;
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
	
	
	public Integer getUpgradeFlag() {
		return this.upgradeFlag;
	}
	
	public void setUpgradeFlag(Integer value) {
		this.upgradeFlag = value;
	}
	
	
	public String getOrderGroup() {
		return this.orderGroup;
	}
	
	public void setOrderGroup(String value) {
		this.orderGroup = value;
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
	
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getServiceHours() {
		return this.serviceHours;
	}
	
	public void setServiceHours(Integer value) {
		this.serviceHours = value;
	}
	

	

}

