package com.ecej.esmart.model.dto.output;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.sql.Date;

public class RecommEmpList implements java.io.Serializable,Comparable<RecommEmpList>{

	private static final long serialVersionUID = -2750580914780341845L;
	
	
    //员工ID
    private Integer empId;
    //手机号
    private String mobileNo;
    //姓名
    private String empName;
    //头像
    private String headImage;
    //服务站ID
    private Integer stationId;
    //站长ID
    private Integer stationHeadId;
    //星级
    private Double starLevel = 0.0;
    //员工评价总分数
    private Integer evaluateTotalScore;
    //员工评价总单数
    private Integer evaluateSum;
    //使用过 0未使用   1使用过
    private int used = 0;
    //服务次数
  	private Integer serviceNum;
  	//省份
  	private String province;
  	//生日
  	private Date birthday;
  	//年龄
  	private Integer age;
  	//选中状态
  	private int lock;
  	
	public Integer getEvaluateTotalScore() {
		return evaluateTotalScore;
	}

	public Integer getEvaluateSum() {
		return evaluateSum;
	}

	public void setStarLevel(Double starLevel) {
		this.starLevel = starLevel;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public Integer getStationId() {
		return stationId;
	}

	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}

	public Integer getStationHeadId() {
		return stationHeadId;
	}

	public void setStationHeadId(Integer stationHeadId) {
		this.stationHeadId = stationHeadId;
	}

	public void setEvaluateTotalScore(Integer evaluateTotalScore) {
		this.evaluateTotalScore = evaluateTotalScore;
	}

	public void setEvaluateSum(Integer evaluateSum) {
		this.evaluateSum = evaluateSum;
	}

	public Double getStarLevel() {
		
		if(evaluateTotalScore != null && evaluateSum != null && evaluateTotalScore != 0 && evaluateSum != 0){
			starLevel = new BigDecimal((float)evaluateTotalScore/evaluateSum).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}
		
		return starLevel;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}
	
	@Override
	public int compareTo(RecommEmpList arg0) {
		
		
		if(arg0.getUsed() > getUsed()){
			return 1;
		}else if(arg0.getUsed() < getUsed()){
			return -1;
		}else if(getUsed() == 1 && (arg0.getServiceNum().compareTo(getServiceNum()) != 0)){
			return arg0.getServiceNum().compareTo(getServiceNum());
		}else if (getUsed() == 0 && (arg0.getStarLevel().compareTo(getStarLevel()) != 0)){
			return arg0.getStarLevel().compareTo(getStarLevel());
		}else{
			return RandomUtils.nextInt(0,3) -1;
		}
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Integer getServiceNum() {
		
		if(serviceNum == null)
			serviceNum = 0;
		return serviceNum;
	}

	public void setServiceNum(Integer serviceNum) {
		this.serviceNum = serviceNum;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getLock() {
		return lock;
	}

	public void setLock(int lock) {
		this.lock = lock;
	}

}
