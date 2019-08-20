package com.ecej.esmart.model.dto.common;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
  *<p>类描述：</p>
  * @author 张佳恒[] 
  * @version: v1.0.0.1
  * @since JDK1.8
  *<p>创建日期：2016年11月10日 下午12:01:59</p>
  * Copyright 【新智泛能网络科技有限公司】 2016
 */
public class EmpTimeDistance implements Serializable{
	 
	
	private static final long serialVersionUID = 1L;

	//多能工id
	private Integer empId;
	
	//上门时间
	private Date workDateTime;
	
	//上下任务平均距离
	private BigDecimal distance;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Date getWorkDateTime() {
		return workDateTime;
	}

	public void setWorkDateTime(Date workDateTime) {
		this.workDateTime = workDateTime;
	}

	public BigDecimal getDistance() {
		return distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	
}
