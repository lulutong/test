package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

public class OperWayTimeCacheFlagInput extends BasePo {
    /**
     * 请求来源
     */
    private Integer requestSource;
    /**
     * guid 操作唯一标识
     */
    private String guid;
    /**
     * 操作类型  0：新增缓存  1：删除缓存  2：获取缓存guid
     */
    private Integer operType;

    public Integer getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(Integer requestSource) {
        this.requestSource = requestSource;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getOperType() {
        return operType;
    }

    public void setOperType(Integer operType) {
        this.operType = operType;
    }
}
