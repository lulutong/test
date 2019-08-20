package com.ecej.esmart.model.dto.common;

import java.io.Serializable;
import java.util.List;

public class OrderServiceClassList implements Serializable{

	
	private static final long serialVersionUID = 1501561337379213058L;

	private List<ServiceClassAndNum> childOrder;
	
	private Integer skillLabelId;
	
	private int orderStatus;//是否允许下单0不可用1可用
	
	private int orderModel;//1-动态派工，2-抢单模式，3-派单模式
	
	private String businessKey;

	public List<ServiceClassAndNum> getChildOrder() {
		return childOrder;
	}

	public void setChildOrder(List<ServiceClassAndNum> childOrder) {
		this.childOrder = childOrder;
	}

	public Integer getSkillLabelId() {
		return skillLabelId;
	}

	public void setSkillLabelId(Integer skillLabelId) {
		this.skillLabelId = skillLabelId;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderModel() {
		return orderModel;
	}

	public void setOrderModel(int orderModel) {
		this.orderModel = orderModel;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

}
