package com.ecej.esmart.model.ecejservice;

import java.util.List;

/**
 * <p>平台派工抢单派工消息发送po-用于MQ发送</p>
 *
 * @author kevin
 * @create 2018-04-03 16:15
 **/
public class SendMessageCommonPo  implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 订单号
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
     * 员工电话
     */
    private String empMobileNo;
    /**
     * B端商家ID
     */
    private String threepartyMerchanId;
    /**
     * 抢单通知师傅Id列表
     */
    private List<Integer> rabOrderEmpIds;
    /**
     * 预约时间
     */
    private String appointTime;
    /**
     * 1-用户app创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单
     * 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信
     */
    private Integer orderSource;
    /**
     * 1-派单(系统完成派单)，2-抢单，3-订单关闭(订单超时未抢单关闭订单），4-人工派单(后台手动派单),5-抢单通知
     */
    private Integer operatorType;
    /*
     *  1.常规，2.邻转知升级
     */
    private  Integer upgradeType;

    /*
     * 1.全部，2.熟识者
     */
    private Integer oftenEmpFlag = 1;


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

    public String getThreepartyMerchanId() {
        return threepartyMerchanId;
    }

    public void setThreepartyMerchanId(String threepartyMerchanId) {
        this.threepartyMerchanId = threepartyMerchanId;
    }

    public List<Integer> getRabOrderEmpIds() {
        return rabOrderEmpIds;
    }

    public void setRabOrderEmpIds(List<Integer> rabOrderEmpIds) {
        this.rabOrderEmpIds = rabOrderEmpIds;
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

    public Integer getOftenEmpFlag() {
        return oftenEmpFlag;
    }

    public void setOftenEmpFlag(Integer oftenEmpFlag) {
        this.oftenEmpFlag = oftenEmpFlag;
    }
}
