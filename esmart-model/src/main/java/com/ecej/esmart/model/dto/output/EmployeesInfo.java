package com.ecej.esmart.model.dto.output;

public class EmployeesInfo implements java.io.Serializable {

	
	
	private static final long serialVersionUID = -4353930545108120155L;
	/**
     * 员工ID
     */
    private Integer empId;
//    /**
//     * 服务站ID
//     */
//    private Integer stationId;
    /**
     * 手机号
     */
    private String mobileNo;
//    /**
//     * 头像
//     */
//    private String headImage;
    /**
     * 姓名
     */
    private String empName;
//    /**
//     * 可选状态
//     */
//    private int optionalState;
//    /**
//     * 所属公司ID
//     */
//    private Integer theirCompanyId;
//    /**
//     * 服务公司ID
//     */
//    private Integer serviceCompanyId;
//    /**
//     * 站长ID
//     */
//    private Integer stationHeadId;
//    /**
//     * 优选公式计算总分
//     */
//    private double score;
//    /**
//     * 异常状态码
//     */
//    private List<Integer> code;

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
}
