package com.ecej.esmart.model.dto.common;


import java.io.Serializable;

/**
 * @author kevin
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/14 14:33
 **/
public class MessageEmpDto implements Serializable {

    private static final long serialVersionUID = 5511028752382224584L;
    /**
     * 员工ID
     */
    private Integer empId;
    /**
     * 员工联系电话
     */
    private String empMobileNo;
    /**
     * 订单ID
     */
    private Integer workOrderId;
    /**
     * 订单号
     */
    private String workOrderNo;
    /**
     * 预约时间 例：2019-03-14 08:00-11:00
     */
    private String appointTime;
    /**
     * 用户地址 community + detailAddress (订单表)
     */
    private String userAddress;
    /**
     * 用户联系电话
     */
    private String userMobileNo;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpMobileNo() {
        return empMobileNo;
    }

    public void setEmpMobileNo(String empMobileNo) {
        this.empMobileNo = empMobileNo;
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

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }
}