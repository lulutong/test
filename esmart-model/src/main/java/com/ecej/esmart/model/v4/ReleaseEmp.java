package com.ecej.esmart.model.v4;


/**
 * 描述: 师傅多能工
 *
 */
public class ReleaseEmp implements java.io.Serializable {

    /**
     * 请求来源
     * 1-用户app创建 4-运营平台 5-员工app 6-CRM10-商城下单
     * 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳
     * 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单
     */
    private Integer requestSource;

    /**
     * 订单编号
     */
    private String workOrderNo;

    /**
     * 请求唯一标示
     */
    private String guid;

    /**
     * 城市id
     */
    private Integer cityId;

    //1-上午 2-下午 3-晚上
    private Integer timeType;

    public Integer getTimeType() {
        return timeType;
    }

    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public ReleaseEmp() {
    }

    public ReleaseEmp(String workOrderNo, String guid, Integer cityId) {
        this.workOrderNo = workOrderNo;
        this.guid = guid;
        this.cityId = cityId;
    }

    public ReleaseEmp(Integer requestSource, String workOrderNo, String guid, Integer cityId) {
        this.requestSource = requestSource;
        this.workOrderNo = workOrderNo;
        this.guid = guid;
        this.cityId = cityId;
    }
}
