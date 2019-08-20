package com.ecej.esmart.model.enums;

/**
 * 描述: 请求来源枚举
 *
 * @author yanpenglei
 * @create 2017-11-01 16:36
 **/
public enum RequestSourceEnum {

    USER("1", "用户app创建"),
    SERVICE_HALL("2", "营业厅补气"),
    ALIPAY("3", "支付宝缴费平台创建"),
    OPERATION_PLATFORM("4", "运营平台"),
    EMP("5", "员工APP"),
    CRM("6", "CRM"),
    SHOP("10", "商城下单"),
    WE_CHAT("11", "微信下单"),
    H5("12", "H5下单"),
    NEW_CALL_CENTER("13", "新呼叫中心"),
    SCATTERED("14", "零散接驳"),
    MERCHANT_BACKSTAGE("15", "商家后台"),
    MERCHANT_APP("16", "商家APP"),
    SHOP_H5("17", "商城H5"),
    BUSSINESS_BACKSTAGE("18", "B端后补工单"),
    MERCHANT_WE_CHAT("19", "商家微信");

    private final String key;
    private final String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    RequestSourceEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getMessageEnumValue(String key) {
        RequestSourceEnum[] enums = RequestSourceEnum.values();
        for (int i = 0; key != "" && key != null && i < enums.length; i++) {
            if (enums[i].getKey().trim().equals(key.trim())) {
                return enums[i].getValue();
            }
        }
        return "";
    }
}
