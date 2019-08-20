package com.ecej.esmart.model.v4;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TimeTableResultV4 implements Serializable{

	//是否可用
	private boolean canUsed = false;
    //日期
	private Date workDate;
	//时间列表
	private List<TimeTablev4> timeTablev4List;

	public boolean isCanUsed() {
		return canUsed;
	}

	public void setCanUsed(boolean canUsed) {
		this.canUsed = canUsed;
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public List<TimeTablev4> getTimeTablev4List() {
		return timeTablev4List;
	}

	public void setTimeTablev4List(List<TimeTablev4> timeTablev4List) {
		this.timeTablev4List = timeTablev4List;
	}
}
