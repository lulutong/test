package com.ecej.esmart.model.dto.input;

import java.io.Serializable;

/**
 * 工长--师傅列表实体
 * cxz
 * 2018/6/22 日期
 */
public class ForemanEmployeeListInput implements Serializable {
    private String guid;
    private Integer requestSource;
    private String phone;
    private String workOrderNo;
    private Integer masterWorkerId;
    private Integer workerType;
    private Integer workerId;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Integer getMasterWorkerId() {
        return masterWorkerId;
    }

    public void setMasterWorkerId(Integer masterWorkerId) {
        this.masterWorkerId = masterWorkerId;
    }

    public Integer getWorkerType() {
        return workerType;
    }

    public void setWorkerType(Integer workerType) {
        this.workerType = workerType;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }
}
