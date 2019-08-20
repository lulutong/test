
package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

public class SvcEmployeePo extends BasePo {
	private static final long serialVersionUID = 1L;
	//alias
	public static final String TABLE_ALIAS = "SvcEmployee";
	

	//columns START
    /**
     * 员工ID       db_column: emp_id   
     */ 	
	private Integer empId;
    /**
     * 父账户员工id(0:为主账户,其他:主账户id)       db_column: parent_emp_id   
     */ 	
	private Integer parentEmpId;
    /**
     * 员工账户类型(1:主账户,2:子账户)       db_column: emp_account_type   
     */ 	
	private Integer empAccountType;
    /**
     * 服务站ID       db_column: station_id   
     */ 	
	private Integer stationId;
    /**
     * 员工编号       db_column: emp_no   
     */ 	
	private String empNo;
    /**
     * 手机号       db_column: mobile_no   
     */ 	
	private String mobileNo;
    /**
     * 登录名       db_column: login_name   
     */ 	
	private String loginName;
    /**
     * 密码       db_column: password   
     */ 	
	private String password;
    /**
     * 手势密码       db_column: hand_pwd   
     */ 	
	private String handPwd;
    /**
     * 手势密码开启flag(0-不开启 1-开启)       db_column: hand_pwd_enable_flag   
     */ 	
	private Integer handPwdEnableFlag;
    /**
     * 证件类型       db_column: credential_tpye   
     */ 	
	private Integer credentialTpye;
    /**
     * 证件编号       db_column: credential_no   
     */ 	
	private String credentialNo;
    /**
     * 入职时间       db_column: entry_time   
     */ 	
	private java.util.Date entryTime;
    /**
     * 紧急联系人       db_column: emergency_contact   
     */ 	
	private String emergencyContact;
    /**
     * 民族       db_column: nation   
     */ 	
	private Integer nation;
    /**
     * 政治面貌       db_column: political_status   
     */ 	
	private Integer politicalStatus;
    /**
     * 婚姻状况       db_column: marital_status   
     */ 	
	private Integer maritalStatus;
    /**
     * 头像       db_column: head_image   
     */ 	
	private String headImage;
    /**
     * 姓名       db_column: emp_name   
     */ 	
	private String empName;
    /**
     * 城市id       db_column: city_id   
     */ 	
	private Integer cityId;
    /**
     * 邮箱       db_column: email   
     */ 	
	private String email;
    /**
     * 紧急联系方式       db_column: emergency_mobile   
     */ 	
	private String emergencyMobile;
    /**
     * 家庭住址       db_column: famliy_address   
     */ 	
	private String famliyAddress;
    /**
     * 性别       db_column: gender   
     */ 	
	private Integer gender;
    /**
     * 生日       db_column: birthday   
     */ 	
	private java.util.Date birthday;
    /**
     * 删除flag(1 未删除；0已删除)       db_column: delete_flag   
     */ 	
	private Integer deleteFlag;
    /**
     * 员工状态（0-启用 1-禁用）       db_column: emp_status   
     */ 	
	private Integer empStatus;
    /**
     * 在职状态(1:在职,2:离职)       db_column: service_status   
     */ 	
	private Integer serviceStatus;
    /**
     * 离职日期       db_column: abdicate_date   
     */ 	
	private java.util.Date abdicateDate;
    /**
     * 身份标识(1- 员工 2 -运营后台3-第三方财务 4-营业厅主管 5-营业员 6-站长 7-呼叫中心 )       db_column: identity_flag   
     */ 	
	private Integer identityFlag;
    /**
     * 创建时间       db_column: create_time   
     */ 	
	private java.util.Date createTime;
    /**
     * 创建人       db_column: create_user   
     */ 	
	private Integer createUser;
    /**
     * 修改时间       db_column: update_time   
     */ 	
	private java.util.Date updateTime;
    /**
     * 修改人       db_column: update_user   
     */ 	
	private Integer updateUser;
    /**
     * 多能工平台编号       db_column: multi_skill_emp_plat_no   
     */ 	
	private String multiSkillEmpPlatNo;
    /**
     * 人员分配状态(0:待分配 1:待接收 2:已经接收3:已退回)       db_column: emp_distribute_status   
     */ 	
	private Integer empDistributeStatus;
    /**
     * 接单状态(0:停止接单 1:开始接单 2-暂停接单)       db_column: receive_order_status   
     */ 	
	private Integer receiveOrderStatus;
    /**
     * 个人额定工作负荷系数       db_column: work_load_factor   
     */ 	
	private java.math.BigDecimal workLoadFactor;
    /**
     * 密码错误次数       db_column: pwd_error_count   
     */ 	
	private Integer pwdErrorCount;
    /**
     * 最后登录时间       db_column: last_login_time   
     */ 	
	private java.util.Date lastLoginTime;
    /**
     * 所属公司ID       db_column: their_company_id   
     */ 	
	private Integer theirCompanyId;
    /**
     * 服务公司ID       db_column: service_company_id   
     */ 	
	private Integer serviceCompanyId;
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
     * 1:合同工,2:非合同工       db_column: emp_type   
     */ 	
	private Integer empType;
    /**
     * 员工分类(1:自营工,2:平台工 3:半自营)       db_column: emp_cat   
     */ 	
	private Integer empCat;
    /**
     * 工资卡开户行       db_column: salary_card_bank_name   
     */ 	
	private String salaryCardBankName;
    /**
     * 工资卡卡号       db_column: salary_card_no   
     */ 	
	private String salaryCardNo;
	//columns END


	
	
	public Integer getEmpId() {
		return this.empId;
	}
	
	public void setEmpId(Integer value) {
		this.empId = value;
	}
	
	
	public Integer getParentEmpId() {
		return this.parentEmpId;
	}
	
	public void setParentEmpId(Integer value) {
		this.parentEmpId = value;
	}
	
	
	public Integer getEmpAccountType() {
		return this.empAccountType;
	}
	
	public void setEmpAccountType(Integer value) {
		this.empAccountType = value;
	}
	
	
	public Integer getStationId() {
		return this.stationId;
	}
	
	public void setStationId(Integer value) {
		this.stationId = value;
	}
	
	
	public String getEmpNo() {
		return this.empNo;
	}
	
	public void setEmpNo(String value) {
		this.empNo = value;
	}
	
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String value) {
		this.mobileNo = value;
	}
	
	
	public String getLoginName() {
		return this.loginName;
	}
	
	public void setLoginName(String value) {
		this.loginName = value;
	}
	
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	
	public String getHandPwd() {
		return this.handPwd;
	}
	
	public void setHandPwd(String value) {
		this.handPwd = value;
	}
	
	
	public Integer getHandPwdEnableFlag() {
		return this.handPwdEnableFlag;
	}
	
	public void setHandPwdEnableFlag(Integer value) {
		this.handPwdEnableFlag = value;
	}
	
	
	public Integer getCredentialTpye() {
		return this.credentialTpye;
	}
	
	public void setCredentialTpye(Integer value) {
		this.credentialTpye = value;
	}
	
	
	public String getCredentialNo() {
		return this.credentialNo;
	}
	
	public void setCredentialNo(String value) {
		this.credentialNo = value;
	}
	
	
	public java.util.Date getEntryTime() {
		return this.entryTime;
	}
	
	public void setEntryTime(java.util.Date value) {
		this.entryTime = value;
	}
	
	
	public String getEmergencyContact() {
		return this.emergencyContact;
	}
	
	public void setEmergencyContact(String value) {
		this.emergencyContact = value;
	}
	
	
	public Integer getNation() {
		return this.nation;
	}
	
	public void setNation(Integer value) {
		this.nation = value;
	}
	
	
	public Integer getPoliticalStatus() {
		return this.politicalStatus;
	}
	
	public void setPoliticalStatus(Integer value) {
		this.politicalStatus = value;
	}
	
	
	public Integer getMaritalStatus() {
		return this.maritalStatus;
	}
	
	public void setMaritalStatus(Integer value) {
		this.maritalStatus = value;
	}
	
	
	public String getHeadImage() {
		return this.headImage;
	}
	
	public void setHeadImage(String value) {
		this.headImage = value;
	}
	
	
	public String getEmpName() {
		return this.empName;
	}
	
	public void setEmpName(String value) {
		this.empName = value;
	}
	
	
	public Integer getCityId() {
		return this.cityId;
	}
	
	public void setCityId(Integer value) {
		this.cityId = value;
	}
	
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	
	public String getEmergencyMobile() {
		return this.emergencyMobile;
	}
	
	public void setEmergencyMobile(String value) {
		this.emergencyMobile = value;
	}
	
	
	public String getFamliyAddress() {
		return this.famliyAddress;
	}
	
	public void setFamliyAddress(String value) {
		this.famliyAddress = value;
	}
	
	
	public Integer getGender() {
		return this.gender;
	}
	
	public void setGender(Integer value) {
		this.gender = value;
	}
	
	
	public java.util.Date getBirthday() {
		return this.birthday;
	}
	
	public void setBirthday(java.util.Date value) {
		this.birthday = value;
	}
	
	
	public Integer getDeleteFlag() {
		return this.deleteFlag;
	}
	
	public void setDeleteFlag(Integer value) {
		this.deleteFlag = value;
	}
	
	
	public Integer getEmpStatus() {
		return this.empStatus;
	}
	
	public void setEmpStatus(Integer value) {
		this.empStatus = value;
	}
	
	
	public Integer getServiceStatus() {
		return this.serviceStatus;
	}
	
	public void setServiceStatus(Integer value) {
		this.serviceStatus = value;
	}
	
	
	public java.util.Date getAbdicateDate() {
		return this.abdicateDate;
	}
	
	public void setAbdicateDate(java.util.Date value) {
		this.abdicateDate = value;
	}
	
	
	public Integer getIdentityFlag() {
		return this.identityFlag;
	}
	
	public void setIdentityFlag(Integer value) {
		this.identityFlag = value;
	}
	
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	
	public Integer getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(Integer value) {
		this.createUser = value;
	}
	
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	
	
	public Integer getUpdateUser() {
		return this.updateUser;
	}
	
	public void setUpdateUser(Integer value) {
		this.updateUser = value;
	}
	
	
	public String getMultiSkillEmpPlatNo() {
		return this.multiSkillEmpPlatNo;
	}
	
	public void setMultiSkillEmpPlatNo(String value) {
		this.multiSkillEmpPlatNo = value;
	}
	
	
	public Integer getEmpDistributeStatus() {
		return this.empDistributeStatus;
	}
	
	public void setEmpDistributeStatus(Integer value) {
		this.empDistributeStatus = value;
	}
	
	
	public Integer getReceiveOrderStatus() {
		return this.receiveOrderStatus;
	}
	
	public void setReceiveOrderStatus(Integer value) {
		this.receiveOrderStatus = value;
	}
	
	
	public java.math.BigDecimal getWorkLoadFactor() {
		return this.workLoadFactor;
	}
	
	public void setWorkLoadFactor(java.math.BigDecimal value) {
		this.workLoadFactor = value;
	}
	
	
	public Integer getPwdErrorCount() {
		return this.pwdErrorCount;
	}
	
	public void setPwdErrorCount(Integer value) {
		this.pwdErrorCount = value;
	}
	
	
	public java.util.Date getLastLoginTime() {
		return this.lastLoginTime;
	}
	
	public void setLastLoginTime(java.util.Date value) {
		this.lastLoginTime = value;
	}
	
	
	public Integer getTheirCompanyId() {
		return this.theirCompanyId;
	}
	
	public void setTheirCompanyId(Integer value) {
		this.theirCompanyId = value;
	}
	
	
	public Integer getServiceCompanyId() {
		return this.serviceCompanyId;
	}
	
	public void setServiceCompanyId(Integer value) {
		this.serviceCompanyId = value;
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
	
	
	public Integer getEmpType() {
		return this.empType;
	}
	
	public void setEmpType(Integer value) {
		this.empType = value;
	}
	
	
	public Integer getEmpCat() {
		return this.empCat;
	}
	
	public void setEmpCat(Integer value) {
		this.empCat = value;
	}
	
	
	public String getSalaryCardBankName() {
		return this.salaryCardBankName;
	}
	
	public void setSalaryCardBankName(String value) {
		this.salaryCardBankName = value;
	}
	
	
	public String getSalaryCardNo() {
		return this.salaryCardNo;
	}
	
	public void setSalaryCardNo(String value) {
		this.salaryCardNo = value;
	}
	

	

}

