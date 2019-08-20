
package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

import java.util.Date;

/**
 * 用于查询该员工在该时间点是否有冲突订单
 * @author kevin
 * @Date 2018-08-08
 */
public class OrderConflictQueryInput extends BasePo{

	/**
	 * 员工ID
	 */
	private Integer empId;
	/**
	 * 起约开始时间
	 */
	private Date beginTime;
	/**
	 * 起约结束时间
	 */
	private Date endTime;

	/**
	 * guid
	 */
	private String guid;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}
}

