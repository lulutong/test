package com.ecej.esmart.model.v4;

public class EmpInfoV4 implements java.io.Serializable{
    /**
     * 员工ID
     */
    private Integer empId;
    /**
     * 手机号
     */
    private String mobileNo;
    /**
     * 姓名
     */
    private String empName;
    /**
     * 订单数量
     */
    private Integer orderSize;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(Integer orderSize) {
        this.orderSize = orderSize;
    }
}
