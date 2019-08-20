package com.ecej.esmart.model.dto.output;

import java.util.Date;

public class RecommDateResult implements java.io.Serializable{

	private static final long serialVersionUID = -6362787115705983824L;
	
	
	private Date date;
	
	//0繁忙   1非繁忙
	private Integer state;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
	
}
