package com.ecej.esmart.model.po;

import com.ecej.nove.base.po.BasePo;

/**
 * 手动同步数据到sap的入参实体
 * cxz
 * 2018/8/21 日期
 */
public class ManualSynSAPInputPo extends BasePo {
    /*
     *1:同步收费信息到sap;2:同步对账文件信息到sap
     */
    private Integer synType;

    public Integer getSynType() {
        return synType;
    }

    public void setSynType(Integer synType) {
        this.synType = synType;
    }
}
