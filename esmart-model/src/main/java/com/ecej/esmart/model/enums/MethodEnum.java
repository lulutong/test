package com.ecej.esmart.model.enums;

/**
 * 描述:
 *
 * @author yanpenglei
 * @create 2018-03-05 19:32
 **/
public enum MethodEnum {

    CREATE("创建"),

    RETIME("改约"),

    REASSIGN("改派"),

    ASSIGN("派工"),

    CANCEL("取消"),

    COMPLETE("完成");

    private final String value;

    private MethodEnum(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

}
