package com.ecej.esmart.model.dto.output;

public class ManuDispatchSendMessOutput implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	//订单号
	private String workOrderNo;
	//订单ID
	private Integer workOrderId;
	//员工ID
	private Integer empId;

	public String getWorkOrderNo() {
		return workOrderNo;
	}

	public void setWorkOrderNo(String workOrderNo) {
		this.workOrderNo = workOrderNo;
	}

	public Integer getWorkOrderId() {
		return workOrderId;
	}

	public void setWorkOrderId(Integer workOrderId) {
		this.workOrderId = workOrderId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
}
