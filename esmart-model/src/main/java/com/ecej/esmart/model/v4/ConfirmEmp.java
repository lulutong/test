package com.ecej.esmart.model.v4;

import java.util.Date;
import java.util.List;

/**
 * 描述: 确认多能工
 **/
public class ConfirmEmp implements java.io.Serializable {

    /**
     * 请求来源
     * 1-用户app创建 4-运营平台 5-员工app 6-CRM10-商城下单
     * 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳
     * 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单
     */
    private Integer requestSource;

    /**
     * 订单编号
     */
    private String workOrderNo;

    /**
     * 请求唯一标示
     */
    private String guid;

    /**
     * 白夜班模式 0-白班，1-夜班（新呼叫中心专用）
     */
    private Integer nightModel = 0;

    /**
     * 城市id
     */
    private Integer cityId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 员工id
     */
    private Integer empId;

    /**
     * 选中的员工ID
     */
    private Integer checkedEmpId;

    /**
     * 服务站id
     */
    private Integer stationId;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 预约时间
     */
    private Date appointmentTime;

    /**
     * 公司id
     */
    private Integer companyId;

    /**
     * 手机号
     */
    private String phone;
    private String cellName;

    /**
     * 推广码
     */
    private Integer extensionAgentId;

    /**
     * 是否立即下单
     */
    private Integer orderFlag;

    /**
     * 多品类 下单-实体
     */
    private List<ServiceClassAndNum> serviceClassAndNum;

    /**
     * 其他标示
     */
    private Integer otherFlag;

    //1-上午 2-下午 3-晚上
    private Integer timeType;

    //当前组别
    private String groupId;

    //对调组别
    private String checkedGroupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCheckedGroupId() {
        return checkedGroupId;
    }

    public void setCheckedGroupId(String checkedGroupId) {
        this.checkedGroupId = checkedGroupId;
    }

    public Integer getTimeType() {
        return timeType;
    }

    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getNightModel() {
        return nightModel;
    }

    public void setNightModel(Integer nightModel) {
        this.nightModel = nightModel;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCheckedEmpId() {
        return checkedEmpId;
    }

    public void setCheckedEmpId(Integer checkedEmpId) {
        this.checkedEmpId = checkedEmpId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public Integer getExtensionAgentId() {
        return extensionAgentId;
    }

    public void setExtensionAgentId(Integer extensionAgentId) {
        this.extensionAgentId = extensionAgentId;
    }

    public Integer getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(Integer orderFlag) {
        this.orderFlag = orderFlag;
    }

    public List<ServiceClassAndNum> getServiceClassAndNum() {
        return serviceClassAndNum;
    }

    public void setServiceClassAndNum(List<ServiceClassAndNum> serviceClassAndNum) {
        this.serviceClassAndNum = serviceClassAndNum;
    }

    public Integer getOtherFlag() {
        return otherFlag;
    }

    public void setOtherFlag(Integer otherFlag) {
        this.otherFlag = otherFlag;
    }
}
