package com.ecej.esmart.model.dto.input;

import java.io.Serializable;
import java.util.Date;

public class OrderOperHisOperationInput implements Serializable {

    private static final long serialVersionUID = -2318060263197979460L;
    Integer workOrderId;//订单ID
    Integer orderChangeReasonId;//原因ID
    Integer operatorType;//操作类型
    Integer oldOrderStatus;//旧订单状态
    Integer newOrderStatus;//新订单状态
    Integer operatorSource;//操作来源
    Integer operatorId;//操作人ID
    Integer serviceInOutFlag;//上门前后flag 上门前：1 上门后：2
    Integer oldStationId;//旧服务站ID
    Integer newStationId;//新服务站ID
    Integer oldEmpId;//旧员工ID
    Integer newEmpId;//新员工ID
    Date oldBookStartTime;//旧预约开始时间
    Date oldBookEndTime;//旧预约结束时间
    Date newBookStartTime;//新预约开始时间
    Date newBookEndTime;//新预约结束时间
    String operatorReason;//操作原因
    Integer operatorRole;//操作角色：1=用户 2=员工 3=系统 4=商家 5=运营平台

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getOrderChangeReasonId() {
        return orderChangeReasonId;
    }

    public void setOrderChangeReasonId(Integer orderChangeReasonId) {
        this.orderChangeReasonId = orderChangeReasonId;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getNewOrderStatus() {
        return newOrderStatus;
    }

    public void setNewOrderStatus(Integer newOrderStatus) {
        this.newOrderStatus = newOrderStatus;
    }

    public Integer getOperatorSource() {
        return operatorSource;
    }

    public void setOperatorSource(Integer operatorSource) {
        this.operatorSource = operatorSource;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getServiceInOutFlag() {
        return serviceInOutFlag;
    }

    public void setServiceInOutFlag(Integer serviceInOutFlag) {
        this.serviceInOutFlag = serviceInOutFlag;
    }

    public Integer getNewStationId() {
        return newStationId;
    }

    public void setNewStationId(Integer newStationId) {
        this.newStationId = newStationId;
    }

    public Integer getNewEmpId() {
        return newEmpId;
    }

    public void setNewEmpId(Integer newEmpId) {
        this.newEmpId = newEmpId;
    }

    public Date getNewBookStartTime() {
        return newBookStartTime;
    }

    public void setNewBookStartTime(Date newBookStartTime) {
        this.newBookStartTime = newBookStartTime;
    }

    public Date getNewBookEndTime() {
        return newBookEndTime;
    }

    public void setNewBookEndTime(Date newBookEndTime) {
        this.newBookEndTime = newBookEndTime;
    }

    public String getOperatorReason() {
        return operatorReason;
    }

    public void setOperatorReason(String operatorReason) {
        this.operatorReason = operatorReason;
    }

    public Integer getOperatorRole() {
        return operatorRole;
    }

    public void setOperatorRole(Integer operatorRole) {
        this.operatorRole = operatorRole;
    }

    public Integer getOldEmpId() {
        return oldEmpId;
    }

    public void setOldEmpId(Integer oldEmpId) {
        this.oldEmpId = oldEmpId;
    }

    public Date getOldBookStartTime() {
        return oldBookStartTime;
    }

    public void setOldBookStartTime(Date oldBookStartTime) {
        this.oldBookStartTime = oldBookStartTime;
    }

    public Date getOldBookEndTime() {
        return oldBookEndTime;
    }

    public void setOldBookEndTime(Date oldBookEndTime) {
        this.oldBookEndTime = oldBookEndTime;
    }

    public Integer getOldOrderStatus() {
        return oldOrderStatus;
    }

    public void setOldOrderStatus(Integer oldOrderStatus) {
        this.oldOrderStatus = oldOrderStatus;
    }

    public Integer getOldStationId() {
        return oldStationId;
    }

    public void setOldStationId(Integer oldStationId) {
        this.oldStationId = oldStationId;
    }
}
