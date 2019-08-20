package com.ecej.esmart.model.ecejservice.engine.output;


import java.util.List;

/**
 * <p>
 *     查询订单技能标签
 * </p>
 *
 * @Author kevin
 * @Date 2018-10-30
 */
public class OrderSkillLabelOutput implements java.io.Serializable {
    private static final long serialVersionUID = 936372403079659022L;

    private List<Integer> skillLabelIds;

    public List<Integer> getSkillLabelIds() {
        return skillLabelIds;
    }

    public void setSkillLabelIds(List<Integer> skillLabelIds) {
        this.skillLabelIds = skillLabelIds;
    }
}
