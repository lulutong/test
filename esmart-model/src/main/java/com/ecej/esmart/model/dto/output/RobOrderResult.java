package com.ecej.esmart.model.dto.output;

import com.ecej.nove.base.po.BasePo;

public class RobOrderResult extends BasePo {

    private boolean success;

    public RobOrderResult() {
    }

    public RobOrderResult(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
