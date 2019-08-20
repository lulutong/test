package com.ecej.esmart.model.po;


import com.ecej.esmart.model.enums.DispatchTypeEnum;
import com.ecej.esmart.model.enums.WarnTypeEnum;

import java.util.Date;

public class DispatchHistoryInputPo implements java.io.Serializable {

    /**
     * 订单号
     */
    private String workOrderNo;

    /**
     * 操作人ID (领取任务存员工ID 站长派工存站长ID 其他存0)
     */
    private Integer operatorId;

    /**
     * 操作姓名
     */
    private String operatorName;

    /**
     * 派工类型枚举
     */
    private DispatchTypeEnum dispatchTypeEnum;

    /**
     * 预警类型枚举
     */
    private WarnTypeEnum warnTypeEnum;

    /**
     * 预约开始时间
     */
    private Date bookStartTime;

    /**
     * 城市id
     */
    private Integer cityId;

    /**
     * 公司ID
     */
    private Integer companyId;

    /**
     * 服务站id
     */
    private Integer stationId;

    /**
     * 服务区域ID
     */
    private Integer serviceAreaId;

    /**
     * 员工位置信息 json 串
     */
    private String empPositionJson;

    private String serviceJson;

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public DispatchTypeEnum getDispatchTypeEnum() {
        return dispatchTypeEnum;
    }

    public void setDispatchTypeEnum(DispatchTypeEnum dispatchTypeEnum) {
        this.dispatchTypeEnum = dispatchTypeEnum;
    }

    public WarnTypeEnum getWarnTypeEnum() {
        return warnTypeEnum;
    }

    public void setWarnTypeEnum(WarnTypeEnum warnTypeEnum) {
        this.warnTypeEnum = warnTypeEnum;
    }

    public Date getBookStartTime() {
        return bookStartTime;
    }

    public void setBookStartTime(Date bookStartTime) {
        this.bookStartTime = bookStartTime;
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

    public Integer getServiceAreaId() {
        return serviceAreaId;
    }

    public void setServiceAreaId(Integer serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    public String getEmpPositionJson() {
        return empPositionJson;
    }

    public void setEmpPositionJson(String empPositionJson) {
        this.empPositionJson = empPositionJson;
    }

    public String getServiceJson() {
        return serviceJson;
    }

    public void setServiceJson(String serviceJson) {
        this.serviceJson = serviceJson;
    }
}
