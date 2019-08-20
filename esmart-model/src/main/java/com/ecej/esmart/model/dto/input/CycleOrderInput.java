package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;
import com.ecej.esmart.model.dto.common.ServiceCycleEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 描述:
 *
 * @author yanpenglei
 * @create 2018-05-21 15:10
 **/
public class CycleOrderInput implements Serializable {


    /**
     * 请求来源
     * 1-用户app创建 4-运营平台 5-员工app 6-CRM10-商城下单
     * 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳
     * 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单
     */
    private Integer requestSource;

    /**
     *
     * 下单来源
     *
     * 1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app
     6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳
     15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信
     */
    private Integer orderSource;

    /**
     * 城市id
     */
    private Integer cityId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 阿姨ID
     */
    private Integer empId;

    /**
     * 首次服务时间
     */
    private Date firstServiceTime;

    /**
     * 周期频次：（YZYC 一周一次、LZYC 两周1次、YZDC 一周多次）
     */
    private String serviceFrequency;

    /**
     * 多品类 下单-实体
     */
    private List<ServiceClassAndNum> serviceClassAndNum;

    /**
     * 预约时间列表
     */
    private List<ServiceCycleEntity> serviceCycleEntity;


    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getFirstServiceTime() {
        return firstServiceTime;
    }

    public void setFirstServiceTime(Date firstServiceTime) {
        this.firstServiceTime = firstServiceTime;
    }

    public String getServiceFrequency() {
        return serviceFrequency;
    }

    public void setServiceFrequency(String serviceFrequency) {
        this.serviceFrequency = serviceFrequency;
    }

    public List<ServiceClassAndNum> getServiceClassAndNum() {
        return serviceClassAndNum;
    }

    public void setServiceClassAndNum(List<ServiceClassAndNum> serviceClassAndNum) {
        this.serviceClassAndNum = serviceClassAndNum;
    }

    public List<ServiceCycleEntity> getServiceCycleEntity() {
        return serviceCycleEntity;
    }

    public void setServiceCycleEntity(List<ServiceCycleEntity> serviceCycleEntity) {
        this.serviceCycleEntity = serviceCycleEntity;
    }
}
