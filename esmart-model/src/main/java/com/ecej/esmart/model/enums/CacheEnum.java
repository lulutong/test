package com.ecej.esmart.model.enums;

/**
 * 描述:test
 *
 * @author yanpenglei
 * @create 2017-11-16 15:50
 **/
public enum CacheEnum {

    CACHE_DISPATCH_WORK_FORM("common:dispatch:WORK_FORM", "创建工单缓存"),

    CACHE_DISPATCH_OPERATOR_LOG("common:dispatch:OPERATOR_LOG", "派工操作日志"),

    CACHE_DISPATCH_SWITCH_SCHEDULE("common:dispatch:SWITCH_SCHEDULE", "排版优化切换"),

    CACHE_INSERT_GRAB_ORDER_INPUT("common:dispatch:INSERT_GRAB_ORDER_INPUT", "抢单池或派单池 区域ID，服务站 ，状态，相关"),

    CACHE_INSERT_GRAB_ORDER_POOL_INPUT("common:dispatch:INSERT_GRAB_ORDER_POOL_INPUT", "抢单池"),

    CACHE_INSERT_DIPATCH_ORDER_POOL_INPUT("common:dispatch:INSERT_DIPATCH_ORDER_POOL_INPUT", "派单池"),

    CACHE_PLATFORM_EMP_DISPATCH("common:dispatch:PLATFORM_EMP_DISPATCH", "平台确认师傅预占员工缓存"),

    CACHE_CYCLE_ORDER("common:dispatch:CYCLE_ORDER:", "周期订单预占时间列表缓存"),

    CACHE_CYCLE_ORDER_DIRECTORY("common:dispatch:CYCLE_ORDER_GUID", "周期订单预占时间列表缓存目录"),

    CACHE_SHART_V4("common:dispatch:CACHE_SHART_V4:", "派工 V4 缓存"),
    CACHE_LOCK_V4("common:dispatch:COMM_EMP_DISPATCH_V4", "派工 V4 缓存"),
    CACHE_LOCK_G_EMP_V4("common:dispatch:COMM_EMP_DISPATCH_V4_", "派工 V4 缓存"),
    ;

    private final String key;
    private final String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    CacheEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getCacheEnumValue(String key) {
        CacheEnum[] enums = CacheEnum.values();
        for (int i = 0; key != "" && key != null && i < enums.length; i++) {
            if (enums[i].getKey().trim().equals(key.trim())) {
                return enums[i].getValue();
            }
        }
        return "";
    }
}
