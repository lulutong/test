package com.ecej.esmart.model.v4;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 按小区统计订单数量
 */
public class OrderCountByCommunityResult implements Serializable {

    private String communityName = "";
    private BigDecimal longitude;
    private BigDecimal latitude;
    private Integer num;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
