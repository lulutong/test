package com.ecej.esmart.model.monitor.common;

/**
 * <p>
 *    平台派工、抢单 订单修改原因类型
 *    已承接订单  ACCORDER (订单状态：2)
 *    出发预警    DEPWARN (订单状态：2  用户预约上门时间前多少小时： ) 注：需要计算
 *    未承接订单  UNACCORDER (订单状态：101、102、1)
 *    服务中订单  SERVICING (订单状态：4，5)
 *    已完成订单  FINISHED (订单状态：6，7)
 *    已取消订单  CANCELED (订单状态：8，150)
 * </p>
 *
 * @author kevin
 * @create 2018-01-09 10:45
 **/
public enum OrderStatusFlagEnum {

    已承接订单(1,"ACCORDER"),出发预警(2,"DEPWARN"),未承接订单(3,"UNACCORDER"),服务中订单(4,"SERVICING"),已完成订单(5,"FINISHED"),已取消订单(6,"CANCELED");

    private Integer key;
    private String desc;

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return desc;
    }

    OrderStatusFlagEnum(Integer key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    public static String getOrderStatusFlagEnum(Integer key) {
        OrderStatusFlagEnum[] enums = OrderStatusFlagEnum.values();
        for (int i = 0;   key != null && i < enums.length; i++) {
            if (enums[i].getKey().intValue()==key.intValue()) {
                return enums[i].getValue();
            }
        }
        return "";
    }


}
