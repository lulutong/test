
package com.ecej.esmart.model.ecejservice;


public class EsmartExpectFinishOrderPo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartExpectFinishOrder";
	

	//columns START
    /**
     * 预估完单量ID       db_column: expect_finish_order_id   
     */ 	
	private Integer expectFinishOrderId;
    /**
     * 服务站ID       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 周几(1-周一，2-周二，3-周三，4-周四，5-周五，6-周六，7-周日)       db_column: week_num   
     */ 	
	private Integer weekNum;
    /**
     * 可选时间(1-上午，2-下午，3-晚上)       db_column: option_type   
     */ 	
	private Integer optionType;
    /**
     * 接单量       db_column: order_num   
     */ 	
	private Integer orderNum;
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


	
	
	public Integer getExpectFinishOrderId() {
		return this.expectFinishOrderId;
	}
	
	public void setExpectFinishOrderId(Integer value) {
		this.expectFinishOrderId = value;
	}
	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	
	public Integer getWeekNum() {
		return this.weekNum;
	}
	
	public void setWeekNum(Integer value) {
		this.weekNum = value;
	}
	
	
	public Integer getOptionType() {
		return this.optionType;
	}
	
	public void setOptionType(Integer value) {
		this.optionType = value;
	}
	
	
	public Integer getOrderNum() {
		return this.orderNum;
	}
	
	public void setOrderNum(Integer value) {
		this.orderNum = value;
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

