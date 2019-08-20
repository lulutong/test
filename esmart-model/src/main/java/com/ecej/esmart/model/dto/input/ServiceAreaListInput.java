package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;
import com.ecej.nove.base.po.BasePo;

import java.math.BigDecimal;
import java.util.List;

public class ServiceAreaListInput extends BasePo{
    /**
     * 请求来源
     */
    private Integer requestSource;
    /**
     * guid
     */
    private String guid;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 城市ID
     */
    private Integer cityId;
    /**
     * 公司ID
     */
    private Integer companyId;
    /**
     * 纬度
     */
    private BigDecimal latitude;
    /**
     * 经度
     */
    private BigDecimal longitude;
    /**
     * 服务品类集合
     */
    private List<ServiceClassAndNum> serviceClassAndNum;

    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public List<ServiceClassAndNum> getServiceClassAndNum() {
        return serviceClassAndNum;
    }

    public void setServiceClassAndNum(List<ServiceClassAndNum> serviceClassAndNum) {
        this.serviceClassAndNum = serviceClassAndNum;
    }
}
