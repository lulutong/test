
package com.ecej.esmart.model.ecejservice;

import com.ecej.nove.base.po.BasePo;

public class SvcWorkOrderTaskPo extends BasePo {
    private static final long serialVersionUID = 1L;
    //alias
    public static final String TABLE_ALIAS = "SvcWorkOrderTask";


    //columns START
    /**
     * 任务序列id       db_column: work_task_id
     */
    private Integer workTaskId;
    /**
     * 订单编号       db_column: work_order_id
     */
    private Integer workOrderId;
    /**
     * 服务站id       db_column: station_id
     */
    private Integer stationId;
    /**
     * 服务区域ID       db_column: service_area_id
     */
    private Integer serviceAreaId;
    /**
     * 服务大类ID       db_column: service_tyep_id
     */
    private Integer serviceTyepId;
    /**
     * 服务品类id       db_column: service_class_id
     */
    private Integer serviceClassId;
    /**
     * 技能标签       db_column: skill_label_id
     */
    private Integer skillLabelId;
    /**
     * 城市id       db_column: city_id
     */
    private Integer cityId;
    /**
     * 站长id       db_column: station_head_id
     */
    private Integer stationHeadId;
    /**
     * 用户ID       db_column: user_id
     */
    private Integer userId;
    /**
     * 资源占用状态 1-正常占用资源2-未正常用资源       db_column: resource_occupation_status
     */
    private Integer resourceOccupationStatus;
    /**
     * 0-未派工 1-已派工 2-升级派工 3-站长预警  4-取消 5-虚拟预警       db_column: dipatch_status
     */
    private Integer dipatchStatus;
    /**
     * 订单来源：0-用户，1-CRM，2-员工，3-运营平台       db_column: order_source
     */
    private Integer orderSource;
    /**
     * 预约开始时间       db_column: book_start_time
     */
    private java.util.Date bookStartTime;
    /**
     * 预约结束时间       db_column: book_end_time
     */
    private java.util.Date bookEndTime;
    /**
     * 排班id       db_column: schedule_record_id
     */
    private Integer scheduleRecordId;
    /**
     * 员工预计开始时间       db_column: emp_expect_begin_time
     */
    private java.util.Date empExpectBeginTime;
    /**
     * 员工预计上门时间       db_column: emp_expect_visit_time
     */
    private java.util.Date empExpectVisitTime;
    /**
     * 员工预计结束时间       db_column: emp_expect_end_time
     */
    private java.util.Date empExpectEndTime;
    /**
     * 经度       db_column: longitude
     */
    private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude
     */
    private java.math.BigDecimal latitude;
    /**
     * 创建人       db_column: create_user
     */
    private Integer createUser;
    /**
     * 修改人       db_column: update_user
     */
    private Integer updateUser;
    /**
     * 备用标示 0 可用 1 删除       db_column: del_flag
     */
    private Integer delFlag;
    /**
     * 备注       db_column: standby_remark
     */
    private String standbyRemark;
    /**
     * 数据创建时间       db_column: create_time
     */
    private java.util.Date createTime;
    /**
     * 数据最后更新时间       db_column: update_time
     */
    private java.util.Date updateTime;
    /**
     * 数据创建时间       db_column: screate_time
     */
    private java.util.Date screateTime;
    /**
     * 数据更新时间       db_column: supdate_time
     */
    private java.util.Date supdateTime;
    /**
     * 紧急服务品类预警标识（0-否 1-是）       db_column: urgent_warn_flag
     */
    private Integer urgentWarnFlag;
    //columns END


    public Integer getWorkTaskId() {
        return this.workTaskId;
    }

    public void setWorkTaskId(Integer value) {
        this.workTaskId = value;
    }


    public Integer getWorkOrderId() {
        return this.workOrderId;
    }

    public void setWorkOrderId(Integer value) {
        this.workOrderId = value;
    }


    public Integer getStationId() {
        return this.stationId;
    }

    public void setStationId(Integer value) {
        this.stationId = value;
    }


    public Integer getServiceAreaId() {
        return this.serviceAreaId;
    }

    public void setServiceAreaId(Integer value) {
        this.serviceAreaId = value;
    }


    public Integer getServiceTyepId() {
        return this.serviceTyepId;
    }

    public void setServiceTyepId(Integer value) {
        this.serviceTyepId = value;
    }


    public Integer getServiceClassId() {
        return this.serviceClassId;
    }

    public void setServiceClassId(Integer value) {
        this.serviceClassId = value;
    }


    public Integer getSkillLabelId() {
        return this.skillLabelId;
    }

    public void setSkillLabelId(Integer value) {
        this.skillLabelId = value;
    }


    public Integer getCityId() {
        return this.cityId;
    }

    public void setCityId(Integer value) {
        this.cityId = value;
    }


    public Integer getStationHeadId() {
        return this.stationHeadId;
    }

    public void setStationHeadId(Integer value) {
        this.stationHeadId = value;
    }


    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer value) {
        this.userId = value;
    }


    public Integer getResourceOccupationStatus() {
        return this.resourceOccupationStatus;
    }

    public void setResourceOccupationStatus(Integer value) {
        this.resourceOccupationStatus = value;
    }


    public Integer getDipatchStatus() {
        return this.dipatchStatus;
    }

    public void setDipatchStatus(Integer value) {
        this.dipatchStatus = value;
    }


    public Integer getOrderSource() {
        return this.orderSource;
    }

    public void setOrderSource(Integer value) {
        this.orderSource = value;
    }


    public java.util.Date getBookStartTime() {
        return this.bookStartTime;
    }

    public void setBookStartTime(java.util.Date value) {
        this.bookStartTime = value;
    }


    public java.util.Date getBookEndTime() {
        return this.bookEndTime;
    }

    public void setBookEndTime(java.util.Date value) {
        this.bookEndTime = value;
    }


    public Integer getScheduleRecordId() {
        return this.scheduleRecordId;
    }

    public void setScheduleRecordId(Integer value) {
        this.scheduleRecordId = value;
    }


    public java.util.Date getEmpExpectBeginTime() {
        return this.empExpectBeginTime;
    }

    public void setEmpExpectBeginTime(java.util.Date value) {
        this.empExpectBeginTime = value;
    }


    public java.util.Date getEmpExpectVisitTime() {
        return this.empExpectVisitTime;
    }

    public void setEmpExpectVisitTime(java.util.Date value) {
        this.empExpectVisitTime = value;
    }


    public java.util.Date getEmpExpectEndTime() {
        return this.empExpectEndTime;
    }

    public void setEmpExpectEndTime(java.util.Date value) {
        this.empExpectEndTime = value;
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


    public Integer getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(Integer value) {
        this.delFlag = value;
    }


    public String getStandbyRemark() {
        return this.standbyRemark;
    }

    public void setStandbyRemark(String value) {
        this.standbyRemark = value;
    }


    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date value) {
        this.createTime = value;
    }


    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date value) {
        this.updateTime = value;
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


    public Integer getUrgentWarnFlag() {
        return this.urgentWarnFlag;
    }

    public void setUrgentWarnFlag(Integer value) {
        this.urgentWarnFlag = value;
    }


}

