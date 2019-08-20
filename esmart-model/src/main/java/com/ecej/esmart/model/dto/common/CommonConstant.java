package com.ecej.esmart.model.dto.common;

/**
 * <p>共通常量</p>
 *
 * @author kevin
 * @create 2018-01-24 10:06
 **/
public class CommonConstant {
    //导出数据设定总量大小
    public static final Integer exportSumCount = 10000;
    //分页查询最大值
    public static final Integer pageMaxCount = 10000;
    //分页查询最小值
    public static final Integer pageMinCount = 0;

    //员工一天排班长度（10分钟一格）
    public static final int daySchedule = 144;

    //返回Result成功码
    public static final Integer successCode = 0;

    //返回Result失败码
    public static final Integer failCode = 1;

    public static final String set = "set";

    public static final String get = "get";

    //英文逗号
    public static final String commaEn = ",";
    //星号
    public static final String asterisk = "*";
    //中线
    public static final String centerLine = "-";
    //竖线
    public static final String verticalLine = "|";
    //冒号
    public static final String colon = ":";

    /**
     * 菜单类型（0:子菜单;1:按钮）
     */
    public static final Integer menuTypeSub = 0;
    public static final Integer menuTypeButton = 1;

    /**
     * 缓存名，用于改派时记录是否需要计算员工的在途时间
     */
    public static final String COMMON_DISPATCH_REDISPATCH="common:dispatch:REDISPATCH";
    /**
     * 缓存key前缀，用于改派时记录是否需要计算员工的在途时间
     */
    public static final String REDISPATCH_PREX = "REDISPATCH_";
}
