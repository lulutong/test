
package com.ecej.esmart.model.ecejservice;

public class EsmartExpectFinishOrderHisPo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartExpectFinishOrderHis";
	
	//columns START
    /**
     * 接单量历史ID       db_column: expect_finish_order_his_id   
     */ 	
	private Integer expectFinishOrderHisId;
    /**
     * 服务站ID       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 接单日期       db_column: work_date   
     */ 	
	private java.util.Date workDate;
    /**
     * 可选时间(1-上午，2-下午，3-晚上)       db_column: option_type   
     */ 	
	private Integer optionType;
    /**
     * 已接单量       db_column: already_order_num   
     */ 	
	private Integer alreadyOrderNum;
    /**
     * 可接单量       db_column: order_num   
     */ 	
	private Integer orderNum;
    /**
     * 剩余单量       db_column: residue_num   
     */ 	
	private Integer residueNum;
    /**
     * 触发时间       db_column: trigger_time   
     */ 	
	private java.sql.Timestamp triggerTime;
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


	
	
	public Integer getExpectFinishOrderHisId() {
		return this.expectFinishOrderHisId;
	}
	
	public void setExpectFinishOrderHisId(Integer value) {
		this.expectFinishOrderHisId = value;
	}
	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	
	public java.util.Date getWorkDate() {
		return this.workDate;
	}
	
	public void setWorkDate(java.util.Date value) {
		this.workDate = value;
	}
	
	
	public Integer getOptionType() {
		return this.optionType;
	}
	
	public void setOptionType(Integer value) {
		this.optionType = value;
	}
	
	
	public Integer getAlreadyOrderNum() {
		return this.alreadyOrderNum;
	}
	
	public void setAlreadyOrderNum(Integer value) {
		this.alreadyOrderNum = value;
	}
	
	
	public Integer getOrderNum() {
		return this.orderNum;
	}
	
	public void setOrderNum(Integer value) {
		this.orderNum = value;
	}
	
	
	public Integer getResidueNum() {
		return this.residueNum;
	}
	
	public void setResidueNum(Integer value) {
		this.residueNum = value;
	}
	
	
	public java.sql.Timestamp getTriggerTime() {
		return this.triggerTime;
	}
	
	public void setTriggerTime(java.sql.Timestamp value) {
		this.triggerTime = value;
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

