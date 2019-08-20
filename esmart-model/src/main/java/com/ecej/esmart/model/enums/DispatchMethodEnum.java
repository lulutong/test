package com.ecej.esmart.model.enums;

/**
 * MQ修改工单操作数字标志
 *
 * @author
 * @create 2017-11-17 16:01
 **/
public enum DispatchMethodEnum {

    CREATE("1", "创建"),

    RETIME("2", "改约"),

    REASSIGN("3", "改派"),

    ASSIGN("4", "派工"),

    APPLY("5", "员工申领"),

    COMPLETE("6", "完成"),

    CANCEL("7", "取消"),

    CLAIMS("8", "申领"),

    CLAIMS_CANCEL("9", "取消申领"),

    EMP_REFORE("10", "人员对调"),

    ADD_ORDER("11", "加单"),

    RECEIVING_ORDER("12", "接单"),

    CANCEL_RECEIVING_ORDER("13", "取消接单");

    private final String key;
    private final String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    DispatchMethodEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getMessageEnumValue(String key) {
        DispatchMethodEnum[] enums = DispatchMethodEnum.values();
        for (int i = 0; key != "" && key != null && i < enums.length; i++) {
            if (enums[i].getKey().trim().equals(key.trim())) {
                return enums[i].getValue();
            }
        }
        return "";
    }

}
