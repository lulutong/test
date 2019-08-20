package com.ecej.esmart.model.dto.common;

/**
 * 描述: 推广码
 *
 * @author: yanpenglei
 * @create: 2018/3/5 14:56
 */
public class ExtensionAgent implements java.io.Serializable {

    /**
     * 是否立即下单 0 否 1 是
     */
    private Integer orderFlag;

    /**
     * 员工ID
     */
    private Integer empId;

    /**
     * 预约时间  yyyy-MM-dd
     */
    private String workDate;

    public Integer getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

}
