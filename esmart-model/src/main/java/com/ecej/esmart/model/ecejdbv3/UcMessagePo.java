
package com.ecej.esmart.model.ecejdbv3;

import com.ecej.nove.base.po.BasePo;

public class UcMessagePo extends BasePo {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "UcMessage";
	

	//columns START
    /**
     * 消息ID       db_column: MESSAGE_ID   
     */ 	
	private Long messageId;
    /**
     * 会员ID       db_column: MEMBER_ID   
     */ 	
	private Integer memberId;
    /**
     * 消息类型       db_column: MESSAGE_TYPE   
     */ 	
	private Integer messageType;
    /**
     * 消息标题       db_column: TITLE   
     */ 	
	private String title;
    /**
     * 消息内容       db_column: CONTENT   
     */ 	
	private String content;
    /**
     * 消息群发记录ID       db_column: GROUP_SEND_ID   
     */ 	
	private Integer groupSendId;
    /**
     * 创建用户       db_column: CREATE_USER   
     */ 	
	private Integer createUser;
    /**
     * 已读标识       db_column: READ_FLAG   
     */ 	
	private Integer readFlag;
    /**
     * APP隐藏标识       db_column: APP_HIDE_FLAG   
     */ 	
	private Integer appHideFlag;
    /**
     * 创建时间       db_column: CREATE_TIME   
     */ 	
	private java.util.Date createTime;
    /**
     * 数据创建时间       db_column: screate_time   
     */ 	
	private java.util.Date screateTime;
    /**
     * 数据更新时间       db_column: supdate_time   
     */ 	
	private java.util.Date supdateTime;
    /**
     * 删除标示 0 未删除 1 删除       db_column: del_flag   
     */ 	
	private Integer delFlag;
	//columns END


	
	
	public Long getMessageId() {
		return this.messageId;
	}
	
	public void setMessageId(Long value) {
		this.messageId = value;
	}
	
	
	public Integer getMemberId() {
		return this.memberId;
	}
	
	public void setMemberId(Integer value) {
		this.memberId = value;
	}
	
	
	public Integer getMessageType() {
		return this.messageType;
	}
	
	public void setMessageType(Integer value) {
		this.messageType = value;
	}
	
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	
	public Integer getGroupSendId() {
		return this.groupSendId;
	}
	
	public void setGroupSendId(Integer value) {
		this.groupSendId = value;
	}
	
	
	public Integer getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(Integer value) {
		this.createUser = value;
	}
	
	
	public Integer getReadFlag() {
		return this.readFlag;
	}
	
	public void setReadFlag(Integer value) {
		this.readFlag = value;
	}
	
	
	public Integer getAppHideFlag() {
		return this.appHideFlag;
	}
	
	public void setAppHideFlag(Integer value) {
		this.appHideFlag = value;
	}
	
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
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

