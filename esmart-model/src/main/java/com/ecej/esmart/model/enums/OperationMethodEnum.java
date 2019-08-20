package com.ecej.esmart.model.enums;

/**
 * 操作方法枚举
 */
public enum OperationMethodEnum {
    /**
     * 创建
     */
    CREATE("创建"),

    /**
     * 改约
     */
    AMEND_TREATY("改约"),
    /**
     * 运营平台指定公司改约
     */
    AMEND_TREATY_COMPANY("运营平台指定公司改约"),
    /**
     * 改派
     */
    AMEND_DISPATCH("改派"),
    /**
     * 派工
     */
    DISPATCH_WORK("派工");


    private final String value;

    private OperationMethodEnum(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
