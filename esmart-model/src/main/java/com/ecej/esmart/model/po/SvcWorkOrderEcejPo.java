package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcWorkOrderEcejPo extends BasePo {

    private static final long serialVersionUID = 4543880666399992786L;
    private Integer workOrderId;
    private Integer serviceItemId;
    private Integer quantity;

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getServiceItemId() {
        return serviceItemId;
    }

    public void setServiceItemId(Integer serviceItemId) {
        this.serviceItemId = serviceItemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
