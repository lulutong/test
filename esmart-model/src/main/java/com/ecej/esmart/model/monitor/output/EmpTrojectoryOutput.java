package com.ecej.esmart.model.monitor.output;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p></p>
 *
 * @author kevin
 * @create 2018-09-11 10:56
 **/
public class EmpTrojectoryOutput implements Serializable{
    private static final long serialVersionUID = 461900815434592315L;

    /**
     * 城市ID
     */
    private Integer cityId;
    /**
     * 员工ID
     */
    private Integer empId;
    /**
     *  员工姓名
     */
    private String empName;
    /**
     * 员工联系电话
     */
    private String empContact;
    /**
     * 员工经度
     */
    private BigDecimal longitude;
    /**
     * 员工纬度
     */
    private BigDecimal latitude;
    /**
     * 员工服务品类ID集合
     */
    private Integer[] serviceClassIds;

    /**
     * 经纬度
     */
    private BigDecimal[] value;
    /**
     * 数据创建时间
     */
    private Date createTime;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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

    public String getEmpContact() {
        return empContact;
    }

    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Integer[] getServiceClassIds() {
        return serviceClassIds;
    }

    public void setServiceClassIds(Integer[] serviceClassIds) {
        this.serviceClassIds = serviceClassIds;
    }

    public BigDecimal[] getValue() {
        return value;
    }

    public void setValue(BigDecimal[] value) {
        this.value = value;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
