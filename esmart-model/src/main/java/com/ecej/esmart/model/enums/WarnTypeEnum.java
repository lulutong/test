package com.ecej.esmart.model.enums;

/**
 * @author junbaor
 */
public enum WarnTypeEnum {

    UN_KNOW(0, "未知异常"),
    NO_EMP_AREA(1, "区域下无可用员工"),
    NO_EMP_SERVICE_SKILL(2, "无满足技能品类的员工"),
    NO_EMP_EXCLUDE(3, "剔除后无可用员工"),
    NO_SCHEDULE(4, "无排班人员"),
    NO_TIME(5, "无可用时间"),
    NO_TIME_UPGRADE(6, "无可用升级时间"),
    NO_TIME_URGENT(7, "无可用应急时间"),
    ORDER_EXCEPTION(8, "订单数据异常"),
    BOOK_TIME_EXCEPTION(9, "预约时间异常"),
    NO_MEET_TIME(10, "不满足派工时间"),
    UPGRADE_OFF(11, "重单开关未启用");

    private final int code;
    private final String describe;

    public int getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }

    WarnTypeEnum(int code, String describe) {
        this.code = code;
        this.describe = describe;
    }

}
