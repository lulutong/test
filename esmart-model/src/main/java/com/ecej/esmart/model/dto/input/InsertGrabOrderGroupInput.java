package com.ecej.esmart.model.dto.input;

public class InsertGrabOrderGroupInput {

    public InsertGrabOrderGroupInput() {
    }

    public InsertGrabOrderGroupInput(String workOrderNo, Integer payType) {
        this.workOrderNo = workOrderNo;
        this.payType = payType;
    }

    /**
     * 订单号
     */
    private String workOrderNo;

    /**
     * 1 前置支付  2 后置支付
     */
    private Integer payType;

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }
}
