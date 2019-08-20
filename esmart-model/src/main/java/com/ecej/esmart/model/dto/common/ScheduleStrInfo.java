package com.ecej.esmart.model.dto.common;

/**
 * <p>
 *     订单开始时间和结束时间对应的字符串在排班中的位置信息
 *     不包含跨档期的
 *     清除师傅两分钟预占使用
 * </p>
 *
 * @author kevin
 * @create 2018-03-15 10:20
 **/
public class ScheduleStrInfo {
    /**
     *  开始位置 由0开始
     */
    private Integer beginLocation;
    /**
     *  字符串长度
     */
    private Integer length;

    /**
     * 字符串由什么组成
     * 包含：0 3 4等
     */
    private char locationChar;

    public Integer getBeginLocation() {
        return beginLocation;
    }

    public void setBeginLocation(Integer beginLocation) {
        this.beginLocation = beginLocation;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public char getLocationChar() {
        return locationChar;
    }

    public void setLocationChar(char locationChar) {
        this.locationChar = locationChar;
    }
}
