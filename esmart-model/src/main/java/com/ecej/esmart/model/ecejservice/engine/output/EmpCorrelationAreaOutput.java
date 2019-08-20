package com.ecej.esmart.model.ecejservice.engine.output;


import java.util.List;

/**
 * <p>
 *     查询员工关联的服务区域
 * </p>
 *
 * @Author kevin
 * @Date 2018-10-30
 */
public class EmpCorrelationAreaOutput implements java.io.Serializable {
    private static final long serialVersionUID = 936372403079659022L;

    /**
     * 服务区域ID
     */
    private List<Integer> serviceAreaIds;

    public List<Integer> getServiceAreaIds() {
        return serviceAreaIds;
    }

    public void setServiceAreaIds(List<Integer> serviceAreaIds) {
        this.serviceAreaIds = serviceAreaIds;
    }
}

