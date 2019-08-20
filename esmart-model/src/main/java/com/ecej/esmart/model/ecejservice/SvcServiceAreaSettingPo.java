
package com.ecej.esmart.model.ecejservice;

public class SvcServiceAreaSettingPo implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    //alias
    public static final String TABLE_ALIAS = "SvcServiceAreaSetting";


    //columns START
    /**
     * 服务区域id       db_column: service_area_id
     */
    private Integer serviceAreaId;
    /**
     * 城市id       db_column: city_id
     */
    private Integer cityId;
    /**
     * 服务站ID       db_column: station_id
     */
    private Integer stationId;
    /**
     * 区域名称       db_column: area_name
     */
    private String areaName;
    /**
     * 状态       db_column: service_area_status
     */
    private Integer serviceAreaStatus;
    /**
     * 基准点经度       db_column: longitude
     */
    private java.math.BigDecimal longitude;
    /**
     * 基准点纬度       db_column: latitude
     */
    private java.math.BigDecimal latitude;
    /**
     * 小区数量       db_column: community_count
     */
    private Integer communityCount;
    /**
     * 多边形区域       db_column: polygon_area
     */
    private String polygonArea;
    /**
     * 所属公司ID       db_column: their_company_id
     */
    private Integer theirCompanyId;
    /**
     * 数据创建时间       db_column: screate_time
     */
    private java.util.Date screateTime;
    /**
     * 数据更新时间       db_column: supdate_time
     */
    private java.util.Date supdateTime;
    /**
     * 1:删除 0:未删除       db_column: del_flag
     */
    private Integer delFlag;
    //columns END


    public Integer getServiceAreaId() {
        return this.serviceAreaId;
    }

    public void setServiceAreaId(Integer value) {
        this.serviceAreaId = value;
    }


    public Integer getCityId() {
        return this.cityId;
    }

    public void setCityId(Integer value) {
        this.cityId = value;
    }


    public Integer getStationId() {
        return this.stationId;
    }

    public void setStationId(Integer value) {
        this.stationId = value;
    }


    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String value) {
        this.areaName = value;
    }


    public Integer getServiceAreaStatus() {
        return this.serviceAreaStatus;
    }

    public void setServiceAreaStatus(Integer value) {
        this.serviceAreaStatus = value;
    }


    public java.math.BigDecimal getLongitude() {
        return this.longitude;
    }

    public void setLongitude(java.math.BigDecimal value) {
        this.longitude = value;
    }


    public java.math.BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setLatitude(java.math.BigDecimal value) {
        this.latitude = value;
    }


    public Integer getCommunityCount() {
        return this.communityCount;
    }

    public void setCommunityCount(Integer value) {
        this.communityCount = value;
    }


    public String getPolygonArea() {
        return this.polygonArea;
    }

    public void setPolygonArea(String value) {
        this.polygonArea = value;
    }


    public Integer getTheirCompanyId() {
        return this.theirCompanyId;
    }

    public void setTheirCompanyId(Integer value) {
        this.theirCompanyId = value;
    }


    public java.util.Date getScreateTime() {
        return this.screateTime;
    }

    public void setScreateTime(java.util.Date value) {
        this.screateTime = value;
    }


    public java.util.Date getSupdateTime() {
        return this.supdateTime;
    }

    public void setSupdateTime(java.util.Date value) {
        this.supdateTime = value;
    }


    public Integer getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Integer value) {
        this.delFlag = value;
    }


}

