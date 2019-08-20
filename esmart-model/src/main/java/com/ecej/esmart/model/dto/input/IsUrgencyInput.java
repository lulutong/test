package com.ecej.esmart.model.dto.input;

import com.ecej.esmart.model.dto.common.ServiceClassAndNum;
import com.ecej.nove.base.po.BasePo;

import java.util.List;

public class IsUrgencyInput extends BasePo {

    private  Integer cityId;
    private List<ServiceClassAndNum> serviceClassAndNum;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public List<ServiceClassAndNum> getServiceClassAndNum() {
        return serviceClassAndNum;
    }

    public void setServiceClassAndNum(List<ServiceClassAndNum> serviceClassAndNum) {
        this.serviceClassAndNum = serviceClassAndNum;
    }
}
