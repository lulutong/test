package com.ecej.esmart.model.dto.output;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 *
 * @author yanpenglei
 * @create 2018-05-21 15:36
 **/
public class CycleOrderResult implements Serializable {

    /**
     * 首次服务时间集合 key:guid，唯一标识 value:serviceTime，首次服务时间
     */
    private Map<String, Date> firstServiceTimeEntity = new HashMap<String, Date>();

    /**
     * 师傅 ID
     */
    private Integer empId;

    /**
     * 服务站ID
     */
    private Integer stationId;

    public Map<String, Date> getFirstServiceTimeEntity() {
        return firstServiceTimeEntity;
    }

    public void setFirstServiceTimeEntity(Map<String, Date> firstServiceTimeEntity) {
        this.firstServiceTimeEntity = firstServiceTimeEntity;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }
}
