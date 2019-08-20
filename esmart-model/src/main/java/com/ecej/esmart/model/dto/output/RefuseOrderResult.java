package com.ecej.esmart.model.dto.output;

public class RefuseOrderResult implements java.io.Serializable {

    /**
     * 派工状态 0-未派单 1-已派单 2-取消
     */
    private Integer dipatchStatus;


    public Integer getDipatchStatus() {
        return dipatchStatus;
    }

    public void setDipatchStatus(Integer dipatchStatus) {
        this.dipatchStatus = dipatchStatus;
    }
}
