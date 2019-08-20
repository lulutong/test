package com.ecej.esmart.model.monitor.dto;

/**
 * <p>
 *     sm.esmart.dispatch.fanout.exchange
 *     派工消息PO
 * </p>
 *
 * @author kevin
 * @create 2018-09-11 12:00
 **/
public class DispatchDto {
    /**
     * 订单编号
     */
    private String workOrderNo;
    /**
     * 员工ID
     */
    private Integer empId;
    /**
     * B端商家ID
     */
    private String threepartyMerchanId;
    /**
     * 抢单通知师傅ID列表
     */
    private Integer[] rabOrderEmpIds;
    /**
     * 师傅姓名
     */
    private String empName;
    /**
     * 师傅电话
     */
    private String empMobileNo;
    /**
     * 预约时间
     */
    private String appointTime;
    /**
     * 下单来源 1-用户app创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信
     */
    private Integer orderSource;
    /**
     * 操作类型 1-派单(系统完成派单)，2-抢单，3-订单关闭(订单超时未抢单关闭订单），4-人工派单(后台手动派单),5-抢单通知
     */
    private Integer operatorType;
    /**
     * 常规或邻转知升级
     * 1:常规
     * 2：邻转知升级
     */
    private Integer upgradeType;

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

    public String getThreepartyMerchanId() {
        return threepartyMerchanId;
    }

    public void setThreepartyMerchanId(String threepartyMerchanId) {
        this.threepartyMerchanId = threepartyMerchanId;
    }

    public Integer[] getRabOrderEmpIds() {
        return rabOrderEmpIds;
    }

    public void setRabOrderEmpIds(Integer[] rabOrderEmpIds) {
        this.rabOrderEmpIds = rabOrderEmpIds;
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

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(Integer upgradeType) {
        this.upgradeType = upgradeType;
    }
}
