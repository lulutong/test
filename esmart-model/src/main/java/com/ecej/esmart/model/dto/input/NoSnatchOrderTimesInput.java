package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

public class NoSnatchOrderTimesInput extends BasePo {

    private Integer orderSource;
    private Integer cityId;

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
