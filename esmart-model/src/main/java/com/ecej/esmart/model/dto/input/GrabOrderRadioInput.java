package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

public class GrabOrderRadioInput extends BasePo {

    /**
     * 订单ID
     */
    private Integer workOrderId;

    public GrabOrderRadioInput() {

    }

    public GrabOrderRadioInput(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }
}
