package com.ecej.esmart.model.v4;

import java.util.Date;
import java.util.List;

public class FindDispatchWork implements java.io.Serializable  {

    private double latitude;//纬度
    private double longitude;//经度
    private Integer requestSource;//请求来源
    private Boolean areaBanningOrder;//是否执行服务区域禁止接单 规则 true 执行，false 不执行
    private Integer cityId;//
    private Integer companyId;//
    private Integer stationId;//
    private List<Integer> skillLabelIdList;//
    private List<Integer> serviceClassList;//
    private Integer model; //0 白班 1夜班
    private List<Integer> dispatchType;// 员工类型
    private Date scheduleDate;//城市夜班员工值班日期

    public List<Integer> getDispatchType() {
        return dispatchType;
    }

    public void setDispatchType(List<Integer> dispatchType) {
        this.dispatchType = dispatchType;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public Boolean getAreaBanningOrder() {
        return areaBanningOrder;
    }

    public void setAreaBanningOrder(Boolean areaBanningOrder) {
        this.areaBanningOrder = areaBanningOrder;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public List<Integer> getSkillLabelIdList() {
        return skillLabelIdList;
    }

    public void setSkillLabelIdList(List<Integer> skillLabelIdList) {
        this.skillLabelIdList = skillLabelIdList;
    }

    public List<Integer> getServiceClassList() {
        return serviceClassList;
    }

    public void setServiceClassList(List<Integer> serviceClassList) {
        this.serviceClassList = serviceClassList;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }


}
