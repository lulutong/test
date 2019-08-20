
package com.ecej.esmart.model.ecejservice;

public class EsmartEmpWorkAnalysesPo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartEmpWorkAnalyses";
	

	//columns START
    /**
     * 劳效分析id       db_column: work_analyses_id   
     */ 	
	private Integer workAnalysesId;
    /**
     * 城市ID       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 公司ID       db_column: company_id   
     */ 	
	private Integer companyId;
    /**
     * 服务站ID       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 员工ID       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 统计日期       db_column: statistic_date   
     */ 	
	private java.util.Date statisticDate;
    /**
     * 出勤时长       db_column: duty_work_time   
     */ 	
	private Integer dutyWorkTime;
    /**
     * 预计路途总时长       db_column: emp_expect_way_sum_time   
     */ 	
	private Integer empExpectWaySumTime;
    /**
     * 预计工作总时长       db_column: emp_expect_work_sum_time   
     */ 	
	private Integer empExpectWorkSumTime;
    /**
     * 路途总时长       db_column: emp_rel_way_sum_time   
     */ 	
	private Integer empRelWaySumTime;
    /**
     * 工作总时长       db_column: emp_rel_work_sum_time   
     */ 	
	private Integer empRelWorkSumTime;
    /**
     * 订单总数量       db_column: order_count   
     */ 	
	private Integer orderCount;
    /**
     * 项目总数量       db_column: project_count   
     */ 	
	private Integer projectCount;
    /**
     * 计提       db_column: emp_sum_income   
     */ 	
	private java.math.BigDecimal empSumIncome;
    /**
     * 订单实收       db_column: order_sum_paid_money   
     */ 	
	private java.math.BigDecimal orderSumPaidMoney;
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
	//columns END


	
	
	public Integer getWorkAnalysesId() {
		return this.workAnalysesId;
	}
	
	public void setWorkAnalysesId(Integer value) {
		this.workAnalysesId = value;
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
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public java.util.Date getStatisticDate() {
		return this.statisticDate;
	}
	
	public void setStatisticDate(java.util.Date value) {
		this.statisticDate = value;
	}
	
	
	public Integer getDutyWorkTime() {
		return this.dutyWorkTime;
	}
	
	public void setDutyWorkTime(Integer value) {
		this.dutyWorkTime = value;
	}
	
	
	public Integer getEmpExpectWaySumTime() {
		return this.empExpectWaySumTime;
	}
	
	public void setEmpExpectWaySumTime(Integer value) {
		this.empExpectWaySumTime = value;
	}
	
	
	public Integer getEmpExpectWorkSumTime() {
		return this.empExpectWorkSumTime;
	}
	
	public void setEmpExpectWorkSumTime(Integer value) {
		this.empExpectWorkSumTime = value;
	}
	
	
	public Integer getEmpRelWaySumTime() {
		return this.empRelWaySumTime;
	}
	
	public void setEmpRelWaySumTime(Integer value) {
		this.empRelWaySumTime = value;
	}
	
	
	public Integer getEmpRelWorkSumTime() {
		return this.empRelWorkSumTime;
	}
	
	public void setEmpRelWorkSumTime(Integer value) {
		this.empRelWorkSumTime = value;
	}
	
	
	public Integer getOrderCount() {
		return this.orderCount;
	}
	
	public void setOrderCount(Integer value) {
		this.orderCount = value;
	}
	
	
	public Integer getProjectCount() {
		return this.projectCount;
	}
	
	public void setProjectCount(Integer value) {
		this.projectCount = value;
	}
	
	
	public java.math.BigDecimal getEmpSumIncome() {
		return this.empSumIncome;
	}
	
	public void setEmpSumIncome(java.math.BigDecimal value) {
		this.empSumIncome = value;
	}
	
	
	public java.math.BigDecimal getOrderSumPaidMoney() {
		return this.orderSumPaidMoney;
	}
	
	public void setOrderSumPaidMoney(java.math.BigDecimal value) {
		this.orderSumPaidMoney = value;
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
	

	

}

