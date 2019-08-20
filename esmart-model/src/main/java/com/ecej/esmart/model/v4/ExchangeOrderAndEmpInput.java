package com.ecej.esmart.model.v4;

import java.io.Serializable;
import java.util.Date;

public class ExchangeOrderAndEmpInput implements Serializable {
    private Integer requestSource;
    private Integer orderSource;
    private String guid;
    private String groupId;
    private Integer stationId;
    private Integer cityId;
    private Integer empId;
    private Date workDate;


    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }
}
