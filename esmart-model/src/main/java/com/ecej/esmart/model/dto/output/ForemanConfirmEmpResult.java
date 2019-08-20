    package com.ecej.esmart.model.dto.output;

import java.io.Serializable;

    /**
     * 工长--改派出参实体
     * cxz
     * 2018/6/22 日期
     */
    public class ForemanConfirmEmpResult implements Serializable {
        private Integer workerId;

        public Integer getWorkerId() {
            return workerId;
        }

        public void setWorkerId(Integer workerId) {
            this.workerId = workerId;
        }
    }
