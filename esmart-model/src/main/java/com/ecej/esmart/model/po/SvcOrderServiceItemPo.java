
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcOrderServiceItemPo extends BasePo {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SvcOrderServiceItem";
	

	//columns START
    /**
     * 订单服务项目id       db_column: service_item_id   
     */ 	
	private Integer serviceItemId;
    /**
     * 服务工单id       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 服务品类id       db_column: service_class_id   
     */ 	
	private Integer serviceClassId;
    /**
     * 品类名称       db_column: service_class_name   
     */ 	
	private String serviceClassName;
    /**
     * 项目id       db_column: item_id   
     */ 	
	private Integer itemId;
    /**
     * 项目类型       db_column: item_type   
     */ 	
	private Integer itemType;
    /**
     * 项目名称       db_column: item_name   
     */ 	
	private String itemName;
    /**
     * 原价       db_column: unit_price   
     */ 	
	private java.math.BigDecimal unitPrice;
    /**
     * 应收金额       db_column: receivable_money   
     */ 	
	private java.math.BigDecimal receivableMoney;
    /**
     * 实收金额       db_column: paid_money   
     */ 	
	private java.math.BigDecimal paidMoney;
    /**
     * 结算分类编码       db_column: settle_class_code_no   
     */ 	
	private String settleClassCodeNo;
    /**
     * 结算分类名称       db_column: settle_class_name   
     */ 	
	private String settleClassName;
    /**
     * 维保渠道商ID       db_column: maintenance_channel_id   
     */ 	
	private Integer maintenanceChannelId;
    /**
     * 保内标识(0-保外；1-保内)       db_column: insurance_mark   
     */ 	
	private Integer insuranceMark;
    /**
     * app记录id(离线数据库记录)       db_column: app_record_id   
     */ 	
	private Integer appRecordId;
    /**
     * 数量       db_column: quantity   
     */ 	
	private Integer quantity;
    /**
     * 合作方承担金额       db_column: partner_commitment   
     */ 	
	private java.math.BigDecimal partnerCommitment;
    /**
     * 数据创建时间       db_column: screate_time   
     */ 	
	private java.util.Date screateTime;
    /**
     * 数据更新时间       db_column: supdate_time   
     */ 	
	private java.util.Date supdateTime;
    /**
     * 1:删除 0:未删除       db_column: del_flag   
     */ 	
	private Integer delFlag;
    /**
     * 结算金额       db_column: settle_amount   
     */ 	
	private java.math.BigDecimal settleAmount;
    /**
     * 商城代收金额       db_column: mall_collection_amount   
     */ 	
	private java.math.BigDecimal mallCollectionAmount;
    /**
     * 订单类型(正常单100、拼多多101、商11城直发102、送装一体103、零散接驳104、B端105, 组合106,保洁服务项目107,平台工录单108)       db_column: order_type   
     */ 	
	private Integer orderType;
    /**
     * B端商家ID       db_column: threeparty_merchan_id   
     */ 	
	private String threepartyMerchanId;
    /**
     * 订单操作角色（1 用户 2员工 3呼叫中心 4平台工长 5平台工友）       db_column: order_operation_role   
     */ 	
	private Integer orderOperationRole;
    /**
     * 是否商家承担费用(0不承担，1承担,2与商家无关)       db_column: is_threeparty_merchan_cost   
     */ 	
	private Integer isThreepartyMerchanCost;
    /**
     * 商家结算金额       db_column: merchan_settle_Amount   
     */ 	
	private java.math.BigDecimal merchanSettleAmount;
    /**
     * ecej原价       db_column: ecej_price   
     */ 	
	private java.math.BigDecimal ecejPrice;
    /**
     * 组合ID       db_column: combination_id   
     */ 	
	private Integer combinationId;
    /**
     * reductionDetail       db_column: reduction_detail   
     */ 	
	private String reductionDetail;
    /**
     * 1=是 0=否,默认:0       db_column: is_prepayment_mode   
     */ 	
	private Integer isPrepaymentMode;
    /**
     * 1=部分支付 2=全额支付,默认:2       db_column: prepayment_type   
     */ 	
	private Integer prepaymentType;
    /**
     * 预付费用,默认:0       db_column: prepayment_money   
     */ 	
	private java.math.BigDecimal prepaymentMoney;
    /**
     * 1=是 0=否,默认:0       db_column: is_ordercenter_create   
     */ 	
	private Integer isOrdercenterCreate;
    /**
     * 业务类型配置id       db_column: business_type_configuration_id   
     */ 	
	private Integer businessTypeConfigurationId;
    /**
     * 一级业务分类       db_column: business_first_type_id   
     */ 	
	private Integer businessFirstTypeId;
    /**
     * 二级业务分类       db_column: business_second_type_id   
     */ 	
	private Integer businessSecondTypeId;
    /**
     * 三级业务类型信息       db_column: business_thir_att_json   
     */ 	
	private String businessThirAttJson;
    /**
     * 自定义单价（平台工录单专用）       db_column: custom_unit_price   
     */ 	
	private java.math.BigDecimal customUnitPrice;
    /**
     * 服务项目类型 0=指定服务项目 1=其他服务项目 默认为0       db_column: platform_item_type   
     */ 	
	private Integer platformItemType;
    /**
     * 服务项目的优惠券id       db_column: coupon_id   
     */ 	
	private Integer couponId;
	//columns END


	
	
	public Integer getServiceItemId() {
		return this.serviceItemId;
	}
	
	public void setServiceItemId(Integer value) {
		this.serviceItemId = value;
	}
	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	
	
	public Integer getServiceClassId() {
		return this.serviceClassId;
	}
	
	public void setServiceClassId(Integer value) {
		this.serviceClassId = value;
	}
	
	
	public String getServiceClassName() {
		return this.serviceClassName;
	}
	
	public void setServiceClassName(String value) {
		this.serviceClassName = value;
	}
	
	
	public Integer getItemId() {
		return this.itemId;
	}
	
	public void setItemId(Integer value) {
		this.itemId = value;
	}
	
	
	public Integer getItemType() {
		return this.itemType;
	}
	
	public void setItemType(Integer value) {
		this.itemType = value;
	}
	
	
	public String getItemName() {
		return this.itemName;
	}
	
	public void setItemName(String value) {
		this.itemName = value;
	}
	
	
	public java.math.BigDecimal getUnitPrice() {
		return this.unitPrice;
	}
	
	public void setUnitPrice(java.math.BigDecimal value) {
		this.unitPrice = value;
	}
	
	
	public java.math.BigDecimal getReceivableMoney() {
		return this.receivableMoney;
	}
	
	public void setReceivableMoney(java.math.BigDecimal value) {
		this.receivableMoney = value;
	}
	
	
	public java.math.BigDecimal getPaidMoney() {
		return this.paidMoney;
	}
	
	public void setPaidMoney(java.math.BigDecimal value) {
		this.paidMoney = value;
	}
	
	
	public String getSettleClassCodeNo() {
		return this.settleClassCodeNo;
	}
	
	public void setSettleClassCodeNo(String value) {
		this.settleClassCodeNo = value;
	}
	
	
	public String getSettleClassName() {
		return this.settleClassName;
	}
	
	public void setSettleClassName(String value) {
		this.settleClassName = value;
	}
	
	
	public Integer getMaintenanceChannelId() {
		return this.maintenanceChannelId;
	}
	
	public void setMaintenanceChannelId(Integer value) {
		this.maintenanceChannelId = value;
	}
	
	
	public Integer getInsuranceMark() {
		return this.insuranceMark;
	}
	
	public void setInsuranceMark(Integer value) {
		this.insuranceMark = value;
	}
	
	
	public Integer getAppRecordId() {
		return this.appRecordId;
	}
	
	public void setAppRecordId(Integer value) {
		this.appRecordId = value;
	}
	
	
	public Integer getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(Integer value) {
		this.quantity = value;
	}
	
	
	public java.math.BigDecimal getPartnerCommitment() {
		return this.partnerCommitment;
	}
	
	public void setPartnerCommitment(java.math.BigDecimal value) {
		this.partnerCommitment = value;
	}
	
	
	public java.util.Date getScreateTime() {
		return this.screateTime;
	}
	
	public void setScreateTime(java.util.Date value) {
		this.screateTime = value;
	}
	
	
	public java.util.Date getSupdateTime() {
		return this.supdateTime;
	}
	
	public void setSupdateTime(java.util.Date value) {
		this.supdateTime = value;
	}
	
	
	public Integer getDelFlag() {
		return this.delFlag;
	}
	
	public void setDelFlag(Integer value) {
		this.delFlag = value;
	}
	
	
	public java.math.BigDecimal getSettleAmount() {
		return this.settleAmount;
	}
	
	public void setSettleAmount(java.math.BigDecimal value) {
		this.settleAmount = value;
	}
	
	
	public java.math.BigDecimal getMallCollectionAmount() {
		return this.mallCollectionAmount;
	}
	
	public void setMallCollectionAmount(java.math.BigDecimal value) {
		this.mallCollectionAmount = value;
	}
	
	
	public Integer getOrderType() {
		return this.orderType;
	}
	
	public void setOrderType(Integer value) {
		this.orderType = value;
	}
	
	
	public String getThreepartyMerchanId() {
		return this.threepartyMerchanId;
	}
	
	public void setThreepartyMerchanId(String value) {
		this.threepartyMerchanId = value;
	}
	
	
	public Integer getOrderOperationRole() {
		return this.orderOperationRole;
	}
	
	public void setOrderOperationRole(Integer value) {
		this.orderOperationRole = value;
	}
	
	
	public Integer getIsThreepartyMerchanCost() {
		return this.isThreepartyMerchanCost;
	}
	
	public void setIsThreepartyMerchanCost(Integer value) {
		this.isThreepartyMerchanCost = value;
	}
	
	
	public java.math.BigDecimal getMerchanSettleAmount() {
		return this.merchanSettleAmount;
	}
	
	public void setMerchanSettleAmount(java.math.BigDecimal value) {
		this.merchanSettleAmount = value;
	}
	
	
	public java.math.BigDecimal getEcejPrice() {
		return this.ecejPrice;
	}
	
	public void setEcejPrice(java.math.BigDecimal value) {
		this.ecejPrice = value;
	}
	
	
	public Integer getCombinationId() {
		return this.combinationId;
	}
	
	public void setCombinationId(Integer value) {
		this.combinationId = value;
	}
	
	
	public String getReductionDetail() {
		return this.reductionDetail;
	}
	
	public void setReductionDetail(String value) {
		this.reductionDetail = value;
	}
	
	
	public Integer getIsPrepaymentMode() {
		return this.isPrepaymentMode;
	}
	
	public void setIsPrepaymentMode(Integer value) {
		this.isPrepaymentMode = value;
	}
	
	
	public Integer getPrepaymentType() {
		return this.prepaymentType;
	}
	
	public void setPrepaymentType(Integer value) {
		this.prepaymentType = value;
	}
	
	
	public java.math.BigDecimal getPrepaymentMoney() {
		return this.prepaymentMoney;
	}
	
	public void setPrepaymentMoney(java.math.BigDecimal value) {
		this.prepaymentMoney = value;
	}
	
	
	public Integer getIsOrdercenterCreate() {
		return this.isOrdercenterCreate;
	}
	
	public void setIsOrdercenterCreate(Integer value) {
		this.isOrdercenterCreate = value;
	}
	
	
	public Integer getBusinessTypeConfigurationId() {
		return this.businessTypeConfigurationId;
	}
	
	public void setBusinessTypeConfigurationId(Integer value) {
		this.businessTypeConfigurationId = value;
	}
	
	
	public Integer getBusinessFirstTypeId() {
		return this.businessFirstTypeId;
	}
	
	public void setBusinessFirstTypeId(Integer value) {
		this.businessFirstTypeId = value;
	}
	
	
	public Integer getBusinessSecondTypeId() {
		return this.businessSecondTypeId;
	}
	
	public void setBusinessSecondTypeId(Integer value) {
		this.businessSecondTypeId = value;
	}
	
	
	public String getBusinessThirAttJson() {
		return this.businessThirAttJson;
	}
	
	public void setBusinessThirAttJson(String value) {
		this.businessThirAttJson = value;
	}
	
	
	public java.math.BigDecimal getCustomUnitPrice() {
		return this.customUnitPrice;
	}
	
	public void setCustomUnitPrice(java.math.BigDecimal value) {
		this.customUnitPrice = value;
	}
	
	
	public Integer getPlatformItemType() {
		return this.platformItemType;
	}
	
	public void setPlatformItemType(Integer value) {
		this.platformItemType = value;
	}
	
	
	public Integer getCouponId() {
		return this.couponId;
	}
	
	public void setCouponId(Integer value) {
		this.couponId = value;
	}
	

	

}

