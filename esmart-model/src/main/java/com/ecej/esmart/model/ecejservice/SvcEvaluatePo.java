
package com.ecej.esmart.model.ecejservice;

public class SvcEvaluatePo implements java.io.Serializable {

	public static final String TABLE_ALIAS = "SvcEvaluate";
	

	//columns START
    /**
     * 评价id       db_column: evaluate_id   
     */ 	
	private Integer evaluateId;
    /**
     * 服务工单id       db_column: work_order_id   
     */ 	
	private Integer workOrderId;
    /**
     * 父订单编号       db_column: father_order_no   
     */ 	
	private String fatherOrderNo;
    /**
     * 服务大类id       db_column: big_class_id   
     */ 	
	private Integer bigClassId;
    /**
     * 评价人ID       db_column: evaluate_user_id   
     */ 	
	private Integer evaluateUserId;
    /**
     * 维修师傅ID       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 评价星级       db_column: evaluate_star_level   
     */ 	
	private Integer evaluateStarLevel;
    /**
     * 评价内容标签ID       db_column: evaluate_content_label_no   
     */ 	
	private Integer evaluateContentLabelNo;
    /**
     * 评价内容       db_column: evaluate_content   
     */ 	
	private String evaluateContent;
    /**
     * 评价时间       db_column: evaluate_time   
     */ 	
	private java.util.Date evaluateTime;
    /**
     * 备注       db_column: remark   
     */ 	
	private String remark;
    /**
     * 数据创建时间       db_column: screate_time   
     */ 	
	private java.util.Date screateTime;
    /**
     * 数据更新时间       db_column: supdate_time   
     */ 	
	private java.util.Date supdateTime;
    /**
     * 0-隐藏，1-显示       db_column: show_flag   
     */ 	
	private Integer showFlag;
    /**
     * 1:删除 0:未删除       db_column: del_flag   
     */ 	
	private Integer delFlag;
	//columns END


	
	
	public Integer getEvaluateId() {
		return this.evaluateId;
	}
	
	public void setEvaluateId(Integer value) {
		this.evaluateId = value;
	}
	
	
	public Integer getWorkOrderId() {
		return this.workOrderId;
	}
	
	public void setWorkOrderId(Integer value) {
		this.workOrderId = value;
	}
	
	
	public String getFatherOrderNo() {
		return this.fatherOrderNo;
	}
	
	public void setFatherOrderNo(String value) {
		this.fatherOrderNo = value;
	}
	
	
	public Integer getBigClassId() {
		return this.bigClassId;
	}
	
	public void setBigClassId(Integer value) {
		this.bigClassId = value;
	}
	
	
	public Integer getEvaluateUserId() {
		return this.evaluateUserId;
	}
	
	public void setEvaluateUserId(Integer value) {
		this.evaluateUserId = value;
	}
	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getEvaluateStarLevel() {
		return this.evaluateStarLevel;
	}
	
	public void setEvaluateStarLevel(Integer value) {
		this.evaluateStarLevel = value;
	}
	
	
	public Integer getEvaluateContentLabelNo() {
		return this.evaluateContentLabelNo;
	}
	
	public void setEvaluateContentLabelNo(Integer value) {
		this.evaluateContentLabelNo = value;
	}
	
	
	public String getEvaluateContent() {
		return this.evaluateContent;
	}
	
	public void setEvaluateContent(String value) {
		this.evaluateContent = value;
	}
	
	
	public java.util.Date getEvaluateTime() {
		return this.evaluateTime;
	}
	
	public void setEvaluateTime(java.util.Date value) {
		this.evaluateTime = value;
	}
	
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
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
	
	
	public Integer getShowFlag() {
		return this.showFlag;
	}
	
	public void setShowFlag(Integer value) {
		this.showFlag = value;
	}
	
	
	public Integer getDelFlag() {
		return this.delFlag;
	}
	
	public void setDelFlag(Integer value) {
		this.delFlag = value;
	}
	

	

}

