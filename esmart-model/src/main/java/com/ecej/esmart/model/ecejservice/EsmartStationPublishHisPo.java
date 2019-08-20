
package com.ecej.esmart.model.ecejservice;

public class EsmartStationPublishHisPo implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    //alias
    public static final String TABLE_ALIAS = "EsmartStationPublishHis";


    //columns START
    /**
     * 服务站发布记录ID       db_column: station_publish_his_id
     */
    private Integer stationPublishHisId;
    /**
     * 服务站id       db_column: station_id
     */
    private Integer stationId;
    /**
     * 路径规划时间       db_column: publish_date
     */
    private java.util.Date publishDate;
    /**
     * 订单预约日期       db_column: order_date
     */
    private java.util.Date orderDate;
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
    /**
     * 创建者       db_column: create_user
     */
    private Integer createUser;
    /**
     * 更新者       db_column: update_user
     */
    private Integer updateUser;
    //columns END


    public Integer getStationPublishHisId() {
        return this.stationPublishHisId;
    }

    public void setStationPublishHisId(Integer value) {
        this.stationPublishHisId = value;
    }


    public Integer getStationId() {
        return this.stationId;
    }

    public void setStationId(Integer value) {
        this.stationId = value;
    }


    public java.util.Date getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(java.util.Date value) {
        this.publishDate = value;
    }


    public java.util.Date getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(java.util.Date value) {
        this.orderDate = value;
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


    public Integer getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(Integer value) {
        this.createUser = value;
    }


    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(Integer value) {
        this.updateUser = value;
    }


}

