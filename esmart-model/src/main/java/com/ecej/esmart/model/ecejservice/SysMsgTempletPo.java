
package com.ecej.esmart.model.ecejservice;

import com.ecej.nove.base.po.BasePo;

public class SysMsgTempletPo extends BasePo{
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SysMsgTemplet";


	//columns START
	/**
	 * 消息模板id       db_column: templet_id
	 */
	private java.lang.Integer templetId;
	/**
	 * 消息类型(1-派工,2-预警,3-验证码,4-创建人员信息成功，5-薪酬信息，6-订单消息)       db_column: templet_type
	 */
	private Integer templetType;
	/**
	 * 推送时机（1-改约 2-取消 3-派工 4-获取验证码 5-前往 6-上门 7-升级 8-隐患下单 9-推到用户支付 10-订单完成 11-物料 12-员工收入 13-评价 14-创建人员，15-创建订单，16-抢单通知，17-抢单成功，18-拒单，19-跟催，20-出发,21-开始服务,22-关闭订单,23-退款通知）       db_column: push_opportunity
	 */
	private Integer pushOpportunity;
	/**
	 * 发送时间区分(1 全天 2 固定时间段)       db_column: send_time_flag
	 */
	private Integer sendTimeFlag;
	/**
	 * 发送时间开始       db_column: send_time_begin
	 */
	private java.lang.String sendTimeBegin;
	/**
	 * 发送时间结束       db_column: send_time_end
	 */
	private java.lang.String sendTimeEnd;
	/**
	 * 推送类型(1 用户消息 2 员工消息；多个时用逗号分隔)       db_column: push_type
	 */
	private java.lang.String pushType;
	/**
	 * 推送对象(1-多能工，2-站长,3-用户；多个时用逗号分隔)       db_column: push_object
	 */
	private java.lang.String pushObject;
	/**
	 * 推送方式(1 消息推送  2 APP消息 3短信；多个时用逗号分隔)       db_column: push_mode
	 */
	private java.lang.String pushMode;
	/**
	 * 离线发送短信flag(0-禁用 1-启用)       db_column: offline_send_flag
	 */
	private Integer offlineSendFlag;
	/**
	 * 禁用flag（0-未禁用 1-禁用）       db_column: forbidden_flag
	 */
	private Integer forbiddenFlag;
	/**
	 * 优先级(0:低, 1:高)       db_column: send_priority
	 */
	private Integer sendPriority;
	/**
	 * 消息标题       db_column: message_title
	 */
	private java.lang.String messageTitle;
	/**
	 * 推送内容       db_column: push_content
	 */
	private java.lang.String pushContent;
	/**
	 * 更新人       db_column: update_user
	 */
	private java.lang.Integer updateUser;
	/**
	 * 更新日期       db_column: update_time
	 */
	private java.util.Date updateTime;
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




	public java.lang.Integer getTempletId() {
		return this.templetId;
	}

	public void setTempletId(java.lang.Integer value) {
		this.templetId = value;
	}


	public Integer getTempletType() {
		return this.templetType;
	}

	public void setTempletType(Integer value) {
		this.templetType = value;
	}


	public Integer getPushOpportunity() {
		return this.pushOpportunity;
	}

	public void setPushOpportunity(Integer value) {
		this.pushOpportunity = value;
	}


	public Integer getSendTimeFlag() {
		return this.sendTimeFlag;
	}

	public void setSendTimeFlag(Integer value) {
		this.sendTimeFlag = value;
	}


	public java.lang.String getSendTimeBegin() {
		return this.sendTimeBegin;
	}

	public void setSendTimeBegin(java.lang.String value) {
		this.sendTimeBegin = value;
	}


	public java.lang.String getSendTimeEnd() {
		return this.sendTimeEnd;
	}

	public void setSendTimeEnd(java.lang.String value) {
		this.sendTimeEnd = value;
	}


	public java.lang.String getPushType() {
		return this.pushType;
	}

	public void setPushType(java.lang.String value) {
		this.pushType = value;
	}


	public java.lang.String getPushObject() {
		return this.pushObject;
	}

	public void setPushObject(java.lang.String value) {
		this.pushObject = value;
	}


	public java.lang.String getPushMode() {
		return this.pushMode;
	}

	public void setPushMode(java.lang.String value) {
		this.pushMode = value;
	}


	public Integer getOfflineSendFlag() {
		return this.offlineSendFlag;
	}

	public void setOfflineSendFlag(Integer value) {
		this.offlineSendFlag = value;
	}


	public Integer getForbiddenFlag() {
		return this.forbiddenFlag;
	}

	public void setForbiddenFlag(Integer value) {
		this.forbiddenFlag = value;
	}


	public Integer getSendPriority() {
		return this.sendPriority;
	}

	public void setSendPriority(Integer value) {
		this.sendPriority = value;
	}


	public java.lang.String getMessageTitle() {
		return this.messageTitle;
	}

	public void setMessageTitle(java.lang.String value) {
		this.messageTitle = value;
	}


	public java.lang.String getPushContent() {
		return this.pushContent;
	}

	public void setPushContent(java.lang.String value) {
		this.pushContent = value;
	}


	public java.lang.Integer getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(java.lang.Integer value) {
		this.updateUser = value;
	}


	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
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

