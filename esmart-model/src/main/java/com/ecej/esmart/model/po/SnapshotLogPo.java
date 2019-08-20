package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

import java.util.Date;

/**
 * <p>派工操作日志信息--->mongoDB中collection</p>
 *
 * @author
 * @create 2018-01-04 17:31
 **/
public class SnapshotLogPo extends BasePo {

    /**
     * 日志操作唯一标识
     */
    private String guid;

    /**
     * 订单号
     */
    private String workOrderNo;

    /**
     * 请求来源(1-用户app创建 2-营业厅补气 3-支付宝缴费平台创建 4-运营平台 5-员工app 6-CRM 10-商城下单 11-微信下单 12-H5下单 13-新呼叫中心 14-零散接驳 15-商家后台 16-商家APP 17-商城H5 18-B端后补工单 19-商家微信 100-自动派工)
     */
    private Integer requestSources;

    /**
     * 操作时间
     */
    private Date operatorTime;

    /**
     * 过期时间(四个月)
     */
    private Date expireTime;

    /**
     * 操作类型（1-推荐时间,2-时间列表,3-选择时间,4-放弃下单,5-创建工单,6-取消,7-完成,8-改派,9-改约,10-任务池列表,11-领取任务,12-多能工列表，13-手动派工，14-自动派工,20-获取服务区域列表）
     */
    private Integer operatorType;

    /**
     * 操作内容
     */
    private Integer contentType;

    /**
     * 模板数据
     */
    private Object[] args;

    /**
     * 处理后模板数据，将ID换成相应的中文名
     */
    private Object[] argsCopy;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Integer getRequestSources() {
        return requestSources;
    }

    public void setRequestSources(Integer requestSources) {
        this.requestSources = requestSources;
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Object[] getArgsCopy() {
        return argsCopy;
    }

    public void setArgsCopy(Object[] argsCopy) {
        this.argsCopy = argsCopy;
    }
}
