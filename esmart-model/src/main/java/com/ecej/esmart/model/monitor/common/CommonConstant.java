package com.ecej.esmart.model.monitor.common;

/**
 * <p>共通常量</p>
 *
 * @author kevin
 * @create 2018-01-24 10:06
 **/
public class CommonConstant {
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

    //推送信息员工类型
    public static final Integer PUSH_TYPE_EMP = 1;
    //推送信息订单类型
    public static final Integer PUSH_TYPE_ORDER = 0;
    //推送信息统计类型
    public static final Integer PUSH_TYPE_STATISTIC = 3;

    /**
     * 缓存名，用于改派时记录是否需要计算员工的在途时间
     */
    public static final String COMMON_DISPATCH_REDISPATCH="common:dispatch:REDISPATCH";
    /**
     * 缓存key前缀，用于改派时记录是否需要计算员工的在途时间
     */
    public static final String REDISPATCH_PREX = "REDISPATCH_";

    /**
     * 派工监控websocket-session信息，保存sessionID和登录用户ID
     */
    public static final String COMMON_DISPATCH_MONITOR_SESSION="common:dispatch:monitor:SESSION";
    /**
     * 派工监控用户信息，及前端过滤条件临时存储
     */
    public static final String COMMON_DISPATCH_MONITOR_FILTER="common:dispatch:monitor:FILTER";
}
