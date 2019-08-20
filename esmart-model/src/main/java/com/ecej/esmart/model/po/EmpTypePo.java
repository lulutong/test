package com.ecej.esmart.model.po;

public class EmpTypePo {

    private Integer empId;//员工ID
    private Integer empType;//员工类型 1-多能工 2-站长
    private String mobileNo;//员工电话

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpType() {
        return empType;
    }

    public void setEmpType(Integer empType) {
        this.empType = empType;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
