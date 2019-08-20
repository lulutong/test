package com.ecej.esmart.model.dto.output;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FirstServiceTimeEntity implements Serializable,Comparable<FirstServiceTimeEntity>{

	private static final long serialVersionUID = -3473226501952819201L;
	
	SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd E",Locale.CHINA);
	
	private Date firstServiceTime;
	private Integer serviceStatus;
	private Integer title;

	public Date getFirstServiceTime() {
		return firstServiceTime;
	}
	public String getFirstServiceTimeString() {
		return ymd.format(firstServiceTime);
	}

	public void setFirstServiceTime(Date firstServiceTime) {
		this.firstServiceTime = firstServiceTime;
	}
	@Override
	public int compareTo(FirstServiceTimeEntity o) {
		return this.firstServiceTime.compareTo(o.getFirstServiceTime());
		
	}
	public Integer getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(Integer serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public String getTitle() {
		
		String result = null;
		
		switch (title.intValue()) {
		case 1:result = "周一";  break;
		case 2:result = "周二";  break;
		case 3:result = "周三";  break;
		case 4:result = "周四";  break;
		case 5:result = "周五";  break;
		case 6:result = "周六";  break;
		case 7:result = "周日";  break;
		default:break;
		}
		
		return result;
	}
	public void setTitle(Integer title) {
		this.title = title;
	}
	
}
