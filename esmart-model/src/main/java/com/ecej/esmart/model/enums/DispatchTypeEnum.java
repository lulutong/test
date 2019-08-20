package com.ecej.esmart.model.enums;

/**
 * MQ修改工单操作数字标志
 *
 * @author
 * @create 2017-11-17 16:01
 **/
public enum DispatchTypeEnum {

    EXTENSION_CODE_DISPATCH(1, "推广码立刻下单"),
    ACTIVITY_PUSH_DISPATCH(2, "地推活动立刻下单"),
    TASK_POOL_DISPATCH(3, "任务池领取任务"),
    STATION_DISPATCH(4, "手动派工"),
    URGENT_DISPATCH(5, "应急派工"),
    UPGRADE_DISPATCH(6, "重单派工"),
    SYSTEM_AUTO_DISPATCH(7, "常规自动派工"),
    OVERDUE_SYSTEM_AUTO_DISPATCH(8, "超期自动派工"),
    OVERDUE_STATION_DISPATCH(9, "超期手动派工"),
    WARN_DISPATCH(10, "预警"),
    URGENT_SERVICE_DISPATCH(11, "紧急品类派工");

    private final int code;
    private final String describe;

    public int getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }

    DispatchTypeEnum(int code, String describe) {
        this.code = code;
        this.describe = describe;
    }

}
