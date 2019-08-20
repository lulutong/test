package com.ecej.esmart.model.enums;

/**
 * <p>类描述：共通项目组的返回消息枚举</p>
 *
 * @author 李凯 [peter]
 * @version: v1.0.0.1
 * @since JDK1.8
 * <p>创建日期：2016年5月25日 下午2:45:50</p>
 * Copyright 【新智泛能网络科技有限公司】 2016
 */

public enum MessageEnumOld {

    /**
     * 操作成功
     */
    SUCCESS(200, "请求已成功处理"),

	/*--------------------------------数据库类---------------------*/
    /**
     * 查询失败
     */
    QUERY_FAILURE(300, "查询失败"),
    /**
     * 添加失败
     */
    ADD_FAILURE(301, "添加失败"),

    /**
     * 更新失败
     */
    UPDATE_FAILURE(302, "更新失败"),

    /**
     * 删除失败
     */
    DELETE_FAILURE(303, "删除失败"),

	
	
	
	
	/*-----------------------------------消息类--------------------*/
    /**
     * 邮件发送失败
     */
    EMAIL_SEND_FAILURE(400, "邮件发送失败"),
    /**
     * 消息推送失败
     */
    MESSAGE_SEND_FAILURE(401, "消息推送失败"),
    /**
     * 消息推送失败
     */
    SMS_SEND_FAILURE(402, "短信发送失败"),
	
	
	/*-----------------------------------师傅派工类--------------------*/
    /**
     * 下班后预约
     */
    AFTER_WORK_SUBSCRIBE(500, "下班后预约"),
    /**
     * 当天预约已满
     */
    SUBSCRIBE_IS_FULL(501, "当天预约已满"),
    /**
     * 时间段内无师傅
     */
    TIME_PERIOD_NO_MASTER(502, "时间段内无师傅"),
    /**
     * 无服务区
     */
    NO_SERVICEAREAINFO(503, "超出服务范围"),

    //师傅此时间段，没有空闲时间了   
    QUERY_EMP_FAILURE(504, "此时间段没有空闲的师傅了，请换个时间!"),


    NO_SCHEDULE(505, "无排班师傅占用档期成功"),


    NO_RELEASE(506, "无排班师傅释放档期成功"),

    LOCK_OTHER(507, "档期已被其他用户锁定"),

    ALREADY_USED(508, "档期已被占用"),

    NO_TIME(509, "没有足够档期"),

    DISABLED_TIME(510, "时间不可用"),

    NO_EMP(511, "该时间段繁忙，请重新选择时间"),

    EMP_DIS_MAX_ORDER_NUM(512, "员工最大派工单超限"),

    CANNOT_CHANGE_BECAUSE_CLOSED(513, "订单状态已改变，改约失败"),

    NO_RESOURCE_REFUSE_CREATE_ORDER(515, "本服务品类，不允许下无资源订单"),

    NO_CITY_NIGHT_SCHEDULE_EMP(516, "没有配置城市夜班值班员工"),
	
	/*-----------------------------------SAP主数据类--------------------*/
	
	/*-----------------------------------阶梯计费类--------------------*/
	
	/*-----------------------------------网络异常类--------------------*/
    /**
     * 建立FastDfs上传服务器连接失败
     */
    CONNECT_FASTDFS_FAILURE(800, "建立FastDfs上传服务器连接失败"),
	/*-----------------------------------文件异常类--------------------*/
    /**
     * 获取文件路径失败
     */
    GET_FILE_FAILURE(900, "获取文件路径失败"),
    /**
     * 文件上传失败
     */
    FILE_UPLOAD_FAILURE(901, "文件上传失败"),
    /**
     * 图片上传失败
     */
    IMAGE_UPLOAD_FAILURE(902, "图片上传失败"),
    /**
     * 缩略图生成失败
     */
    ZOOM_IMAGE_CREATE_FAILURE(903, "缩略图生成失败"),
    /**
     * 缩略图片上传失败
     */
    ZOOM_IMAGE_UPLOAD_FAILURE(904, "缩略图片上传失败"),
    /**
     * 添加水印文字失败
     */
    WATER_ADD_TEXT_FAILURE(905, "添加水印文字失败"),
    /**
     * 添加水印图片失败
     */
    WATER_ADD_IMAGE_FAILURE(906, "添加水印图片失败"),
    /**
     * 配置文件读取异常
     */
    PROPERTIES_READ_FAILURE(907, "配置文件读取异常"),
	
	
	/*-----------------------------------通用类--------------------*/
    /**
     * 参数异常
     */
    PARAMETER_EXCEPTION(1000, "参数异常");

    /**
     * code码
     */
    private final Integer value;
    /**
     * 描述
     */
    private final String desc;

    /**
     * @param value
     */
    private MessageEnumOld(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    /**
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 根据索引获取对应的枚举对象
     *
     * @param index
     * @return
     */
    public static String getEnumvalue(Integer index) {
        MessageEnumOld[] values = MessageEnumOld.values();
        for (MessageEnumOld value : values) {
            if (value.getValue().intValue() == index) {
                return value.getDesc();
            }
        }
        return null;
    }
}
