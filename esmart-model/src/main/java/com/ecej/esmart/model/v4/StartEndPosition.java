package com.ecej.esmart.model.v4;

import java.io.Serializable;
import java.math.BigDecimal;

public class StartEndPosition implements Serializable {

    /**
     * 请求来源
     * 1-用户app创建 4-运营平台 5-员工app 6-CRM10-商城下单
     * 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳
     * 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单
     */
    private Integer requestSource;

    /**
     * 请求唯一标示
     */
    private String guid;

    /**
     * 员工ID
     */
    private Integer empId;

    /**
     * 员工起始位置经度
     */
    private java.math.BigDecimal beginLocLong;

    /**
     * 员工起始位置纬度
     */
    private java.math.BigDecimal beginLocLat;

    /**
     * 员工截止位置经度
     */
    private java.math.BigDecimal endLocLong;

    /**
     * 员工截止位置纬度
     */
    private java.math.BigDecimal endLocLat;


    /**
     * 开始位置地址名称
     */
    private String beginLocDetail;

    /**
     * 截止位置地址名称
     */
    private String endLocDetail;


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public BigDecimal getBeginLocLong() {
        return beginLocLong;
    }

    public void setBeginLocLong(BigDecimal beginLocLong) {
        this.beginLocLong = beginLocLong;
    }

    public BigDecimal getBeginLocLat() {
        return beginLocLat;
    }

    public void setBeginLocLat(BigDecimal beginLocLat) {
        this.beginLocLat = beginLocLat;
    }

    public BigDecimal getEndLocLong() {
        return endLocLong;
    }

    public void setEndLocLong(BigDecimal endLocLong) {
        this.endLocLong = endLocLong;
    }

    public BigDecimal getEndLocLat() {
        return endLocLat;
    }

    public void setEndLocLat(BigDecimal endLocLat) {
        this.endLocLat = endLocLat;
    }

    public String getBeginLocDetail() {
        return beginLocDetail;
    }

    public void setBeginLocDetail(String beginLocDetail) {
        this.beginLocDetail = beginLocDetail;
    }

    public String getEndLocDetail() {
        return endLocDetail;
    }

    public void setEndLocDetail(String endLocDetail) {
        this.endLocDetail = endLocDetail;
    }


    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
