package com.ecej.esmart.model.monitor.output;

import java.io.Serializable;

/**
 * <p>
 *     派工监控推送返回类
 *     用于推送信息
 * </p>
 *
 * @author kevin
 * @create 2018-09-11 10:48
 **/
public class MonitorResult<T> implements Serializable {
    private static final long serialVersionUID = 461900815434592315L;
    //返回码  0：成功 1：失败
    private Integer code;
    //操作信息
    private String msg;
    //数据类型 0：订单信息  1：员工信息
    private Integer dataDesc;
    //订阅用户ID
    private Integer subscribeEmpId;
    //返回信息
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getDataDesc() {
        return dataDesc;
    }

    public void setDataDesc(Integer dataDesc) {
        this.dataDesc = dataDesc;
    }

    public Integer getSubscribeEmpId() {
        return subscribeEmpId;
    }

    public void setSubscribeEmpId(Integer subscribeEmpId) {
        this.subscribeEmpId = subscribeEmpId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
