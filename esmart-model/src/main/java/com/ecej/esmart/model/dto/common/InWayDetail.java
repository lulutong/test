package com.ecej.esmart.model.dto.common;

import java.io.Serializable;
import com.ecej.esmart.model.ecejservice.SvcWorkOrderPo;

public class InWayDetail implements Serializable {

	private static final long serialVersionUID = 3378559406494400573L;
	//上一个订单
	private SvcWorkOrderPo last;
	//下一个订单
	private SvcWorkOrderPo next;
	//当前在途-来时在途
	private Integer comeInWay;
	//下个订单在途-走时在途
	private Integer goInWay;
	public SvcWorkOrderPo getLast() {
		return last;
	}
	public void setLast(SvcWorkOrderPo last) {
		this.last = last;
	}
	public SvcWorkOrderPo getNext() {
		return next;
	}
	public void setNext(SvcWorkOrderPo next) {
		this.next = next;
	}
	public Integer getComeInWay() {
		return comeInWay;
	}
	public void setComeInWay(Integer comeInWay) {
		this.comeInWay = comeInWay;
	}
	public Integer getGoInWay() {
		return goInWay;
	}
	public void setGoInWay(Integer goInWay) {
		this.goInWay = goInWay;
	}
	
}
