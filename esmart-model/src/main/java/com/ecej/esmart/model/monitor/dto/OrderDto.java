package com.ecej.esmart.model.monitor.dto;

import java.util.Date;

/**
 * <p>
 *     platformOrderFanoutExchange
 *     对应的信息PO
 * </p>
 *
 * @author kevin
 * @create 2018-09-11 12:00
 **/
public class OrderDto {
    /**
     * 订单号
     */
    private String workOrderNo;
    /**
     * 第三方订单号
     */
    private String thirdOrderNo;
    /**
     * 订单来源
     * 1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信 20-平台录单 供应链-101
     */
    private Integer orderSource;
    /**
     * 订单ID
     */
    private Integer orderId;
    /**
     * 订单操作来源
     * 1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信 20-平台录单 供应链-101
     */
    private Integer operatorSource;
    /**
     * 操作类型 1 - 改约 2 - 改派 3 - 取消 4 - 拒单 5 - 关单 6 - 支付完成 7 - 创建订单 8 - 支付超时关闭订单
     */
    private Integer operatorType;
    /**
     * 判责信息ID
     */
    private String judgmentInfoId;
    /**
     * 订单创建时间
     */
    private Date orderCreatedTime;
    /**
     * 订单操作时间
     */
    private Date orderOperatorTime;
    /**
     * 操作原因
     */
    private String operatorReason;
    /**
     * 派工模式  1 自营    2 抢单    3 派工    4 工长录单
     */
    private Integer dispatchingMode;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户联系电话
     */
    private String userPhone;
    /**
     * 原师傅ID
     */
    private Integer empId;
    /**
     * 原师傅联系电话
     */
    private String empPhone;
    /**
     * 新师傅ID
     */
    private Integer newEmpId;
    /**
     * 新师傅联系电话
     */
    private String newEmpPhone;
    /**
     * B端商家ID
     */
    private String threepartyMerchanId;
    /**
     * 操作历史记录ID
     */
    private Integer operHistId;
    /**
     * 预约服务时间
     */
    private Date bookStartTime;
    /**
     * 当前订单状态
     */
    private Integer orderStatus;
    /**
     * 是否前置支付 0=否 1=是
     */
    private Integer isPrepaymentMode;

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getThirdOrderNo() {
        return thirdOrderNo;
    }

    public void setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOperatorSource() {
        return operatorSource;
    }

    public void setOperatorSource(Integer operatorSource) {
        this.operatorSource = operatorSource;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public String getJudgmentInfoId() {
        return judgmentInfoId;
    }

    public void setJudgmentInfoId(String judgmentInfoId) {
        this.judgmentInfoId = judgmentInfoId;
    }

    public Date getOrderCreatedTime() {
        return orderCreatedTime;
    }

    public void setOrderCreatedTime(Date orderCreatedTime) {
        this.orderCreatedTime = orderCreatedTime;
    }

    public Date getOrderOperatorTime() {
        return orderOperatorTime;
    }

    public void setOrderOperatorTime(Date orderOperatorTime) {
        this.orderOperatorTime = orderOperatorTime;
    }

    public String getOperatorReason() {
        return operatorReason;
    }

    public void setOperatorReason(String operatorReason) {
        this.operatorReason = operatorReason;
    }

    public Integer getDispatchingMode() {
        return dispatchingMode;
    }

    public void setDispatchingMode(Integer dispatchingMode) {
        this.dispatchingMode = dispatchingMode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public Integer getNewEmpId() {
        return newEmpId;
    }

    public void setNewEmpId(Integer newEmpId) {
        this.newEmpId = newEmpId;
    }

    public String getNewEmpPhone() {
        return newEmpPhone;
    }

    public void setNewEmpPhone(String newEmpPhone) {
        this.newEmpPhone = newEmpPhone;
    }

    public String getThreepartyMerchanId() {
        return threepartyMerchanId;
    }

    public void setThreepartyMerchanId(String threepartyMerchanId) {
        this.threepartyMerchanId = threepartyMerchanId;
    }

    public Integer getOperHistId() {
        return operHistId;
    }

    public void setOperHistId(Integer operHistId) {
        this.operHistId = operHistId;
    }

    public Date getBookStartTime() {
        return bookStartTime;
    }

    public void setBookStartTime(Date bookStartTime) {
        this.bookStartTime = bookStartTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getIsPrepaymentMode() {
        return isPrepaymentMode;
    }

    public void setIsPrepaymentMode(Integer isPrepaymentMode) {
        this.isPrepaymentMode = isPrepaymentMode;
    }
}
