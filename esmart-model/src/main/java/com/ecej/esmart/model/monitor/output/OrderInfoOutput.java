package com.ecej.esmart.model.monitor.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *     派工监控推送订单信息
 * </p>
 *
 * @author kevin
 * @create 2018-09-11 11:00
 **/
public class OrderInfoOutput implements Serializable{
    private static final long serialVersionUID = 461900815434592315L;

    /**
     * 城市ID
     */
    private Integer cityId;
    /**
     * 订单ID
     */
    private Integer workOrderId;
    /**
     * 订单号
     */
    private String workOrderNo;
    /**
     * 订单推送状态
     * 已承接订单：（ACCORDER）出发预警：（DEPWARN）未承接订单：（UNACCORDER）服务中订单：（SERVICING）已完成订单：（FINISHED）已取消订单：（CANCELED）
     */
    private String orderStatusFlag;
    /**
     * 经度
     */
    private BigDecimal longitude;
    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 告警时间
     * yyyy-MM-dd HH:mm:ss
     */
    private String warnTime;
    /**
     * 关单时长
     */
    private BigDecimal closeOrderTime;

    /**
     * 订单服务品类ID集合
     */
    private Integer[] serviceClassIds;

    /**
     * 经纬度
     */
    private BigDecimal[] value;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getOrderStatusFlag() {
        return orderStatusFlag;
    }

    public void setOrderStatusFlag(String orderStatusFlag) {
        this.orderStatusFlag = orderStatusFlag;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getWarnTime() {
        return warnTime;
    }

    public void setWarnTime(String warnTime) {
        this.warnTime = warnTime;
    }

    public BigDecimal getCloseOrderTime() {
        return closeOrderTime;
    }

    public void setCloseOrderTime(BigDecimal closeOrderTime) {
        this.closeOrderTime = closeOrderTime;
    }

    public Integer[] getServiceClassIds() {
        return serviceClassIds;
    }

    public void setServiceClassIds(Integer[] serviceClassIds) {
        this.serviceClassIds = serviceClassIds;
    }

    public BigDecimal[] getValue() {
        return value;
    }

    public void setValue(BigDecimal[] value) {
        this.value = value;
    }
}
