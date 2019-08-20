package com.ecej.esmart.model.po;

import java.io.Serializable;
import java.util.List;

public class PathPlanningPo implements Serializable {

    private static final long serialVersionUID = 7823707270174471235L;
    private String groupId;//订单组别ID
    private List<Integer> workOrderId;//订单列表
    private Integer empId;//员工ID
    private Integer operType;//操作类型(1-人员对调，2-派单)

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<Integer> getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(List<Integer> workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getOperType() {
        return operType;
    }

    public void setOperType(Integer operType) {
        this.operType = operType;
    }
}
