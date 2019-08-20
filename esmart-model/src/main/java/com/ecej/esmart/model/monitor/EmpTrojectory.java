package com.ecej.esmart.model.monitor;

import com.ecej.nove.base.po.BasePo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *     员工轨迹
 * </p>
 *
 * @author kevin
 * @create 2018-09-10 16:18
 **/
public class EmpTrojectory extends BasePo{
    //城市ID
    private Integer cityId;
    //员工ID
    private Integer empId;
    //经度
    private BigDecimal longitude;
    //纬度
    private BigDecimal latitude;
    //数据变更时间
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
