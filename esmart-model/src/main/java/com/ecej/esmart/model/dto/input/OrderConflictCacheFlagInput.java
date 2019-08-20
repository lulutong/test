package com.ecej.esmart.model.dto.input;

import com.ecej.nove.base.po.BasePo;

/**
 * <p>是否允许档期冲突改约改派，入参</p>
 *
 * @author kevin
 * @create 2018-08-09 14:27
 **/
public class OrderConflictCacheFlagInput extends BasePo {
    /**
     * 请求来源
     */
    private Integer requestSource;
    /**
     * guid 操作唯一标识
     */
    private String guid;
    /**
     * 操作类型  0：新增缓存（允许档期冲突改约改派）  1：删除缓存（不允许档期冲突改约改派）  2：获取缓存guid（获取是否允许改约改派标识）
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
