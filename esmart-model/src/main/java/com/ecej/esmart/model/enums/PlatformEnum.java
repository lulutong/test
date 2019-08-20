package com.ecej.esmart.model.enums;

public enum PlatformEnum {
    CRM("3", "crm"),

    EMP("2", "员工"),

    STATION("4", "运营平台"),

    USER("1", "用户");

    private final String key;
    private final String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    PlatformEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getMessageEnumValue(String key) {
        PlatformEnum[] enums = PlatformEnum.values();
        for (int i = 0; key != "" && key != null && i < enums.length; i++) {
            if (enums[i].getKey().trim().equals(key.trim())) {
                return enums[i].getValue();
            }
        }
        return "";
    }


}
