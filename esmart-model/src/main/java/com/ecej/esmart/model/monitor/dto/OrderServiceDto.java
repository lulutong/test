package com.ecej.esmart.model.monitor.dto;

/**
 * <p>
 *     sm.platformworker.order.service.operation.fanout.exchange
 *     对应的信息po
 * </p>
 *
 * @author kevin
 * @create 2018-09-11 12:00
 **/
public class OrderServiceDto {
    /**
     * 操作类型 1-出发 2-开始服务
     */
    private Integer optType;
    /**
     * 订单编号
     */
    private String workOrderNo;
    /**
     * 员工ID
     */
    private Integer empId;
    /**
     * 员工姓名
     */
    private String empName;
    /**
     * 员工手机号
     */
    private String empMobileNo;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 操作时间
     */
    private Long optTime;

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
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

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpMobileNo() {
        return empMobileNo;
    }

    public void setEmpMobileNo(String empMobileNo) {
        this.empMobileNo = empMobileNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getOptTime() {
        return optTime;
    }

    public void setOptTime(Long optTime) {
        this.optTime = optTime;
    }
}
