package com.ecej.esmart.model.enums;

public enum PlartformRecommEnum {


    POINTERR(701, "经纬度没有服务区"),

    COMPANYNOSERVICE(702, "公司未承接服务品类"),

    AREANOSERVICE(703, "服务区域未承接品类"),

    AREANOEMP(704, "服务区域没有多能工"),

    EMPNOSKILLLABEL(705, "多能工没有技能标签"),

    EMPNOSERVICE(706, "多能工没有服务品类"),

    EMPCATERR(707, "多能工类型不匹配"),

    EMPSTATEERR(708, "员工状态异常"),

    EMPHOLIDAY(709, "员工请假"),

    EMPFIXEDREST(710, "员工固定休息"),

    EMPNOAREA(711,"员工没有配置服务区域"),

    EMPNOTIME(712, "没时间或没排班"),

    INTERFACEERR(713, "接口调用错误");

    private final Integer code;
    private final String  msg;

    PlartformRecommEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }

}
