package com.ecej.esmart.model.dto.output;

import java.io.Serializable;

/**
 * 工长--师傅列表出参实体
 * cxz
 * 2018/6/22 日期
 */
public class ForemanEmployeeInfo implements Serializable {
    /**
     * 工人类型（1-工长，2-工友）
     */
    private Integer workerType;
    /**
     *  工人ID
     */
    private Integer workerId;
    /**
     * 手机号
     */
    private String mobileNo;
    /**
     * headImage
     */
    private String headImage;
    /**
     *  姓名
     */
    private String empName;

    public Integer getWorkerType() {
        return workerType;
    }

    public void setWorkerType(Integer workerType) {
        this.workerType = workerType;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
