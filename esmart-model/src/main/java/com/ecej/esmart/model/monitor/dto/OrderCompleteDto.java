package com.ecej.esmart.model.monitor.dto;

/**
 * <p>
 *     sm.platformworker.order.completed.fanout.exchange
 *     订单完成PO
 * </p>
 *
 * @author kevin
 * @create 2018-09-11 12:00
 **/
public class OrderCompleteDto {
    //订单号
    private String workOrderNo;
    //完成时间
    private Long completedTime;
    //公司ID
    private Integer companyId;

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Long getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
