package com.ecej.esmart.model.ecejservice.engine.input;


/**
 * <p>
 *     查询员工关联的服务区域
 * </p>
 *
 * @Author kevin
 * @Date 2018-10-30
 */
public class EmpCorrelationAreaInput implements java.io.Serializable {
    private static final long serialVersionUID = 936372403079659022L;

    /**
     * 员工ID
     */
    private Integer empId;
    /**
     * 手机号
     */
    private String phone;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

