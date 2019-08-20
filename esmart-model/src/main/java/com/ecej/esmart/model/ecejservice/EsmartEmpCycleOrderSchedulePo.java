
package com.ecej.esmart.model.ecejservice;
import java.io.Serializable;

public class EsmartEmpCycleOrderSchedulePo implements Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartEmpCycleOrderSchedule";
	

	//columns START
    /**
     * 虚拟档期id       db_column: emp_template_schedule_id   
     */ 	
	private Integer empTemplateScheduleId;
    /**
     * 父订单编号       db_column: order_no
     */
	private String orderNo;
    /**
     * 城市id       db_column: city_id
     */
	private Integer cityId;
    /**
     * 员工id       db_column: emp_id
     */
	private Integer empId;
    /**
     * 首次服务时间       db_column: first_service_time
     */
	private java.util.Date firstServiceTime;
    /**
     * 预计开始时间（hh:mm)       db_column: emp_expect_begin_time
     */
	private String empExpectBeginTime;
    /**
     * 预计上门时间（hh:mm)       db_column: emp_expect_visit_time
     */
	private String empExpectVisitTime;
    /**
     * 预计结束时间（hh:mm)       db_column: emp_expect_end_time
     */
	private String empExpectEndTime;
    /**
     * 周期频次：（YZYC 一周一次、LZYC 两周1次、YZDC 一周多次）       db_column: service_frequency
     */
	private String serviceFrequency;
    /**
     * 订单状态(1：服务中 2：暂停 3：取消)       db_column: order_status
     */
	private Integer orderStatus;
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
     * 周几(1-周一，2-周二，3-周三，4-周四，5-周五，6-周六，7-周日)       db_column: week_num
     */
	private Integer weekNum;
    /**
     * 1-单周，2-双周（以2018-1-1以基准，计算单双周）       db_column: week_type
     */
	private Integer weekType;
	//columns END

    /**
     * 手机号
     */
    private String phone;

    /**
     * GUID
     */
    private String guid;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getEmpTemplateScheduleId() {
		return this.empTemplateScheduleId;
	}

	public void setEmpTemplateScheduleId(Integer value) {
		this.empTemplateScheduleId = value;
	}


	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String value) {
		this.orderNo = value;
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


	public java.util.Date getFirstServiceTime() {
		return this.firstServiceTime;
	}

	public void setFirstServiceTime(java.util.Date value) {
		this.firstServiceTime = value;
	}


	public String getEmpExpectBeginTime() {
		return this.empExpectBeginTime;
	}

	public void setEmpExpectBeginTime(String value) {
		this.empExpectBeginTime = value;
	}


	public String getEmpExpectVisitTime() {
		return this.empExpectVisitTime;
	}

	public void setEmpExpectVisitTime(String value) {
		this.empExpectVisitTime = value;
	}


	public String getEmpExpectEndTime() {
		return this.empExpectEndTime;
	}

	public void setEmpExpectEndTime(String value) {
		this.empExpectEndTime = value;
	}


	public String getServiceFrequency() {
		return this.serviceFrequency;
	}

	public void setServiceFrequency(String value) {
		this.serviceFrequency = value;
	}


	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer value) {
		this.orderStatus = value;
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
	
	
	public Integer getWeekNum() {
		return this.weekNum;
	}
	
	public void setWeekNum(Integer value) {
		this.weekNum = value;
	}
	
	
	public Integer getWeekType() {
		return this.weekType;
	}
	
	public void setWeekType(Integer value) {
		this.weekType = value;
	}
	

	

}

