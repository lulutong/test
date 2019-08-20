package com.ecej.esmart.model.dto.common;

import java.io.Serializable;
import java.util.Date;

public class CycleLockCache implements Serializable{

	private static final long serialVersionUID = 8180524716579263624L;

	private Integer empId;
	
	private Integer lockTime;
	
	private Date createTime;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getLockTime() {
		return lockTime;
	}

	public void setLockTime(Integer lockTime) {
		this.lockTime = lockTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
