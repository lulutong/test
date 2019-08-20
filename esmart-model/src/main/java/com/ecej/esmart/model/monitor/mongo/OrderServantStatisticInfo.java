package com.ecej.esmart.model.monitor.mongo;

/**
 * <p>订单员工统计信息</p>
 *
 * @author kevin
 * @create 2018-09-11 16:00
 **/
public class OrderServantStatisticInfo {
    /**
     * 统计日期 yyyy-mm-dd
     */
    private String statisticDate;
    /**
     * 城市ID
     */
    private Integer cityId;
    /**
     * 订单总数
     */
    private Integer orderCount;
    /**
     * 订单完成总数
     */
    private Integer orderFinishCount;
    /**
     * 服务人员总数
     */
    private Integer servantCount;

    public String getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(String statisticDate) {
        this.statisticDate = statisticDate;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getOrderFinishCount() {
        return orderFinishCount;
    }

    public void setOrderFinishCount(Integer orderFinishCount) {
        this.orderFinishCount = orderFinishCount;
    }

    public Integer getServantCount() {
        return servantCount;
    }

    public void setServantCount(Integer servantCount) {
        this.servantCount = servantCount;
    }
}
