
package com.ecej.esmart.model.ecejservice;


import com.ecej.nove.base.po.BasePo;

public class EsmartGrabOrderPoolServiceAreaRelPo extends BasePo {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartGrabOrderPoolServiceAreaRel";


	//columns START
	/**
	 * 抢单池服务区域关联id       db_column: grab_order_pool_service_area_id
	 */
	private Integer grabOrderPoolServiceAreaId;
	/**
	 * 抢单池任务id       db_column: grab_order_pool_id
	 */
	private Integer grabOrderPoolId;
	/**
	 * 服务站id       db_column: station_id
	 */
	private Integer stationId;
	/**
	 * 服务区域ID       db_column: service_area_id
	 */
	private Integer serviceAreaId;
	/**
	 * 选中状态(0:未选中，1:选中)       db_column: check_flag
	 */
	private Integer checkFlag;
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
	 * 订单id       db_column: work_order_id
	 */
	private Integer workOrderId;
	//columns END




	public Integer getGrabOrderPoolServiceAreaId() {
		return this.grabOrderPoolServiceAreaId;
	}

	public void setGrabOrderPoolServiceAreaId(Integer value) {
		this.grabOrderPoolServiceAreaId = value;
	}


	public Integer getGrabOrderPoolId() {
		return this.grabOrderPoolId;
	}

	public void setGrabOrderPoolId(Integer value) {
		this.grabOrderPoolId = value;
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


	public Integer getCheckFlag() {
		return this.checkFlag;
	}

	public void setCheckFlag(Integer value) {
		this.checkFlag = value;
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


	public Integer getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}




}

