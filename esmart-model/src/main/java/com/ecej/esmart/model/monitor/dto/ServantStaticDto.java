package com.ecej.esmart.model.monitor.dto;

/**
 * <p>
 *     统计服务员工人数
 * </p>
 *
 * @author kevin
 * @create 2018-09-11 12:00
 **/
public class ServantStaticDto {
    //城市ID
    private Integer cityId;
    //服务人员人数
    private Integer servantCount;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getServantCount() {
        return servantCount;
    }

    public void setServantCount(Integer servantCount) {
        this.servantCount = servantCount;
    }
}
