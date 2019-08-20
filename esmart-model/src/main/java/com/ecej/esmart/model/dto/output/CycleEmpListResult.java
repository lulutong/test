package com.ecej.esmart.model.dto.output;

import java.io.Serializable;
import java.util.Date;

public class CycleEmpListResult implements Serializable{

    private static final long serialVersionUID = -969572653202782356L;
    /*
     * 员工ID
     */
    private Integer empId;
    /*
     * 员工姓名
     */
    private String empName;
    /*
     * 省份
     */
    private String province;
    /*
     * 年龄
     */
    private Integer age;
    /*
     * 出生年月日
     */
    private Date birthday;
    /*
     * 员工评价总分数
     */
    private Integer evaluateTotalScore;
    /*
     * 员工评价总单数
     */
    private Integer evaluateSum;
    /*
     * 平均星级
     */
    private Double starLevel;
    /*
     * 服务次数
     */
    private Integer serviceNum;
    /*
     * 手机号
     */
    private String mobileNo;
    /*
     * 员工头像
     */
    private String headImage;
    /*
     * 是否被曾经使用过---1：使用过；2：未被使用过
     */
    private Integer used;

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Double starLevel) {
        this.starLevel = starLevel;
    }

    public Integer getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
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

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getEvaluateTotalScore() {
        return evaluateTotalScore;
    }

    public void setEvaluateTotalScore(Integer evaluateTotalScore) {
        this.evaluateTotalScore = evaluateTotalScore;
    }

    public Integer getEvaluateSum() {
        return evaluateSum;
    }

    public void setEvaluateSum(Integer evaluateSum) {
        this.evaluateSum = evaluateSum;
    }
}
