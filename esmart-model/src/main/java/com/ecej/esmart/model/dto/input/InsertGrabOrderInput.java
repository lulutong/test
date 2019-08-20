package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

import java.util.List;

public class InsertGrabOrderInput extends BasePo {

    /**
     * 订单No 必填
     */
    private String workOrderNo;

    /**
     * 抢单池或派工池的订单状态
     */
    private Integer orderPoolStatus;

    /**
     * 1 抢单、2 派单
     */
    private Integer orderType;

    /**
     * 服务站和服务区域
     */
    private List<StationAndArea> stationAndArea;


    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Integer getOrderPoolStatus() {
        return orderPoolStatus;
    }

    public void setOrderPoolStatus(Integer orderPoolStatus) {
        this.orderPoolStatus = orderPoolStatus;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public List<StationAndArea> getStationAndArea() {
        return stationAndArea;
    }

    public void setStationAndArea(List<StationAndArea> stationAndArea) {
        this.stationAndArea = stationAndArea;
    }

    public static class StationAndArea {
        private Integer stationId;
        private Integer serviceAreaId;

        public Integer getStationId() {
            return stationId;
        }

        public void setStationId(Integer stationId) {
            this.stationId = stationId;
        }

        public Integer getServiceAreaId() {
            return serviceAreaId;
        }

        public void setServiceAreaId(Integer serviceAreaId) {
            this.serviceAreaId = serviceAreaId;
        }
    }
}
