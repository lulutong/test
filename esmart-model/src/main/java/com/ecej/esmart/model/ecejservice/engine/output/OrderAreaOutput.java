package com.ecej.esmart.model.ecejservice.engine.output;


import java.util.List;

/**
 * <p>
 *     订单服务区域
 * </p>
 *
 * @Author kevin
 * @Date 2018-10-30
 */
public class OrderAreaOutput implements java.io.Serializable {
    private static final long serialVersionUID = 936372403079659022L;

    /**
     * 订单服务区域
     */
    private List<Integer> serviceAreaIds;

    public List<Integer> getServiceAreaIds() {
        return serviceAreaIds;
    }

    public void setServiceAreaIds(List<Integer> serviceAreaIds) {
        this.serviceAreaIds = serviceAreaIds;
    }
}

