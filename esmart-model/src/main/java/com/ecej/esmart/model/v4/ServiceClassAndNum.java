package com.ecej.esmart.model.v4;


/**
 * 描述: 多品类 下单-实体
 *
 */
public class ServiceClassAndNum implements java.io.Serializable {

    private static final long serialVersionUID = -1551873919356776222L;

    /**
     * 服务品类
     */
    private Integer serviceclassId;

    /**
     * 服务品类数量
     */
    private Integer num;

    /**
     * 服务项目ID
     */
    private Integer serviceItemId;

    public ServiceClassAndNum() {
    }

    public ServiceClassAndNum(Integer serviceclassId, Integer num) {
        this.serviceclassId = serviceclassId;
        this.num = num;
    }

    public Integer getServiceclassId() {
        return serviceclassId;
    }

    public void setServiceclassId(Integer serviceclassId) {
        this.serviceclassId = serviceclassId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getServiceItemId() {
        return serviceItemId;
    }

    public void setServiceItemId(Integer serviceItemId) {
        this.serviceItemId = serviceItemId;
    }
}
