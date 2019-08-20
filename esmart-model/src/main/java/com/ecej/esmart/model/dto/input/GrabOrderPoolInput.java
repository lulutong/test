package com.ecej.esmart.model.dto.input;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/4/9 10:42
 **/
public class GrabOrderPoolInput {
    /**
     * 订单ID
     */
    private Integer workOrderId;
    /**
     * 开始时间
     */
    private String beginTime;
    /**
     * 结束时间
     */
    private String endTime;

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
