
package com.ecej.esmart.model.ecejservice;


import java.util.List;

/**
 * 发送消息入参使用
 */
public class CommonMessagePo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/*
		信息类型
	 */
	private Integer typeId;
	/*
		订单ID
	 */
	private Integer workOrderId;
	/*
		员工ID集合
	 */
	private List<Integer> empIds;

	/*
		升级标志
	 */
	private Integer[] upgradeType;

	/*
	 *  B端商家ID
	 */
	private String threepartyMerchanId;

	/*
	 * 抢单通知推送方案（1.全部，2.熟识者）
	 */
	private Integer oftenEmpFlag = 1;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(Integer workOrderId) {
		this.workOrderId = workOrderId;
	}

	public List<Integer> getEmpIds() {
		return empIds;
	}

	public void setEmpIds(List<Integer> empIds) {
		this.empIds = empIds;
	}

	public Integer[] getUpgradeType() {
		return upgradeType;
	}

	public void setUpgradeType(Integer[] upgradeType) {
		this.upgradeType = upgradeType;
	}

	public String getThreepartyMerchanId() {
		return threepartyMerchanId;
	}

	public void setThreepartyMerchanId(String threepartyMerchanId) {
		this.threepartyMerchanId = threepartyMerchanId;
	}

	public Integer getOftenEmpFlag() {
		return oftenEmpFlag;
	}

	public void setOftenEmpFlag(Integer oftenEmpFlag) {
		this.oftenEmpFlag = oftenEmpFlag;
	}
}

