package com.ecej.esmart.model.dto.output;

import java.io.Serializable;
import java.util.Date;

public class ExpirationTimeOutput implements Serializable{
	
	private static final long serialVersionUID = 7577356631328511660L;

	/**
     *	截止关单时间差：精确到秒
	 */
	private long expirationTimeInterval;
	/**
     * 关单截止时间
	 */
	private Date expirationTime;

	public long getExpirationTimeInterval() {
		return expirationTimeInterval;
	}

	public void setExpirationTimeInterval(long expirationTimeInterval) {
		this.expirationTimeInterval = expirationTimeInterval;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
}
