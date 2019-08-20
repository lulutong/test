package com.ecej.esmart.model.dto.input;

import java.io.Serializable;

/**
 * @author likai
 * 拒单入参PO
 *
 */
public class RefuseOrderInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8207268417877276264L;
	//1-用户app创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单", required = true
    private Integer requestSource;
    //订单来源
  	private Integer orderSource;
  	//电话号", required = true
  	private String phone;
  	//订单ID
  	private Integer workOrderId;
  	
	public Integer getRequestSource() {
		return requestSource;
	}
	public void setRequestSource(Integer requestSource) {
		this.requestSource = requestSource;
	}
	public Integer getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(Integer orderSource) {
		this.orderSource = orderSource;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getWorkOrderId() {
		return workOrderId;
	}
	public void setWorkOrderId(Integer workOrderId) {
		this.workOrderId = workOrderId;
	}
  	
}
