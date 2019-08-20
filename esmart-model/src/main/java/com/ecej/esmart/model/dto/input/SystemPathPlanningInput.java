package com.ecej.esmart.model.dto.input;

import java.io.Serializable;
import java.util.Date;

public class SystemPathPlanningInput implements Serializable {

    private static final long serialVersionUID = -8713873909203748004L;
    private Integer stationId;//服务站ID
    private Date workDate;//预约日期

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }
}
