package com.ecej.esmart.model.v4;

import com.ecej.esmart.model.dto.input.PathPlanning;
import com.ecej.esmart.model.dto.input.PathPlanningInput;

public class CacheShare implements java.io.Serializable {

    /**
     * 路径规划
     */
    PathPlanning pathPlanningInput = new PathPlanning();

    /**
     * v4 工单表
     */
    EsmartWorkOrder esmartWorkOrder = new EsmartWorkOrder();


    public PathPlanning getPathPlanningInput() {
        return pathPlanningInput;
    }

    public void setPathPlanningInput(PathPlanning pathPlanningInput) {
        this.pathPlanningInput = pathPlanningInput;
    }

    public EsmartWorkOrder getEsmartWorkOrder() {
        return esmartWorkOrder;
    }

    public void setEsmartWorkOrder(EsmartWorkOrder esmartWorkOrder) {
        this.esmartWorkOrder = esmartWorkOrder;
    }

}
