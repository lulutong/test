package com.ecej.esmart.model.dto.input;

import java.io.Serializable;
import java.util.Date;

public class SystemRecommendPlanInput implements Serializable {

    private static final long serialVersionUID = 1961466896959093468L;
    private Integer stationId;//服务站ID
    private Date orderDate;//预约日期
    private Integer operType;//操作来源 1-手动推荐，2-定时任务

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOperType() {
        return operType;
    }

    public void setOperType(Integer operType) {
        this.operType = operType;
    }
}
