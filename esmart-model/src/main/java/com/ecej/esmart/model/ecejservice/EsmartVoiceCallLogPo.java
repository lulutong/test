
package com.ecej.esmart.model.ecejservice;

public class EsmartVoiceCallLogPo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartVoiceCallLog";
	

	//columns START
    /**
     * 语音电话日志id       db_column: voice_call_log_id   
     */ 	
	private Integer voiceCallLogId;
    /**
     * 订单编号       db_column: work_order_no   
     */ 	
	private String workOrderNo;
    /**
     * 接收者手机号       db_column: receive_mobile   
     */ 	
	private String receiveMobile;
    /**
     * 语音内容       db_column: content   
     */ 	
	private String content;
    /**
     * 拨打时间       db_column: call_time   
     */ 	
	private java.util.Date callTime;
    /**
     * 拨打尝试次数       db_column: call_retry_count   
     */ 	
	private Integer callRetryCount;
    /**
     * 拨打状态(0-已拨打，1-拨打失败)       db_column: call_status   
     */ 	
	private Integer callStatus;
    /**
     * 接听状态(0-未接听，1-已接听)       db_column: answer_status   
     */ 	
	private Integer answerStatus;
    /**
     * 服务返回code       db_column: service_back_code   
     */ 	
	private String serviceBackCode;
    /**
     * 服务返回描述       db_column: service_back_info   
     */ 	
	private String serviceBackInfo;
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


	
	
	public Integer getVoiceCallLogId() {
		return this.voiceCallLogId;
	}
	
	public void setVoiceCallLogId(Integer value) {
		this.voiceCallLogId = value;
	}
	
	
	public String getWorkOrderNo() {
		return this.workOrderNo;
	}
	
	public void setWorkOrderNo(String value) {
		this.workOrderNo = value;
	}
	
	
	public String getReceiveMobile() {
		return this.receiveMobile;
	}
	
	public void setReceiveMobile(String value) {
		this.receiveMobile = value;
	}
	
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	
	public java.util.Date getCallTime() {
		return this.callTime;
	}
	
	public void setCallTime(java.util.Date value) {
		this.callTime = value;
	}
	
	
	public Integer getCallRetryCount() {
		return this.callRetryCount;
	}
	
	public void setCallRetryCount(Integer value) {
		this.callRetryCount = value;
	}
	
	
	public Integer getCallStatus() {
		return this.callStatus;
	}
	
	public void setCallStatus(Integer value) {
		this.callStatus = value;
	}
	
	
	public Integer getAnswerStatus() {
		return this.answerStatus;
	}
	
	public void setAnswerStatus(Integer value) {
		this.answerStatus = value;
	}
	
	
	public String getServiceBackCode() {
		return this.serviceBackCode;
	}
	
	public void setServiceBackCode(String value) {
		this.serviceBackCode = value;
	}
	
	
	public String getServiceBackInfo() {
		return this.serviceBackInfo;
	}
	
	public void setServiceBackInfo(String value) {
		this.serviceBackInfo = value;
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

