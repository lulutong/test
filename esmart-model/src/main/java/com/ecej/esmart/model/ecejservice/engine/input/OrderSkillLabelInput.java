package com.ecej.esmart.model.ecejservice.engine.input;


/**
 * <p>
 *     查询订单技能标签
 * </p>
 *
 * @Author kevin
 * @Date 2018-10-30
 */
public class OrderSkillLabelInput implements java.io.Serializable {
    private static final long serialVersionUID = 936372403079659022L;

    /**
     * 订单号
     */
    private String workOrderNo;

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }
}

