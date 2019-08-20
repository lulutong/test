
package com.ecej.esmart.model.ecejservice;
import com.ecej.nove.base.po.BasePo;

public class EsmartOrderPoolServiceClassRelPo extends BasePo {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "EsmartOrderPoolServiceClassRel";
	

	//columns START
    /**
     * 任务池服务品类关联id       db_column: order_pool_service_class_id   
     */ 	
	private Integer orderPoolServiceClassId;
    /**
     * 任务id       db_column: order_pool_id   
     */ 	
	private Integer orderPoolId;
    /**
     * 0:抢单池 1:派单池       db_column: pool_flag   
     */ 	
	private Integer poolFlag;
    /**
     * 服务品类id       db_column: service_class_id   
     */ 	
	private Integer serviceClassId;
    /**
     * 数量       db_column: quantity   
     */ 	
	private Integer quantity;
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
     * 创建者       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 更新者       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 订单id       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
	//columns END


	
	
	public Integer getOrderPoolServiceClassId() {
		return this.orderPoolServiceClassId;
	}
	
	public void setOrderPoolServiceClassId(Integer value) {
		this.orderPoolServiceClassId = value;
	}
	
	
	public Integer getOrderPoolId() {
		return this.orderPoolId;
	}
	
	public void setOrderPoolId(Integer value) {
		this.orderPoolId = value;
	}
	
	
	public Integer getPoolFlag() {
		return this.poolFlag;
	}
	
	public void setPoolFlag(Integer value) {
		this.poolFlag = value;
	}
	
	
	public Integer getServiceClassId() {
		return this.serviceClassId;
	}
	
	public void setServiceClassId(Integer value) {
		this.serviceClassId = value;
	}
	
	
	public Integer getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(Integer value) {
		this.quantity = value;
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
	
	
	public Integer getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(Integer value) {
		this.createUser = value;
	}
	
	
	public Integer getUpdateUser() {
		return this.updateUser;
	}
	
	public void setUpdateUser(Integer value) {
		this.updateUser = value;
	}
	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	

	

}

