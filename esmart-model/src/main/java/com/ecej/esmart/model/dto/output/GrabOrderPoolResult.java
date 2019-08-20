package com.ecej.esmart.model.dto.output;

import com.ecej.nove.base.po.BasePo;

import java.util.List;

public class GrabOrderPoolResult extends BasePo {

    private List<Integer> orderIds;

    public GrabOrderPoolResult() {
    }

    public GrabOrderPoolResult(List<Integer> orderIds) {
        this.orderIds = orderIds;
    }

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Integer> orderIds) {
        this.orderIds = orderIds;
    }
}
