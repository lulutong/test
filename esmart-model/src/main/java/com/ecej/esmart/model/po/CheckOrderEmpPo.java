package com.ecej.esmart.model.po;

import java.io.Serializable;
import java.util.List;

public class CheckOrderEmpPo implements Serializable {

    private static final long serialVersionUID = -1540809147919444291L;
    private  Integer workOrderId;//订单ID
    private String workOrderNo;//订单编号
    private Integer empId;//员工ID
    private String groupId;//订单组别
    private List<Integer> workOrderList;//页面调整的订单列表

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

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<Integer> getWorkOrderList() {
        return workOrderList;
    }

    public void setWorkOrderList(List<Integer> workOrderList) {
        this.workOrderList = workOrderList;
    }
}
