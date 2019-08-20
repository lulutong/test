
package com.ecej.esmart.model.ecejservice;

import com.ecej.nove.base.po.BasePo;

public class EsmartOrderSourceParamSettingPo extends BasePo {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartOrderSourceParamSetting";
	

	//columns START
    /**
     * 订单来源参数配置id       db_column: order_source_param_setting_id   
     */ 	
	private Integer orderSourceParamSettingId;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 订单来源(1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单)       db_column: order_source   
     */ 	
	private Integer orderSource;
    /**
     * 未抢单时长(小时)       db_column: no_snatch_order_times   
     */ 	
	private Integer noSnatchOrderTimes;
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
     * 自动取消开关(0-开启，1-关闭)       db_column: order_flag   
     */ 	
	private Integer orderFlag;
    /**
     * 0:关单时间设置 1:用户预约开始时间       db_column: compute_type   
     */ 	
	private Integer computeType;
	//columns END


	
	
	public Integer getOrderSourceParamSettingId() {
		return this.orderSourceParamSettingId;
	}
	
	public void setOrderSourceParamSettingId(Integer value) {
		this.orderSourceParamSettingId = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public Integer getOrderSource() {
		return this.orderSource;
	}
	
	public void setOrderSource(Integer value) {
		this.orderSource = value;
	}
	
	
	public Integer getNoSnatchOrderTimes() {
		return this.noSnatchOrderTimes;
	}
	
	public void setNoSnatchOrderTimes(Integer value) {
		this.noSnatchOrderTimes = value;
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
	
	
	public Integer getOrderFlag() {
		return this.orderFlag;
	}
	
	public void setOrderFlag(Integer value) {
		this.orderFlag = value;
	}
	
	
	public Integer getComputeType() {
		return this.computeType;
	}
	
	public void setComputeType(Integer value) {
		this.computeType = value;
	}
	

	

}

