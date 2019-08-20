package com.ecej.esmart.model.dto.common;


/**
 * 描述: 
 * @author: yanpenglei
 * @create: 2018/3/5 14:56 
 */
public class ServiceClassAndNum implements java.io.Serializable{
    
	private static final long serialVersionUID = -5685638142544197490L;

	/**
     * 服务品类
     */

	private Integer serviceclassId;

    /**
     * 数量
     */
	private Integer num;


    public Integer getServiceclassId() {
        return serviceclassId;
    }

    public void setServiceclassId(Integer serviceclassId) {
        this.serviceclassId = serviceclassId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
