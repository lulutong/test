
package com.ecej.esmart.model.ecejservice;


import com.ecej.nove.base.po.BasePo;

public class SvcWorkOrderPo extends BasePo {
    private static final long serialVersionUID = 1L;
    //alias
    public static final String TABLE_ALIAS = "SvcWorkOrder";


    //columns START
    /**
     * 服务工单id       db_column: work_order_id
     */
    private Integer workOrderId;
    /**
     * 订单编号       db_column: work_order_no
     */
    private String workOrderNo;
    /**
     * 服务站id       db_column: station_id
     */
    private Integer stationId;
    /**
     * 用户常用地址id       db_column: user_address_id
     */
    private Integer userAddressId;
    /**
     * 服务品类id,如果是单品类多数量或者组合 品类ID=0       db_column: service_class_id
     */
    private Integer serviceClassId;
    /**
     * 城市id       db_column: city_id
     */
    private Integer cityId;
    /**
     * 员工id       db_column: emp_id
     */
    private Integer empId;
    /**
     * 站长id       db_column: station_head_id
     */
    private Integer stationHeadId;
    /**
     * 创建人code       db_column: create_user_code
     */
    private String createUserCode;
    /**
     * 联系人手机号       db_column: contacts_mobile
     */
    private String contactsMobile;
    /**
     * contactsName       db_column: contacts_name
     */
    private String contactsName;
    /**
     * 原订单编号       db_column: original_order_no
     */
    private String originalOrderNo;
    /**
     * 父订单编号       db_column: parent_order_no
     */
    private String parentOrderNo;
    /**
     * 业务合作伙伴编号       db_column: business_partner_no
     */
    private String businessPartnerNo;
    /**
     * 订单类型(1-日常订单，2-专项任务)       db_column: order_type
     */
    private Integer orderType;
    /**
     * 订单状态(101已下单,102待支付,140-149服务中,150已关闭,1.受理中2.已派工3.前往中4.服务中5.待支付6.已完成未评价7.已完成8.已取消)       db_column: order_status
     */
    private Integer orderStatus;
    /**
     * 改约flag       db_column: reassignment_flag
     */
    private Integer reassignmentFlag;
    /**
     * 催单flag       db_column: remind_flag
     */
    private Integer remindFlag;
    /**
     * 升级flag       db_column: upgrade_flag
     */
    private Integer upgradeFlag;
    /**
     * 改约次数       db_column: change_book_count
     */
    private Integer changeBookCount;
    /**
     * 升级次数       db_column: upgrade_count
     */
    private Integer upgradeCount;
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
     * 内部备注       db_column: inner_remark
     */
    private String innerRemark;
    /**
     * 故障描述       db_column: fault_desc
     */
    private String faultDesc;
    /**
     * 派工时间       db_column: dispatch_time
     */
    private java.util.Date dispatchTime;
    /**
     * 出发时间       db_column: depart_time
     */
    private java.util.Date departTime;
    /**
     * 上门时间       db_column: arrive_time
     */
    private java.util.Date arriveTime;
    /**
     * 订单创建时间       db_column: create_time
     */
    private java.util.Date createTime;
    /**
     * 订单完成时间       db_column: pay_end_time
     */
    private java.util.Date payEndTime;
    /**
     * 调价原因       db_column: adjust_price_reason
     */
    private String adjustPriceReason;
    /**
     * 交账flag（0：未交账，1：已交账，2：处理中）       db_column: give_bill_flag
     */
    private Integer giveBillFlag;
    /**
     * 签名状态（0-无需签名 1-已签名）       db_column: sign_status
     */
    private Integer signStatus;
    /**
     * 省份       db_column: province
     */
    private String province;
    /**
     * 地级市       db_column: city
     */
    private String city;
    /**
     * 区/县       db_column: district
     */
    private String district;
    /**
     * 小区       db_column: community
     */
    private String community;
    /**
     * 详细地址       db_column: detail_address
     */
    private String detailAddress;
    /**
     * 经度       db_column: longitude
     */
    private java.math.BigDecimal longitude;
    /**
     * 纬度       db_column: latitude
     */
    private java.math.BigDecimal latitude;
    /**
     * 同步flag(0-未同步 1-已同步)       db_column: sync_flag
     */
    private Integer syncFlag;
    /**
     * channelId       db_column: channel_id
     */
    private Integer channelId;
    /**
     * 活动预算表主键       db_column: activity_id
     */
    private Integer activityId;
    /**
     * 联系次数       db_column: relation_times
     */
    private Integer relationTimes;
    /**
     * 临时小组档期信息       db_column: schedule_record_json
     */
    private String scheduleRecordJson;
    /**
     * 师傅跟用户打电话的状态       db_column: relation_status
     */
    private Integer relationStatus;
    /**
     * 户级任务明细主键ID       db_column: user_level_task_detail_id
     */
    private Integer userLevelTaskDetailId;
    /**
     * 第三方订单编号       db_column: third_order_no
     */
    private String thirdOrderNo;
    /**
     * 第三方代收金额        db_column: third_collect_money
     */
    private java.math.BigDecimal thirdCollectMoney;
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
     * 出库库位id       db_column: out_storage_id
     */
    private Integer outStorageId;
    /**
     * 创建人id(订单中心使用)       db_column: create_order_user_id
     */
    private Integer createOrderUserId;
    /**
     * 创建人姓名（订单中心使用）       db_column: create_order_user_name
     */
    private String createOrderUserName;
    /**
     * 组合ID       db_column: combination_id
     */
    private Integer combinationId;
    /**
     * 组合名称       db_column: combination_name
     */
    private String combinationName;
    /**
     * 组合标识（0-否，1-是）       db_column: combination_flag
     */
    private Integer combinationFlag;
    /**
     * 专项任务审核状态（0：未审核，5：审核不通过，驳回，6：审核通过完成）       db_column: special_audit_state
     */
    private Integer specialAuditState;
    /**
     * 1 动态派工，2 平台抢单，3 计划派工       db_column: order_dispatching_mode
     */
    private Integer orderDispatchingMode;
    //columns END
    /**
     * 1=是 0=否,默认0                               db_column: is_rebuy
     */
    private Integer isRebuy;
    /**
     * 1=展现 0=不展现                               db_column: rebuy_value
     */
    private Integer rebuyValue;

    public Integer getWorkOrderId() {
        return this.workOrderId;
    }

    public void setWorkOrderId(Integer value) {
        this.workOrderId = value;
    }


    public String getWorkOrderNo() {
        return this.workOrderNo;
    }

    public void setWorkOrderNo(String value) {
        this.workOrderNo = value;
    }


    public Integer getStationId() {
        return this.stationId;
    }

    public void setStationId(Integer value) {
        this.stationId = value;
    }


    public Integer getUserAddressId() {
        return this.userAddressId;
    }

    public void setUserAddressId(Integer value) {
        this.userAddressId = value;
    }


    public Integer getServiceClassId() {
        return this.serviceClassId;
    }

    public void setServiceClassId(Integer value) {
        this.serviceClassId = value;
    }


    public Integer getCityId() {
        return this.cityId;
    }

    public void setCityId(Integer value) {
        this.cityId = value;
    }


    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer value) {
        this.empId = value;
    }


    public Integer getStationHeadId() {
        return this.stationHeadId;
    }

    public void setStationHeadId(Integer value) {
        this.stationHeadId = value;
    }


    public String getCreateUserCode() {
        return this.createUserCode;
    }

    public void setCreateUserCode(String value) {
        this.createUserCode = value;
    }


    public String getContactsMobile() {
        return this.contactsMobile;
    }

    public void setContactsMobile(String value) {
        this.contactsMobile = value;
    }


    public String getContactsName() {
        return this.contactsName;
    }

    public void setContactsName(String value) {
        this.contactsName = value;
    }


    public String getOriginalOrderNo() {
        return this.originalOrderNo;
    }

    public void setOriginalOrderNo(String value) {
        this.originalOrderNo = value;
    }


    public String getParentOrderNo() {
        return this.parentOrderNo;
    }

    public void setParentOrderNo(String value) {
        this.parentOrderNo = value;
    }


    public String getBusinessPartnerNo() {
        return this.businessPartnerNo;
    }

    public void setBusinessPartnerNo(String value) {
        this.businessPartnerNo = value;
    }


    public Integer getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Integer value) {
        this.orderType = value;
    }


    public Integer getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(Integer value) {
        this.orderStatus = value;
    }


    public Integer getReassignmentFlag() {
        return this.reassignmentFlag;
    }

    public void setReassignmentFlag(Integer value) {
        this.reassignmentFlag = value;
    }


    public Integer getRemindFlag() {
        return this.remindFlag;
    }

    public void setRemindFlag(Integer value) {
        this.remindFlag = value;
    }


    public Integer getUpgradeFlag() {
        return this.upgradeFlag;
    }

    public void setUpgradeFlag(Integer value) {
        this.upgradeFlag = value;
    }


    public Integer getChangeBookCount() {
        return this.changeBookCount;
    }

    public void setChangeBookCount(Integer value) {
        this.changeBookCount = value;
    }


    public Integer getUpgradeCount() {
        return this.upgradeCount;
    }

    public void setUpgradeCount(Integer value) {
        this.upgradeCount = value;
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


    public String getInnerRemark() {
        return this.innerRemark;
    }

    public void setInnerRemark(String value) {
        this.innerRemark = value;
    }


    public String getFaultDesc() {
        return this.faultDesc;
    }

    public void setFaultDesc(String value) {
        this.faultDesc = value;
    }


    public java.util.Date getDispatchTime() {
        return this.dispatchTime;
    }

    public void setDispatchTime(java.util.Date value) {
        this.dispatchTime = value;
    }


    public java.util.Date getDepartTime() {
        return this.departTime;
    }

    public void setDepartTime(java.util.Date value) {
        this.departTime = value;
    }


    public java.util.Date getArriveTime() {
        return this.arriveTime;
    }

    public void setArriveTime(java.util.Date value) {
        this.arriveTime = value;
    }


    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date value) {
        this.createTime = value;
    }


    public java.util.Date getPayEndTime() {
        return this.payEndTime;
    }

    public void setPayEndTime(java.util.Date value) {
        this.payEndTime = value;
    }


    public String getAdjustPriceReason() {
        return this.adjustPriceReason;
    }

    public void setAdjustPriceReason(String value) {
        this.adjustPriceReason = value;
    }


    public Integer getGiveBillFlag() {
        return this.giveBillFlag;
    }

    public void setGiveBillFlag(Integer value) {
        this.giveBillFlag = value;
    }


    public Integer getSignStatus() {
        return this.signStatus;
    }

    public void setSignStatus(Integer value) {
        this.signStatus = value;
    }


    public String getProvince() {
        return this.province;
    }

    public void setProvince(String value) {
        this.province = value;
    }


    public String getCity() {
        return this.city;
    }

    public void setCity(String value) {
        this.city = value;
    }


    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String value) {
        this.district = value;
    }


    public String getCommunity() {
        return this.community;
    }

    public void setCommunity(String value) {
        this.community = value;
    }


    public String getDetailAddress() {
        return this.detailAddress;
    }

    public void setDetailAddress(String value) {
        this.detailAddress = value;
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


    public Integer getSyncFlag() {
        return this.syncFlag;
    }

    public void setSyncFlag(Integer value) {
        this.syncFlag = value;
    }


    public Integer getChannelId() {
        return this.channelId;
    }

    public void setChannelId(Integer value) {
        this.channelId = value;
    }


    public Integer getActivityId() {
        return this.activityId;
    }

    public void setActivityId(Integer value) {
        this.activityId = value;
    }


    public Integer getRelationTimes() {
        return this.relationTimes;
    }

    public void setRelationTimes(Integer value) {
        this.relationTimes = value;
    }


    public String getScheduleRecordJson() {
        return this.scheduleRecordJson;
    }

    public void setScheduleRecordJson(String value) {
        this.scheduleRecordJson = value;
    }


    public Integer getRelationStatus() {
        return this.relationStatus;
    }

    public void setRelationStatus(Integer value) {
        this.relationStatus = value;
    }


    public Integer getUserLevelTaskDetailId() {
        return this.userLevelTaskDetailId;
    }

    public void setUserLevelTaskDetailId(Integer value) {
        this.userLevelTaskDetailId = value;
    }


    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

    public void setThirdOrderNo(String value) {
        this.thirdOrderNo = value;
    }


    public java.math.BigDecimal getThirdCollectMoney() {
        return this.thirdCollectMoney;
    }

    public void setThirdCollectMoney(java.math.BigDecimal value) {
        this.thirdCollectMoney = value;
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


    public Integer getOutStorageId() {
        return this.outStorageId;
    }

    public void setOutStorageId(Integer value) {
        this.outStorageId = value;
    }


    public Integer getCreateOrderUserId() {
        return this.createOrderUserId;
    }

    public void setCreateOrderUserId(Integer value) {
        this.createOrderUserId = value;
    }


    public String getCreateOrderUserName() {
        return this.createOrderUserName;
    }

    public void setCreateOrderUserName(String value) {
        this.createOrderUserName = value;
    }


    public Integer getCombinationId() {
        return this.combinationId;
    }

    public void setCombinationId(Integer value) {
        this.combinationId = value;
    }


    public String getCombinationName() {
        return this.combinationName;
    }

    public void setCombinationName(String value) {
        this.combinationName = value;
    }


    public Integer getCombinationFlag() {
        return this.combinationFlag;
    }

    public void setCombinationFlag(Integer value) {
        this.combinationFlag = value;
    }


    public Integer getSpecialAuditState() {
        return this.specialAuditState;
    }

    public void setSpecialAuditState(Integer value) {
        this.specialAuditState = value;
    }


    public Integer getOrderDispatchingMode() {
        return this.orderDispatchingMode;
    }

    public void setOrderDispatchingMode(Integer value) {
        this.orderDispatchingMode = value;
    }

    public Integer getIsRebuy() {
        return isRebuy;
    }

    public void setIsRebuy(Integer isRebuy) {
        this.isRebuy = isRebuy;
    }

    public Integer getRebuyValue() {
        return rebuyValue;
    }

    public void setRebuyValue(Integer rebuyValue) {
        this.rebuyValue = rebuyValue;
    }
}

