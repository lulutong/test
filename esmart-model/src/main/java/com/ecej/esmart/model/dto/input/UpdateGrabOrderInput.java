package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

public class UpdateGrabOrderInput extends BasePo {
    private static final long serialVersionUID = 1L;

    //columns START
    /**
     * 抢单池任务id       db_column: grab_order_pool_id
     */
    private Integer grabOrderPoolId;
    /**
     * 城市id       db_column: city_id
     */
    private Integer cityId;
    /**
     * 订单id       db_column: work_order_id
     */
    private Integer workOrderId;
    /**
     * 员工id       db_column: emp_id
     */
    private Integer empId;
    /**
     * 用户ID       db_column: user_id
     */
    private Integer userId;
    /**
     * 技能标签       db_column: skill_label_id
     */
    private Integer skillLabelId;
    /**
     * 0-未付款 1-未抢单 2-已抢单 3-已取消       db_column: grab_order_status
     */
    private Integer grabOrderStatus;
    /**
     * 消息通知次数       db_column: notice_times
     */
    private Integer noticeTimes;
    /**
     * 订单来源(1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信)       db_column: order_source
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
     * 临时小组档期信息       db_column: schedule_record_json
     */
    private String scheduleRecordJson;
    /**
     * 经度       db_column: longitude
     */
    private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude
     */
    private java.math.BigDecimal latitude;
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


    public Integer getGrabOrderPoolId() {
        return this.grabOrderPoolId;
    }

    public void setGrabOrderPoolId(Integer value) {
        this.grabOrderPoolId = value;
    }


    public Integer getCityId() {
        return this.cityId;
    }

    public void setCityId(Integer value) {
        this.cityId = value;
    }


    public Integer getWorkOrderId() {
        return this.workOrderId;
    }

    public void setWorkOrderId(Integer value) {
        this.workOrderId = value;
    }


    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer value) {
        this.empId = value;
    }


    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer value) {
        this.userId = value;
    }


    public Integer getSkillLabelId() {
        return this.skillLabelId;
    }

    public void setSkillLabelId(Integer value) {
        this.skillLabelId = value;
    }


    public Integer getGrabOrderStatus() {
        return this.grabOrderStatus;
    }

    public void setGrabOrderStatus(Integer value) {
        this.grabOrderStatus = value;
    }


    public Integer getNoticeTimes() {
        return this.noticeTimes;
    }

    public void setNoticeTimes(Integer value) {
        this.noticeTimes = value;
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


    public String getScheduleRecordJson() {
        return this.scheduleRecordJson;
    }

    public void setScheduleRecordJson(String value) {
        this.scheduleRecordJson = value;
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
