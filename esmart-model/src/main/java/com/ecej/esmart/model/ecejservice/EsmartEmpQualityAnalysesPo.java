
package com.ecej.esmart.model.ecejservice;

public class EsmartEmpQualityAnalysesPo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartEmpQualityAnalyses";
	

	//columns START
    /**
     * 员工质量分析id       db_column: emp_quality_analyses_id   
     */ 	
	private Integer empQualityAnalysesId;
    /**
     * 订单id       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 订单编号       db_column: work_order_no   
     */ 	
	private String workOrderNo;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 员工id       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 服务站id       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 订单创建时间       db_column: order_create_time   
     */ 	
	private java.util.Date orderCreateTime;
    /**
     * 派工时间       db_column: dispatch_time   
     */ 	
	private java.util.Date dispatchTime;
    /**
     * 员工预计出发时间       db_column: emp_expect_begin_time   
     */ 	
	private java.util.Date empExpectBeginTime;
    /**
     * 员工实际出发时间       db_column: emp_real_begin_time   
     */ 	
	private java.util.Date empRealBeginTime;
    /**
     * 员工预计上门时间       db_column: emp_expect_visit_time   
     */ 	
	private java.util.Date empExpectVisitTime;
    /**
     * 员工实际上门时间       db_column: emp_real_visit_time   
     */ 	
	private java.util.Date empRealVisitTime;
    /**
     * 员工预计完成时间       db_column: emp_expect_end_time   
     */ 	
	private java.util.Date empExpectEndTime;
    /**
     * 员工实际完成时间       db_column: emp_real_end_time   
     */ 	
	private java.util.Date empRealEndTime;
    /**
     * 预计在途时间       db_column: expect_way_time   
     */ 	
	private Integer expectWayTime;
    /**
     * 实际在途时间       db_column: real_way_time   
     */ 	
	private Integer realWayTime;
    /**
     * 标准服务耗时(预设服务耗时)       db_column: expect_consume_time   
     */ 	
	private Integer expectConsumeTime;
    /**
     * 实际服务耗时       db_column: real_consume   
     */ 	
	private Integer realConsume;
    /**
     * 创建订单时服务品类       db_column: create_service_class   
     */ 	
	private String createServiceClass;
    /**
     * 完成订单时服务品类       db_column: final_service_class   
     */ 	
	private String finalServiceClass;
    /**
     * 实际出发位置（经度，纬度）       db_column: real_begin_location   
     */ 	
	private String realBeginLocation;
    /**
     * 实际上门位置（经度，纬度）       db_column: real_arrive_location   
     */ 	
	private String realArriveLocation;
    /**
     * 实际完成位置（经度，纬度）       db_column: real_finish_location   
     */ 	
	private String realFinishLocation;
    /**
     * 上门位置偏差       db_column: arrive_distance_deviation   
     */ 	
	private java.math.BigDecimal arriveDistanceDeviation;
    /**
     * 完成订单位置偏差       db_column: finish_distance_deviation   
     */ 	
	private java.math.BigDecimal finishDistanceDeviation;
    /**
     * 服务耗时偏差       db_column: service_time_deviation   
     */ 	
	private Integer serviceTimeDeviation;
    /**
     * 实际在途距离       db_column: real_way_distance   
     */ 	
	private java.math.BigDecimal realWayDistance;
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
     * 经度       db_column: longitude   
     */ 	
	private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude   
     */ 	
	private java.math.BigDecimal latitude;
	//columns END


	
	
	public Integer getEmpQualityAnalysesId() {
		return this.empQualityAnalysesId;
	}
	
	public void setEmpQualityAnalysesId(Integer value) {
		this.empQualityAnalysesId = value;
	}
	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	
	
	public String getWorkOrderNo() {
		return this.workOrderNo;
	}
	
	public void setWorkOrderNo(String value) {
		this.workOrderNo = value;
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
	
	
	public java.util.Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	
	public void setOrderCreateTime(java.util.Date value) {
		this.orderCreateTime = value;
	}
	
	
	public java.util.Date getDispatchTime() {
		return this.dispatchTime;
	}
	
	public void setDispatchTime(java.util.Date value) {
		this.dispatchTime = value;
	}
	
	
	public java.util.Date getEmpExpectBeginTime() {
		return this.empExpectBeginTime;
	}
	
	public void setEmpExpectBeginTime(java.util.Date value) {
		this.empExpectBeginTime = value;
	}
	
	
	public java.util.Date getEmpRealBeginTime() {
		return this.empRealBeginTime;
	}
	
	public void setEmpRealBeginTime(java.util.Date value) {
		this.empRealBeginTime = value;
	}
	
	
	public java.util.Date getEmpExpectVisitTime() {
		return this.empExpectVisitTime;
	}
	
	public void setEmpExpectVisitTime(java.util.Date value) {
		this.empExpectVisitTime = value;
	}
	
	
	public java.util.Date getEmpRealVisitTime() {
		return this.empRealVisitTime;
	}
	
	public void setEmpRealVisitTime(java.util.Date value) {
		this.empRealVisitTime = value;
	}
	
	
	public java.util.Date getEmpExpectEndTime() {
		return this.empExpectEndTime;
	}
	
	public void setEmpExpectEndTime(java.util.Date value) {
		this.empExpectEndTime = value;
	}
	
	
	public java.util.Date getEmpRealEndTime() {
		return this.empRealEndTime;
	}
	
	public void setEmpRealEndTime(java.util.Date value) {
		this.empRealEndTime = value;
	}
	
	
	public Integer getExpectWayTime() {
		return this.expectWayTime;
	}
	
	public void setExpectWayTime(Integer value) {
		this.expectWayTime = value;
	}
	
	
	public Integer getRealWayTime() {
		return this.realWayTime;
	}
	
	public void setRealWayTime(Integer value) {
		this.realWayTime = value;
	}
	
	
	public Integer getExpectConsumeTime() {
		return this.expectConsumeTime;
	}
	
	public void setExpectConsumeTime(Integer value) {
		this.expectConsumeTime = value;
	}
	
	
	public Integer getRealConsume() {
		return this.realConsume;
	}
	
	public void setRealConsume(Integer value) {
		this.realConsume = value;
	}
	
	
	public String getCreateServiceClass() {
		return this.createServiceClass;
	}
	
	public void setCreateServiceClass(String value) {
		this.createServiceClass = value;
	}
	
	
	public String getFinalServiceClass() {
		return this.finalServiceClass;
	}
	
	public void setFinalServiceClass(String value) {
		this.finalServiceClass = value;
	}
	
	
	public String getRealBeginLocation() {
		return this.realBeginLocation;
	}
	
	public void setRealBeginLocation(String value) {
		this.realBeginLocation = value;
	}
	
	
	public String getRealArriveLocation() {
		return this.realArriveLocation;
	}
	
	public void setRealArriveLocation(String value) {
		this.realArriveLocation = value;
	}
	
	
	public String getRealFinishLocation() {
		return this.realFinishLocation;
	}
	
	public void setRealFinishLocation(String value) {
		this.realFinishLocation = value;
	}
	
	
	public java.math.BigDecimal getArriveDistanceDeviation() {
		return this.arriveDistanceDeviation;
	}
	
	public void setArriveDistanceDeviation(java.math.BigDecimal value) {
		this.arriveDistanceDeviation = value;
	}
	
	
	public java.math.BigDecimal getFinishDistanceDeviation() {
		return this.finishDistanceDeviation;
	}
	
	public void setFinishDistanceDeviation(java.math.BigDecimal value) {
		this.finishDistanceDeviation = value;
	}
	
	
	public Integer getServiceTimeDeviation() {
		return this.serviceTimeDeviation;
	}
	
	public void setServiceTimeDeviation(Integer value) {
		this.serviceTimeDeviation = value;
	}
	
	
	public java.math.BigDecimal getRealWayDistance() {
		return this.realWayDistance;
	}
	
	public void setRealWayDistance(java.math.BigDecimal value) {
		this.realWayDistance = value;
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
	

	

}

