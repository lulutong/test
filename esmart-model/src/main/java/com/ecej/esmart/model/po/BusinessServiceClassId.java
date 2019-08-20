package com.ecej.esmart.model.po;

import java.io.Serializable;

public class BusinessServiceClassId implements Serializable{

	private static final long serialVersionUID = -2356200310584790209L;
	
	private Integer serviceClassId;
	private String businessKey;
	
	public Integer getServiceClassId() {
		return serviceClassId;
	}
	public void setServiceClassId(Integer serviceClassId) {
		this.serviceClassId = serviceClassId;
	}
	public String getBusinessKey() {
		return businessKey;
	}
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	
}
