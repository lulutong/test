package com.ecej.esmart.model.enums;

public enum MessageEnum {
    SUCCESS("000000", "请求已成功处理"),

    PARAMETER_EXCEPTION("000001", "参数异常"),

    EXCEPTION("000002", "未知异常"),
    /*-----------------------------------师傅派工类--------------------*/
	/**
	 * 当天预约已满
	 */
	SUBSCRIBE_IS_FULL("100001","当天预约已满"), //501
	/**
	 * 时间段内无师傅
	 */
	TIME_PERIOD_NO_MASTER("100002","可预约时间内资源全满"), //502
	/**
	 * 无服务区
	 */
	NO_SERVICEAREAINFO("100003","超出服务范围"), //503
	
    //师傅此时间段，没有空闲时间了   
	QUERY_EMP_FAILURE("100004","此时间段没有空闲的师傅了，请换个时间!"), //504
	
	NO_SCHEDULE ("100005","无排班师傅占用资源成功"), //505
	
	NO_RELEASE ("100006","无排班师傅释放资源成功"),  //506
	
	LOCK_OTHER ("100007","档期已被其他用户锁定"),  //507
	
	ALREADY_USED ("100008","档期已被占用"), //508
	
	NO_TIME ("100009","没有足够档期"), //509
	
	DISABLED_TIME ("100010","时间不可用"), //510
	
	NO_EMP ("100011","无可用师傅"), //511
	
	EMP_DIS_MAX_ORDER_NUM("100012","员工最大派工单超限"),//512
	
	CANNOT_CHANGE_BECAUSE_CLOSED("100013","订单状态已改变，改约失败"),//513

	NO_RESOURCE_REFUSE_CREATE_ORDER("100015","本服务品类，不允许下无资源订单"),//515

    QUERY_STATION_NULL("400000", "未查询到服务站"),

    POLYGON_AREA_IS_NULL("400001", "服务区域,多边形经纬度为空"),

    POLYGON_AREA_FORMAT_ERROR("400002", "服务区域,多边形经纬度格式错误"),

    NO_SERVICE_AREA_WAS_FOUND("400003", "经纬度没有匹配到指定条件的服务区域"),

    SERVICE_NO_EMP("400004", "没有查询到服务站多能工"),

    SERVICE_NO_STATION("400005", "没有查询到服务站"),

    SERVICE_NO_STATION_POINT("400006", "没有查询到服务站经纬度"),

    SERVICE_AREA_NO_COMPANYID("400007", "没有承接该服务品类的服务公司"),

    NO_SERVICE_CLASS("400008", "没有满足服务品类的多能工"),

    SERVICECLASSID_DISABLED("500001", "该服务品类未上线"),

    COMPANY_NO_SERVICECLASS("500002", "公司未开通服务品类"),

    CITY_NO_COMPANY("500003", "城市与公司不一致，请检查参数"),
    //6*****开头为工单注释
    UPDATE_WORKFORM_FAIL("600001", "修改工单失败，请检查参数"),

    INSERT_WORKFORM_FAIL("600002", "新增工单失败，请检查参数"),

    SEND_WORKFORM_MQ_FAIL("600003", "新增工单发送MQ失败"),

    SELECT_WORKFORM_FAIL("600004", "查询工单列表失败，请检查参数");

    private final String key;
    private final String value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    MessageEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static String getMessageEnumValue(String key) {
        MessageEnum[] enums = MessageEnum.values();
        for (int i = 0; key != "" && key != null && i < enums.length; i++) {
            if (enums[i].getKey().trim().equals(key.trim())) {
                return enums[i].getValue();
            }
        }
        return "";
    }
    public static MessageEnum getMessageEnum(String key) {
    	MessageEnum[] enums = MessageEnum.values();
    	for (int i = 0; key != "" && key != null && i < enums.length; i++) {
    		if (enums[i].getKey().trim().equals(key.trim())) {
    			return enums[i];
    		}
    	}
    	return null;
    }


}
