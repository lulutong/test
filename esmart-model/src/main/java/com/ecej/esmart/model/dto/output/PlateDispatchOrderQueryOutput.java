
package com.ecej.esmart.model.dto.output;

import com.ecej.nove.base.po.BasePo;

import java.math.BigDecimal;
import java.util.Date;

public class PlateDispatchOrderQueryOutput extends BasePo {
    /**
     * 城市ID
     */
    private Integer cityId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 品类版本
     */
    private Integer baseDataVersion;
    /**
     * 服务大类ID
     */
    private Integer serviceBigClassId;
    /**
     * 设备ID
     */
    private Integer deviceId;
    /**
     * 服务品类ID
     */
    private Integer serviceClassId;
    /**
     * 派工模式 1：自营 2：抢单 3：平台派工
     */
    private Integer orderDispatchingMode;
    /**
     * 订单状态 101已下单,102待支付,140-149服务中,150已关闭,1.受理中2.已派工3.前往中4.服务中5.待支付6.已完成未评价7.已完成8.已取消
     */
    private Integer orderStatus;
    /**
     * 订单来源：1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app
     * 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳
     * 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信
     */
    private Integer orderSource;
    /**
     * 用户电话
     */
    private String contactsMobile;
    /**
     * 订单ID
     */
    private Integer workOrderId;
    /**
     * 订单号
     */
    private String workOrderNo;
    /**
     * 员工ID
     */
    private Integer empId;
    /**
     * 员工姓名
     */
    private String empName;
    /**
     * 员工电话
     */
    private String mobileNo;
    /**
     * 预约开始时间
     */
    private Date bookStartTime;
    /**
     * 服务站ID
     */
    private Integer stationId;
    /**
     * 服务站名称
     */
    private String stationName;
    /**
     * 省：中文描述
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 服务区域：中文描述
     */
    private String district;
    /**
     * 社区：中文描述
     */
    private String community;
    /**
     * 详细地址：中文描述
     */
    private String detailAddress;
    /**
     * 经度
     */
    private BigDecimal longitude;
    /**
     * 纬度
     */
    private BigDecimal latitude;
    /**
     * 用户下单备注：故障描述
     */
    private String faultDesc;
    /**
     * 下单时间
     */
    private Date createTime;
    /**
     * 服务区域信息：多个区域信息，以逗号分隔
     */
    private String serviceAreaInfo;
    /**
     * 公司信息：对应服务区域信息
     */
    private String companyInfo;
    /**
     * 服务品类信息：多个服务品类*数量，以逗号分隔
     */
    private String serviceClassInfo;

    /**
     * 是否周期订单 0：否 1：是
     */
    private int isCycleOrder;

    /**
     * 周期订单父订单号
     */
    private String cycleParentOrderNo;

    /**
     * 周期订单根订单号
     */
    private String cycleRootOrderNo;
    /**
     * 员工预计开始时间       db_column: emp_expect_begin_time
     */
    private Date empExpectBeginTime;
    /**
     * 员工预计上门时间       db_column: emp_expect_visit_time
     */
    private Date empExpectVisitTime;
    /**
     * 员工预计结束时间       db_column: emp_expect_end_time
     */
    private Date empExpectEndTime;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getBaseDataVersion() {
        return baseDataVersion;
    }

    public void setBaseDataVersion(Integer baseDataVersion) {
        this.baseDataVersion = baseDataVersion;
    }

    public Integer getServiceBigClassId() {
        return serviceBigClassId;
    }

    public void setServiceBigClassId(Integer serviceBigClassId) {
        this.serviceBigClassId = serviceBigClassId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getServiceClassId() {
        return serviceClassId;
    }

    public void setServiceClassId(Integer serviceClassId) {
        this.serviceClassId = serviceClassId;
    }

    public Integer getOrderDispatchingMode() {
        return orderDispatchingMode;
    }

    public void setOrderDispatchingMode(Integer orderDispatchingMode) {
        this.orderDispatchingMode = orderDispatchingMode;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getContactsMobile() {
        return contactsMobile;
    }

    public void setContactsMobile(String contactsMobile) {
        this.contactsMobile = contactsMobile;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getBookStartTime() {
        return bookStartTime;
    }

    public void setBookStartTime(Date bookStartTime) {
        this.bookStartTime = bookStartTime;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getFaultDesc() {
        return faultDesc;
    }

    public void setFaultDesc(String faultDesc) {
        this.faultDesc = faultDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getServiceAreaInfo() {
        return serviceAreaInfo;
    }

    public void setServiceAreaInfo(String serviceAreaInfo) {
        this.serviceAreaInfo = serviceAreaInfo;
    }

    public String getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
    }

    public String getServiceClassInfo() {
        return serviceClassInfo;
    }

    public void setServiceClassInfo(String serviceClassInfo) {
        this.serviceClassInfo = serviceClassInfo;
    }

    public int getIsCycleOrder() {
        return isCycleOrder;
    }

    public void setIsCycleOrder(int isCycleOrder) {
        this.isCycleOrder = isCycleOrder;
    }

    public String getCycleParentOrderNo() {
        return cycleParentOrderNo;
    }

    public void setCycleParentOrderNo(String cycleParentOrderNo) {
        this.cycleParentOrderNo = cycleParentOrderNo;
    }

    public String getCycleRootOrderNo() {
        return cycleRootOrderNo;
    }

    public void setCycleRootOrderNo(String cycleRootOrderNo) {
        this.cycleRootOrderNo = cycleRootOrderNo;
    }

    public Date getEmpExpectBeginTime() {
        return empExpectBeginTime;
    }

    public void setEmpExpectBeginTime(Date empExpectBeginTime) {
        this.empExpectBeginTime = empExpectBeginTime;
    }

    public Date getEmpExpectVisitTime() {
        return empExpectVisitTime;
    }

    public void setEmpExpectVisitTime(Date empExpectVisitTime) {
        this.empExpectVisitTime = empExpectVisitTime;
    }

    public Date getEmpExpectEndTime() {
        return empExpectEndTime;
    }

    public void setEmpExpectEndTime(Date empExpectEndTime) {
        this.empExpectEndTime = empExpectEndTime;
    }
}

