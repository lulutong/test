
package com.ecej.esmart.model.ecejservice;

public class SvcOrderExtensionPo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SvcOrderExtension";
	

	//columns START
    /**
     * 订单id       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 订单编号       db_column: order_no   
     */ 	
	private String orderNo;
    /**
     * 分配状态 0待分配,1已分配       db_column: order_state   
     */ 	
	private Integer orderState;
    /**
     * 已分配员工id       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 工长id       db_column: work_leader_id   
     */ 	
	private Integer workLeaderId;
    /**
     * 创建时间       db_column: screate_time   
     */ 	
	private java.util.Date screateTime;
    /**
     * 更新时间       db_column: supdate_time   
     */ 	
	private java.util.Date supdateTime;
    /**
     * 是否有自定义项目(0:没有,1:有)       db_column: is_custom_service_item_flag   
     */ 	
	private Integer isCustomServiceItemFlag;
    /**
     * 是否有自定义物料（0:没有,1:有）       db_column: is_custom_material_flag   
     */ 	
	private Integer isCustomMaterialFlag;
    /**
     * 自定义物料金额       db_column: custom_material_money   
     */ 	
	private java.math.BigDecimal customMaterialMoney;
    /**
     * 1:删除 0:未删除       db_column: del_flag   
     */ 	
	private Integer delFlag;
	//columns END


	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	
	
	public String getOrderNo() {
		return this.orderNo;
	}
	
	public void setOrderNo(String value) {
		this.orderNo = value;
	}
	
	
	public Integer getOrderState() {
		return this.orderState;
	}
	
	public void setOrderState(Integer value) {
		this.orderState = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getWorkLeaderId() {
		return this.workLeaderId;
	}
	
	public void setWorkLeaderId(Integer value) {
		this.workLeaderId = value;
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
	
	
	public Integer getIsCustomServiceItemFlag() {
		return this.isCustomServiceItemFlag;
	}
	
	public void setIsCustomServiceItemFlag(Integer value) {
		this.isCustomServiceItemFlag = value;
	}
	
	
	public Integer getIsCustomMaterialFlag() {
		return this.isCustomMaterialFlag;
	}
	
	public void setIsCustomMaterialFlag(Integer value) {
		this.isCustomMaterialFlag = value;
	}
	
	
	public java.math.BigDecimal getCustomMaterialMoney() {
		return this.customMaterialMoney;
	}
	
	public void setCustomMaterialMoney(java.math.BigDecimal value) {
		this.customMaterialMoney = value;
	}
	
	
	public Integer getDelFlag() {
		return this.delFlag;
	}
	
	public void setDelFlag(Integer value) {
		this.delFlag = value;
	}
	

	

}

