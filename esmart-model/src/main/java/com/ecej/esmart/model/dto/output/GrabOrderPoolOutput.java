package com.ecej.esmart.model.dto.output;

import java.util.Date;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/4/9 10:44
 **/
public class GrabOrderPoolOutput {
    /**
     * 订单ID
     */
    private Integer workOrderId;
    /**
     * 订单号
     */
    private String workOrderNo;
    /**
     * 订单来源
     */
    private Integer orderSource;
    /**
     * 用户预约开始时间
     */
    private Date bookStartTime;
    /**
     * 数据创建时间
     */
    private Date screateTime;

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

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Date getBookStartTime() {
        return bookStartTime;
    }

    public void setBookStartTime(Date bookStartTime) {
        this.bookStartTime = bookStartTime;
    }

    public Date getScreateTime() {
        return screateTime;
    }

    public void setScreateTime(Date screateTime) {
        this.screateTime = screateTime;
    }
}
