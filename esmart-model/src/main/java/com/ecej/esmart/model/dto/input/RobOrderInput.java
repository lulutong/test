package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

public class RobOrderInput extends BasePo {
    private Integer requestSource;
    private String phone;
    private Integer empId;
    private Integer workOrderId;
    private String workOrderNo;

    private Boolean verifyRobOrder = false;

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

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

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

    public Boolean getVerifyRobOrder() {
        return verifyRobOrder;
    }

    public void setVerifyRobOrder(Boolean verifyRobOrder) {
        this.verifyRobOrder = verifyRobOrder;
    }
}
