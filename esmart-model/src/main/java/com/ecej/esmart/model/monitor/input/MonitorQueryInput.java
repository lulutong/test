package com.ecej.esmart.model.monitor.input;

/**
 * <p>
 *     派工监控过滤条件
 * </p>
 *
 * @author kevin
 * @create 2018-09-10 18:37
 **/
public class MonitorQueryInput {
    private Integer empId;
    private Integer cityId;
    private Integer[] serviceClassId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer[] getServiceClassId() {
        if(serviceClassId==null){
            serviceClassId = new Integer[]{};
        }
        return serviceClassId;
    }

    public void setServiceClassId(Integer[] serviceClassId) {
        this.serviceClassId = serviceClassId;
    }
}
