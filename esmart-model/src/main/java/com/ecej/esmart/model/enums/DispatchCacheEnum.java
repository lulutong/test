package com.ecej.esmart.model.enums;

public enum DispatchCacheEnum {
	
	/**
	 * 更新小区信息关联表
	 */
	DISPATCH_SVC_COMMUNITY(0),
	
	/**
	 * 更新服务品类关联表
	 */
	DISPATCH_SVC_SERVICE_CLASS(1),
	
	/**
	 * 更新城市派工参数表
	 */
	DISPATCH_SVC_CITY_PARA_SETTING(2),
	
	/**
	 * 更新城市优选规则
	 */
	DISPATCH_PRIORITY_RULE_FORMULA(3),
	
	/**
	 * 更新城市剔除规则
	 */
	DISPATCH_SVC_EXCLUDE_RULE_DEFINE(4),
	
	/**
	 * 更新城市服务品类耗时
	 */
	DISPATCH_CITY_SERVICE_CLASS_REL(5),
	
	/**
	 * 更新满足技能标签的多能工
	 */
	DISPATCH_SVC_EMP_LABEL_RELATION(6),
	
	/**
	 * 更新员工与服务区域关联表
	 */
	DISPATCH_EMP_AREA_RELATION(7),
	
	/**
	 * 更新员工表
	 */
	DISPATCH_SVC_EMPLOYEE(8),
	
	/**
	 * 更新服务区域关联表
	 */
	DISPATCH_SVC_SERVICE_AREA_SETTING(9),
	
	/**
	 * 更新员工与服务站关联表
	 */
	DISPATCH_SVC_STATION_EMP_RELATION(10),
	
	/**
	 * 更新服务站关联表
	 */
	DISPATCH_SVC_STATION_INFO(11),
	
	/**
	 * 更新每月员工任务汇总表
	 */
	DISPATCH_SVC_MONTHLY_TASK_SUM(12),
	
	/**
	 * 更新员工情况表
	 */
	DISPATCH_SVC_EMP_WORK_CONDITON(13),
	
	
	/**
	 * 删除7日前的上一任务，下一任务缓存
	 */
	DISPATCH_DELETE_TASK(14),

	/**
	 * 员工服务品类关联关系
	 */
	EMP_SERVICE(16),

	/**
	 * 城市优选规则 2.0
	 */
	CITY_OPTIMIZATION_TWO(17),

	/**
	 * 查询员工技能标签数量
	 */
	EMP_SKILLS_LABEL_COUNT(18),

	/**
	 * 更新公司权重
	 */
	UPDATE_COMPANY_WEIGHTS(19),
	/**
	 * 公司开关
	 */
	DISPATCH_COMPANY_SWITCH_SETTING(20),
	
	/**
	 * 初始化派工所有缓存
	 */
	INIT_DISPATCH_ALL(15),
	
	/**
	 * 初始化城市缓存
	 */
	DISPATCH_SVC_CITY_INIT(21),
	
	/**
	 * 初始化服务大类缓存
	 */
	DISPATCH_SVC_BIG_CLASS_INIT(22),
	
	/**
	 * 初始化设备缓存
	 */
	DISPATCH_SVC_DEVICE_INIT(23),
	
	/**
	 * 初始化服务品类缓存
	 */
	DISPATCH_SVC_SERVICE_CLASS_INIT(24),
	
	/**
	 * 初始化技能标签缓存
	 */
	DISPATCH_SVC_SKILLLABEL_INIT(25),
	
	/**
	 * 初始化 服务项目名称
	 */
	DISPATCH_SERVICE_ITEM(26);
	
	/**
	 * code码
	 */
	private final Integer value;  
	    
	  /**
	 * @param value
	 */
	private DispatchCacheEnum(Integer value){  
	      this.value = value;  
	  }

	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

}
