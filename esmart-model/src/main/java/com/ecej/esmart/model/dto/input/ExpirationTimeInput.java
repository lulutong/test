package com.ecej.esmart.model.dto.input;

import java.io.Serializable;

public class ExpirationTimeInput implements Serializable{
	
	private static final long serialVersionUID = 7577356631328511660L;

	/**
	 * 1-用户app创建 4-运营平台 5-员工app 6-CRM
	 * 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心
	 * 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单
	 */
	private Integer requestSource;
	/**
	 * 订单ID
	 */
	private Integer workOrderId;

	public Integer getRequestSource() {
		return requestSource;
	}

	public void setRequestSource(Integer requestSource) {
		this.requestSource = requestSource;
	}

	public Integer getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(Integer workOrderId) {
		this.workOrderId = workOrderId;
	}
}
