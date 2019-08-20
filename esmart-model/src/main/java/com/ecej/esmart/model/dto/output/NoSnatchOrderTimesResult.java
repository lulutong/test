package com.ecej.esmart.model.dto.output;

import com.ecej.nove.base.po.BasePo;

public class NoSnatchOrderTimesResult extends BasePo {
    private Integer times;

    public NoSnatchOrderTimesResult() {
    }

    public NoSnatchOrderTimesResult(Integer times) {
        this.times = times;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }
}
