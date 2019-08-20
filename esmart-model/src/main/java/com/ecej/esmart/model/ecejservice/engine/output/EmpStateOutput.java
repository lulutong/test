package com.ecej.esmart.model.ecejservice.engine.output;


/**
 * <p>
 *     查询员工接单状态
 * </p>
 *
 * @Author kevin
 * @Date 2018-10-30
 */
public class EmpStateOutput implements java.io.Serializable {
    private static final long serialVersionUID = 936372403079659022L;

    /**
     * 员工可用状态 true:可用 false:不可用
     */
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}

