package com.ecej.esmart.model.dto.input;

import java.util.List;

public class NoticeEmpInput {

    public NoticeEmpInput(){}

    public NoticeEmpInput(String workOrderNo, Integer optType, Integer empCat, List<Integer> empIdList) {
        this.workOrderNo = workOrderNo;
        this.optType = optType;
        this.empIdList = empIdList;
        this.empCat = empCat;
    }

    private String workOrderNo;
    private Integer optType;
    private List<Integer> empIdList;
    private Integer empCat;

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public List<Integer> getEmpIdList() {
        return empIdList;
    }

    public void setEmpIdList(List<Integer> empIdList) {
        this.empIdList = empIdList;
    }

    public Integer getEmpCat() {
        return empCat;
    }

    public void setEmpCat(Integer empCat) {
        this.empCat = empCat;
    }
}
