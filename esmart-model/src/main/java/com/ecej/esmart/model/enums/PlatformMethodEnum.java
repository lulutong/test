package com.ecej.esmart.model.enums;

/**
 * 描述:确认多能工枚举
 *
 * @author yanpenglei
 * @create 2017-10-31 12:06
 **/
public enum PlatformMethodEnum {

    USER_CREATE("1", "用户下单"),

    USER_AMEND_TREATY("2", "用户改约"),

    EMP_AMEND_TREATY("3", "员工改约"),

    EMP_AMEND_DISPATCH("4", "员工改派"),

    EMP_GET_TASK("5", "员工领取任务"),

    CRM_CREATE("6", "呼叫中心下单"),

    CRM_AMEND_TREATY("7", "呼叫中心改约"),

    AUTO_DISPATCH("8", "自动派工"),

    STATION_AMEND_TREATY("9", "运营平台改约"),

    STATION_AMEND_DISPATCH("10", "运营平台改派"),

    AUTO_DISPATCH_UPGRADE("12", "自动派工"),

    WE_CHAT_DISPATCH("13", "微信立刻下单"),

    STATION_AMEND_TREATY_COMPANY("14", "运营平台指定公司改约");

    private final String key;
    private final String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    PlatformMethodEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getMessageEnumValue(String key) {
        PlatformMethodEnum[] enums = PlatformMethodEnum.values();
        for (int i = 0; key != "" && key != null && i < enums.length; i++) {
            if (enums[i].getKey().trim().equals(key.trim())) {
                return enums[i].getValue();
            }
        }
        return "";
    }

}
