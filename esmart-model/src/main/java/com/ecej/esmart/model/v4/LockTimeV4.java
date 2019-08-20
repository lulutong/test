package com.ecej.esmart.model.v4;

public class LockTimeV4  implements java.io.Serializable  {

    private Integer serviceAreaId;//服务区域id
    private Integer serviceCompanyId;//服务公司id
    private Integer stationId;//服务站ID

    public Integer getServiceAreaId() {
        return serviceAreaId;
    }

    public void setServiceAreaId(Integer serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    public Integer getServiceCompanyId() {
        return serviceCompanyId;
    }

    public void setServiceCompanyId(Integer serviceCompanyId) {
        this.serviceCompanyId = serviceCompanyId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }
}
