
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcDevicePo extends BasePo {
	//alias
	public static final String TABLE_ALIAS = "SvcDevice";
	

	//columns START
    /**
     * 设备id       db_column: device_id   
     */ 	
	private Integer deviceId;
    /**
     * 服务大类id       db_column: big_class_id   
     */ 	
	private Integer bigClassId;
    /**
     * 设备名称       db_column: device_name   
     */ 	
	private String deviceName;
    /**
     * 开通图片url       db_column: open_pic_url   
     */ 	
	private String openPicUrl;
    /**
     * 服务介绍图片       db_column: service_introduce_pic   
     */ 	
	private String serviceIntroducePic;
    /**
     * 服务流程图片       db_column: service_flow_pic   
     */ 	
	private String serviceFlowPic;
    /**
     * 默认副标题       db_column: default_sub_title   
     */ 	
	private String defaultSubTitle;
    /**
     * 服务内容       db_column: service_content   
     */ 	
	private String serviceContent;
    /**
     * 服务说明       db_column: service_desc   
     */ 	
	private String serviceDesc;
    /**
     * 服务承诺       db_column: service_promise   
     */ 	
	private String servicePromise;
    /**
     * 预约方式（1-立即预约 2-电话预约）       db_column: reserve_type   
     */ 	
	private Integer reserveType;
    /**
     * 基础数据版本(1-旧版本，2-新版本)       db_column: base_data_version   
     */ 	
	private Integer baseDataVersion;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 创建时间       db_column: create_time   
     */ 	
	private java.util.Date createTime;
    /**
     * 更新人       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 更新时间       db_column: update_time   
     */ 	
	private java.util.Date updateTime;
    /**
     * 禁用flag，（0-启用，1-禁用）       db_column: off_flag   
     */ 	
	private Integer offFlag;
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
	//columns END


	
	
	public Integer getDeviceId() {
		return this.deviceId;
	}
	
	public void setDeviceId(Integer value) {
		this.deviceId = value;
	}
	
	
	public Integer getBigClassId() {
		return this.bigClassId;
	}
	
	public void setBigClassId(Integer value) {
		this.bigClassId = value;
	}
	
	
	public String getDeviceName() {
		return this.deviceName;
	}
	
	public void setDeviceName(String value) {
		this.deviceName = value;
	}
	
	
	public String getOpenPicUrl() {
		return this.openPicUrl;
	}
	
	public void setOpenPicUrl(String value) {
		this.openPicUrl = value;
	}
	
	
	public String getServiceIntroducePic() {
		return this.serviceIntroducePic;
	}
	
	public void setServiceIntroducePic(String value) {
		this.serviceIntroducePic = value;
	}
	
	
	public String getServiceFlowPic() {
		return this.serviceFlowPic;
	}
	
	public void setServiceFlowPic(String value) {
		this.serviceFlowPic = value;
	}
	
	
	public String getDefaultSubTitle() {
		return this.defaultSubTitle;
	}
	
	public void setDefaultSubTitle(String value) {
		this.defaultSubTitle = value;
	}
	
	
	public String getServiceContent() {
		return this.serviceContent;
	}
	
	public void setServiceContent(String value) {
		this.serviceContent = value;
	}
	
	
	public String getServiceDesc() {
		return this.serviceDesc;
	}
	
	public void setServiceDesc(String value) {
		this.serviceDesc = value;
	}
	
	
	public String getServicePromise() {
		return this.servicePromise;
	}
	
	public void setServicePromise(String value) {
		this.servicePromise = value;
	}
	
	
	public Integer getReserveType() {
		return this.reserveType;
	}
	
	public void setReserveType(Integer value) {
		this.reserveType = value;
	}
	
	
	public Integer getBaseDataVersion() {
		return this.baseDataVersion;
	}
	
	public void setBaseDataVersion(Integer value) {
		this.baseDataVersion = value;
	}
	
	
	public Integer getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(Integer value) {
		this.createUser = value;
	}
	
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	
	public Integer getUpdateUser() {
		return this.updateUser;
	}
	
	public void setUpdateUser(Integer value) {
		this.updateUser = value;
	}
	
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	
	
	public Integer getOffFlag() {
		return this.offFlag;
	}
	
	public void setOffFlag(Integer value) {
		this.offFlag = value;
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
	

	

}

