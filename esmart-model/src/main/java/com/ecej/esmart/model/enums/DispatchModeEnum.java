package com.ecej.esmart.model.enums;

/**
 * 描述:派工模式
 *
 * @author yanpenglei
 * @create 2018-03-07 10:31
 **/
public enum DispatchModeEnum {

    DYNAMIC_DISPATCHING(1, "动态派工"),

    GRAB_ORDER(2, "抢单"),

    DISPATCH_ORDER(3, "派单");

    private final int code;
    private final String describe;

    public int getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }

    DispatchModeEnum(int code, String describe) {
        this.code = code;
        this.describe = describe;
    }
}
